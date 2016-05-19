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


    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(String isCorrect) {
        this.isCorrect = isCorrect;
    }

    public String getIsWrong() {
        return isWrong;
    }

    public void setIsWrong(String isWrong) {
        this.isWrong = isWrong;
    }
}


