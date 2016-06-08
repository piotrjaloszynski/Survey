package com.piotr.service.Impl;

import com.piotr.dao.ExamDao;
import com.piotr.dao.QuestionDao;
import com.piotr.model.Exam;
import com.piotr.model.Question;
import com.piotr.service.QuestionService;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

/**
 * Created by jalos on 02.05.2016.
 */

@Service
public class QuestionServiceImpl implements QuestionService {
// idzie tylko sygnatura metody , nie moze  byc
    // cialo i srednik !!!!!

    @Autowired
    private QuestionDao questionDao;

    @Override
    public List<Question> findAll(){// znajdz wszystkie pytania
List<Question> questions=questionDao.findAll();
return questions;
}
    @Override
    public Question findOne(Long id) {
        Question question=questionDao.findOne(id); //serwis gada z dao  a dao
        //  ma gadac z dao

        return question;
    }

    @Override
    public void delete(Long id) {
        questionDao.delete(id);

    }

    @Override
   public List<Question> findByExamId (Long examId){

      return questionDao.findByExamId(examId);

    }

    @Override
    public Question nextQuestion(Long questionId, Long examId) {
        List<Question> questions = questionDao.findByExamId(examId);
        for (int i = 0; i < questions.size(); i++) {
            if (questionId.equals(questions.get(i).getId())) {

                if ( (i+1) < questions.size()) {
                    return questions.get(i + 1);
                }

            }

        }
        return null;
    }

}




