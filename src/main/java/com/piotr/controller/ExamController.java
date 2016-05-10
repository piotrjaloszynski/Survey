package com.piotr.controller;

import com.piotr.model.Answer;

import com.piotr.model.Exam;
import com.piotr.service.AnswerService;
import com.piotr.service.ExamService;
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
public class ExamController {
    @Autowired
    private ExamService examService;

    @RequestMapping(value = {"/","/exams"}, method = RequestMethod.GET)
    public String getExamListView(Model model) throws SQLException {
        List<Exam> exams = examService.findAll();
        model.addAttribute("ExamsList", exams);
        return "exam-list";


    }
    /*

    //-------------- METODY  ROBIMY  TAK JAK POTRZEBUEJMY NIE UPFRONT  CRUD
    @RequestMapping(value = "/Exam-create", method = RequestMethod.GET)
    public String getCreateExamView() {
        return "Exam-create";
    }

    @RequestMapping(value = "/Exam-create", method = RequestMethod.POST)
    public String create(@RequestParam(value = "passRate") String passRate,
                         @RequestParam(value = "nameOfExam") String nameOfExam,
                         @RequestParam(value = "id") Long id) throws SQLException, ParseException {

        Exam exam = new Exam(passRate, nameOfExam, id);
        examService.save(exam);

        return "redirect:/examsListServletMapping";
    }


    @RequestMapping(value = "/exam-edit", method = RequestMethod.GET)
    public String getExamrEdit(Model model,
                                @RequestParam(value = "id") Long id) throws SQLException {


        Exam exam = examService.findOne(id);
        model.addAttribute("exam", exam);
        return "exam-edit";


    }

    @RequestMapping(value = "/exam-edit", method = RequestMethod.POST)
    public String create(@RequestParam(value = "passRate") String passRate,
                         @RequestParam(value = "nameOfExam") String nameOfExam,
                         @RequestParam(value = "id") Long id) throws SQLException, ParseException {


        Exam exam= new Exam(passRate, nameOfExam, id);
        examService.save(exam);
        return "redirect:/examListServletMapping";
    }

    @RequestMapping(value = "/deleteExamAction", method = RequestMethod.POST)
    public String delete(@RequestParam(value = "id") Long id) throws SQLException {

        examService.delete(id);
        return "redirect:/examsListServletMapping";

    }*/
}
