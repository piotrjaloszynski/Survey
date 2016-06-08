package com.piotr.service;

import com.piotr.model.Answer;
import com.piotr.model.AnswerGiven;

import java.util.List;

/**
 * Created by jalos on 30.04.2016.
 */
public interface AnswerGivenService {

    void save(AnswerGiven answerGiven);// nic nie ma zwracac
    void saveAllAnswers(Long userId,Long questionId,Long[] answerIds);
    List<AnswerGiven> findByQuestionIdAndUserId(Long questionId,Long userId);

}
