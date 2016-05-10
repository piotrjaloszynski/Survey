package com.piotr.dao;

import com.piotr.model.BaseEntity;
import com.piotr.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jalos on 30.04.2016.
 */



    @Repository
    public interface ExamDao extends JpaRepository<Exam,Long> {

    }
