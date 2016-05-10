package com.piotr.dao;

import com.piotr.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jalos on 30.04.2016.
 */

@Repository
public interface AnswerDao extends JpaRepository<Answer, Long> {

}

