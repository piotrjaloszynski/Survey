package com.piotr.service.Impl;

import com.piotr.dao.ResultDao;
import com.piotr.model.Answer;
import com.piotr.model.AnswerGiven;
import com.piotr.model.Question;
import com.piotr.model.Result;
import com.piotr.service.AnswerGivenService;
import com.piotr.service.QuestionService;
import com.piotr.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jalos on 02.05.2016.
 */

@Service
public class ResultServiceImpl implements ResultService {
   @Autowired
   private QuestionService questionService;
    @Autowired
    private ResultDao resultDao;

    @Autowired
    AnswerGivenService answerGivenService;

    @Override
    public void save(Result result){// nic nie zwraca void
       resultDao.save(result); // stad zadnych RETURN !!!

    }

    @Override
    public Result findByExamIdAndUserId(Long examId, Long userId) {
        return resultDao.findByExamIdAndUserId(examId, userId);
    }
    @Override
    public double calculateScore(Long userId,Long examId ){
        double score;
        int correctAnswers = 0;
    List<Question> questionList=questionService.findByExamId(examId);
        for(Question question: questionList){
            List<Answer> answers = question.getAnswers();
            List<AnswerGiven> answerGivens = answerGivenService.findByQuestionIdAndUserId(question.getId(), userId);

            boolean questionOk = true;
            for (Answer answer : answers) {
                boolean flaga = false;
                if (answer.getIsCorrect()) {

                    for (AnswerGiven answerGiven : answerGivens) {
                        if (answerGiven.getAnswer().getId().equals(answer.getId())) {
                            flaga = true;
                        }
                    }
                }
                if (!flaga) {
                    questionOk = false;
                }
            }

            if (questionOk) {
                correctAnswers++;
            }
        }

        // musimy miec liste wszystkich pytan dla egzaminu o examID

        // petla przejechac po liscie pytan
        // i dla kazdego pytania z tej listy pobierac liste prawidlowych odpowiedzi
        // i liste odpowiedzi udzielonych przez usera

        // przydzieli punkt za pytanie


        // wynik ilosc punktow / ilosc wszystkich pytan * 100

        return ((double)correctAnswers)/questionList.size() * 100;
    }
}
