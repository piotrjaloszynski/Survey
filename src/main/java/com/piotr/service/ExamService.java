package com.piotr.service;

import com.piotr.model.Exam;

import java.util.List;

/**
 * Created by jalos on 30.04.2016.
 */
public interface ExamService {
    List<Exam> findAll();
   Exam findOne(Long examid); // definicja metody  1 2 3 , 1 typ zwracany , nazwa , lista paramentru
}
