package com.piotr.controller;

import com.piotr.model.Answer;
import com.piotr.model.AnswerGiven;
import com.piotr.service.AnswerGivenService;
import com.piotr.service.AnswerService;
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
public class AnswerGivenController {
/*
    @Autowired
    private AnswerGivenService answerGivenService;
    @RequestMapping(value = "/AnswersGiverListServletMapping",method= RequestMethod.GET)
    public String getAnswerGiverListView(Model model)  throws SQLException {
        List<AnswerGiven> answersGiver=AnswerGivenService.findAll();
        model.addAttribute("AnswersGiverLoop",answersGiver);
        return "AnswerGiver-list";


    }
    //--------------
    @RequestMapping(value = "/AnswerGiven-create", method = RequestMethod.GET)
    public String getCreateAnswerGivenView() {
        return "AnswerGiver-create";
    }

    @RequestMapping(value = "/AnswerGiven-create", method = RequestMethod.POST)//TODO PUBLIC STRING PONIZEJ
    public String create(@RequestParam(value = "question_id") String question_id,
                         @RequestParam(value = "answer_id") String answer_id,
                         @RequestParam(value = "user_id") String user_id,
                         @RequestParam(value = "id") Long id)throws SQLException, ParseException {

        AnswerGiven answerGiven= new Answer(question_id, answer_id,user_id, id);
        answerGivenService.save(answerGiven);

        return "redirect:/answersGivenListServletMapping";
    }


    @RequestMapping(value = "/answerGiven-edit", method = RequestMethod.GET)
    public String getAnswerGivenEdit(Model model,
                                @RequestParam(value = "id") Long id) throws SQLException {


        Answer answer = answerGivenService.findOne(id);
        model.addAttribute("answerGiven", answerGiven);
        return "AnswerGiven-edit";


    }

    @RequestMapping(value = "/answerGiven-edit", method = RequestMethod.POST)
    public String update(@RequestParam(value = "question_id") String question_id,
                         @RequestParam(value = "answer_id") String answer_id,
                         @RequestParam(value = "user_id") String user_id,
                         @RequestParam(value = "id") Long id)throws SQLException, ParseException {



        AnswerGiven answerGiven= new Answer(question_id, answer_id,user_id, id);
        answerGivenService.save(answerGiven);
        return "redirect:/answerGivenListServletMapping";
    }

    @RequestMapping(value = "/deleteAnswerGivenAction", method = RequestMethod.POST)
    public String delete(@RequestParam(value = "id") Long id) throws SQLException {

        answerGivenService.delete(id);
        return "redirect:/answersGivenListServletMapping";

    }

    */}



