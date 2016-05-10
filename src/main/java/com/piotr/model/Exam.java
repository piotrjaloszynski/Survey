package com.piotr.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jalos on 22.04.2016.
 */

@Entity
@Table(name="exam")
public class Exam extends BaseEntity {

    // question do exam  nie odwrotnie
    @Column(name="nameOfExam")
    private String nameOfExam;
    @Column (name="passRate")
    private String passRate;
@OneToMany(mappedBy = "exam")
    private List<Result> results;
@OneToMany(mappedBy = "exam")
    private List<Question> questions;
@OneToMany(mappedBy = "exam")
    private List<Survey> surveys;

    public String getNameOfExam() {
        return nameOfExam;
    }

    public void setNameOfExam(String nameOfExam) {
        this.nameOfExam = nameOfExam;
    }

    public String getPassRate() {
        return passRate;
    }

    public void setPassRate(String passRate) {
        this.passRate = passRate;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Survey> getSurveys() {
        return surveys;
    }

    public void setSurveys(List<Survey> surveys) {
        this.surveys = surveys;
    }
}

