package com.piotr.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jalos on 22.04.2016.
 */
@Entity
@Table(name="question")
public class Question extends BaseEntity {
@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)

private List<Answer> answers;

    @Column(name="questionContent")
    private String questionContent;
    @ManyToOne ()
    @JoinColumn(name="exam_id")
    private Exam exam;

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}

