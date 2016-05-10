package com.piotr.dao;

import com.piotr.model.Result;
import com.piotr.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jalos on 30.04.2016.
 */



    @Repository
    public interface SurveyDao  extends JpaRepository<Survey,Long> {

    }

