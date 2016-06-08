package com.piotr.service;

import com.piotr.model.Question;
import com.piotr.model.Result;

import java.util.List;

/**
 * Created by jalos on 30.04.2016.
 */
public interface ResultService {
    void save(Result result);
 Result findByExamIdAndUserId(Long examId,Long userId);
   double calculateScore(Long userId,Long examId );

}
