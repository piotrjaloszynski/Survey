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
@Column(name="correctAnswers")
  private Integer correctAnswers;

    @Column (name="inCorrectAnswers")
    private Integer inCorrectAnswers;

    public Integer getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(Integer correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public Integer getInCorrectAnswers() {
        return inCorrectAnswers;
    }

    public void setInCorrectAnswers(Integer inCorrectAnswers) {
        this.inCorrectAnswers = inCorrectAnswers;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "exam_id")
    private Exam exam;

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
