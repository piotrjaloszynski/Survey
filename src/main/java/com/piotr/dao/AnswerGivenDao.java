package com.piotr.dao;

import com.piotr.model.Answer;
import com.piotr.model.AnswerGiven;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jalos on 30.04.2016.
 */



    @Repository
    public interface AnswerGivenDao extends JpaRepository<AnswerGiven,Long> {

    }

