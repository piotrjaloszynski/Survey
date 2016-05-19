package com.piotr.service;

import com.piotr.model.Question;

import java.util.List;

/**
 * Created by jalos on 30.04.2016.
 */
public interface QuestionService {
    List<Question> findAll();

    Question findOne(Long id) ;

   void delete(Long id);

    List<Question> findByExamId(Long examId);

}