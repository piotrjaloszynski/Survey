package com.piotr.dto;

/**
 * Created by jalos on 13.06.2016.
 */
public class ExamUserResult {
    private String examName;
    private Long examId;
    private String status;

    public ExamUserResult(String examName, Long examId, String status) {
        this.examName = examName;
        this.examId = examId;
        this.status = status;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
