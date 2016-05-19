package com.piotr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jalos on 17.05.2016.
 */

@Controller
public class QuestionController {


    @RequestMapping(value = "/save-question", method = RequestMethod.POST)
    public String saveQuestion(

            @RequestParam Long id,
            @RequestParam("answers") String[] answers) {
        return "redirect:/question/" + id; // tzn ze przekieruje do kolejnego pytania
    }

    @RequestMapping(value = "/question/{id}", method = RequestMethod.GET)
    public String getQuestionView() {
        return "Question";//pobieranie pytania ktorego mamy wysweitlic
    }
}


