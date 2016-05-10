package com.piotr.model;

import javax.persistence.*;

/**
 * Created by jalos on 22.04.2016.
 */

@Entity
@Table( name="survey")
public class Survey extends BaseEntity{


    @Column(name="feedbackText")
 private String feedbackText;


    @Column(name="difficulty")
    private String difficulty;

    @Column(name="likeability")
    private String likeability; // najpierw  te ktore w tabeli pozniej powiazania z innymi

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;



    @ManyToOne
    @JoinColumn(name="exam_id")
    private Exam exam;

}
