package com.piotr.controller;

import com.piotr.model.Exam;
import com.piotr.model.Question;
import com.piotr.model.Result;
import com.piotr.model.User;
import com.piotr.service.ExamService;
import com.piotr.service.QuestionService;
import com.piotr.service.ResultService;
import com.piotr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jalos on 13.05.2016.
 */


@Controller
public class ExamController {
    @Autowired
    ResultService resultService;
    @Autowired
    ExamService examService;
    @Autowired
    QuestionService questionService;
    @Autowired
    UserService userService;
    @RequestMapping(value = {"/","/exams"}, method = RequestMethod.GET)
    public String getExamListView(Model model) {
        List<Exam> exams = examService.findAll();
        model.addAttribute("ExamsList", exams);
        return "exam-list";


    }
    @RequestMapping(value = "/take-exam/{id}", method = RequestMethod.GET)
    public String takeExamView(@PathVariable("id") Long examId, Model model) {
        Exam exam = examService.findOne(examId);
        List<Question> questions = questionService.findByExamId(examId);
        model.addAttribute("question",questions.get(0));
        Result result= new Result();
        User user= userService.findOne(1L);
        result.setExam(exam);
        result.setUser(user);
        resultService.save(result);
        return "Question";




}


}
