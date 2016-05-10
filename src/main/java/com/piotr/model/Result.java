package com.piotr.model;

import javax.persistence.*;

/**
 * Created by jalos on 22.04.2016.
 */

@Entity
@Table(name = "result")
public class Result extends BaseEntity {

    @Column(name = "score")
    private Double score; // zmienna przecinkowa, takie ktore sie da po przecinku zapisac , mozesz null wpisac

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;

}
