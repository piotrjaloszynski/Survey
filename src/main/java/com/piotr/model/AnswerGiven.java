package com.piotr.model;

import javax.persistence.*;

/**
 * Created by jalos on 22.04.2016.
 */
@Entity
@Table(name="AnswerGiven")
public class AnswerGiven extends BaseEntity{
   // mapujemy relacje
    @ManyToOne()
    @JoinColumn(name = "question_id")
    private Question question;
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne()
    @JoinColumn(name = "answer_id")
    private Answer answer;


    }
