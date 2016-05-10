package com.piotr.controller;

import com.piotr.model.Exam;
import com.piotr.model.Question;
import com.piotr.service.ExamService;
import com.piotr.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by jalos on 30.04.2016.
 */

@Controller
public class QuestionController {
    /*
    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/QuestionsListServletMapping", method = RequestMethod.GET)
    public String getQuestionListView(Model model) throws SQLException {
        List<Question> questions = ExamService.findAll();
        model.addAttribute("QuestionsLoop", questions);
        return "Question-list";


    }

    //--------------
    @RequestMapping(value = "/Question-create", method = RequestMethod.GET)
    public String getCreateQuestionView() {
        return "Question-create";
    }

    @RequestMapping(value = "/Question-create", method = RequestMethod.POST)
    public String create(@RequestParam(value = "questionContent") String questionContent,
                         @RequestParam(value = "exam_id") Long exam_id,
                         @RequestParam(value = "id") Long id) throws SQLException, ParseException {

        Exam exam = new Exam(questionContent, exam_id, id);
        questionService.save(question);

        return "redirect:/questionsListServletMapping";
    }


    @RequestMapping(value = "/question-edit", method = RequestMethod.GET)
    public String getQuestionEdit(Model model,
                                @RequestParam(value = "id") Long id) throws SQLException {


        Question question = questionService.findOne(id);
        model.addAttribute("question", question);
        return "question-edit";


    }

    @RequestMapping(value = "/question-edit", method = RequestMethod.POST)
    public String update (@RequestParam(value = "passRate") String passRate,
                         @RequestParam(value = "nameOfExam") String nameOfExam,
                         @RequestParam(value = "id") Long id) throws SQLException, ParseException {


       Question question= new Exam(passRate, nameOfExam, id);
        questionService.save(exam);
        return "redirect:/questionListServletMapping";
    }

    @RequestMapping(value = "/deleteQuestionAction", method = RequestMethod.POST)
    public String delete(@RequestParam(value = "id") Long id) throws SQLException {


        questionService.delete(id);
        return "redirect:/questionsListServletMapping";

    }*/
}




