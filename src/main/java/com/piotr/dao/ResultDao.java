package com.piotr.dao;

import com.piotr.model.Question;
import com.piotr.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jalos on 30.04.2016.
 */


    @Repository
    public interface ResultDao  extends JpaRepository<Result,Long> {
Result findByExamIdAndUserId(Long examId,Long userId);

    }

