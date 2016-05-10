package com.piotr.service;

import com.piotr.model.Exam;

import java.util.List;

/**
 * Created by jalos on 30.04.2016.
 */
public interface ExamService {
    List<Exam> findAll();
}
