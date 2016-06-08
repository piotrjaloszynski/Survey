package com.piotr.service.Impl;

import com.piotr.dao.AnswerDao;
import com.piotr.dao.AnswerGivenDao;
import com.piotr.dao.QuestionDao;
import com.piotr.dao.UserDao;
import com.piotr.model.Answer;
import com.piotr.model.AnswerGiven;
import com.piotr.model.Question;
import com.piotr.model.User;
import com.piotr.service.AnswerGivenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jalos on 02.05.2016.
 */
@Service
public class AnswerGivenServiceImpl implements AnswerGivenService {
    @Autowired
    private AnswerGivenDao answerGivenDao; //dependency injection ze springa
@Autowired
private UserDao userDao;

    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private AnswerDao answerDao;
    @Override
    public void save(AnswerGiven answerGiven) {
        answerGivenDao.save(answerGiven);

    }

    @Override
    public void saveAllAnswers(Long userId, Long questionId, Long[] answerIds) {
        User user = userDao.findOne(userId);

        Question question=questionDao.findOne(questionId);
        for(Long answerId : answerIds) {
            Answer answer=answerDao.findOne(answerId);
            AnswerGiven answerGiven= new AnswerGiven(question,user,answer);
            save(answerGiven);// metoda stworzy obiekty odpowiedzi stworzonych przez uzytkownika i zapisze do bazy dao
        }


    }

    @Override
    public List<AnswerGiven> findByQuestionIdAndUserId(Long questionId, Long userId){
       return answerGivenDao.findByQuestionIdAndUserId(questionId,userId);

    }
}
