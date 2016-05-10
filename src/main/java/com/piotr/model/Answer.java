package com.piotr.model;

import javax.persistence.*;

/**
 * Created by jalos on 22.04.2016.
 */

@Entity
@Table(name="Answer")
public class Answer extends BaseEntity {

    @ManyToOne
    @JoinColumn(name="question_id")
    private Question question;

    @Column(name="answerContent")
    private String answerContent;

    @Column(name="isCorrect")
    private String isCorrect;

    @Column(name="isWrong")
    private String isWrong;



}


