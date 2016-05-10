package com.piotr.model;

import javax.persistence.*;

/**
 * Created by jalos on 22.04.2016.
 */
@Entity
@Table(name="question")
public class Question extends BaseEntity {


    @Column(name="questionContent")
    private String questionContent;
    @ManyToOne ()
    @JoinColumn(name="exam_id")
    private Exam exam;

    }

