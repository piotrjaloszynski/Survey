package com.piotr.dao;

import com.piotr.model.Survey;
import com.piotr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jalos on 30.04.2016.
 */



    @Repository
    public interface UserDao  extends JpaRepository<User,Long> {
    User findByEmail (String email);
    }

//http://docs.spring.io/spring-data/jpa/docs/1.10.1.RELEASE/reference/html/#jpa.query-methods