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

 public Question getQuestion() {
  return question;
 }

 public void setQuestion(Question question) {
  this.question = question;
 }

 public User getUser() {
  return user;
 }

 public void setUser(User user) {
  this.user = user;
 }

 public Answer getAnswer() {
  return answer;
 }

 public void setAnswer(Answer answer) {
  this.answer = answer;
 }

 public AnswerGiven() {
 }

 public AnswerGiven(Question question, User user, Answer answer) {
  this.question = question;
  this.user = user;
  this.answer = answer;
 }
}
