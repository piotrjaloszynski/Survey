package com.piotr.controller;

import com.piotr.model.Answer;
import com.piotr.model.Survey;
import com.piotr.service.AnswerService;
import com.piotr.service.SurveyService;
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
public class SurveyController {
    /*
    @Autowired
    private SurveyService surveyService;
    @RequestMapping(value = "/SurveysListServletMapping",method= RequestMethod.GET)
    public String getSurveyListView(Model model)  throws SQLException {
        List<Survey> surveys=SurveyService.findAll();
        model.addAttribute("SurveysLoop",surveys);
        return "Survey-list";


    }
    //--------------
    @RequestMapping(value = "/Survey-create", method = RequestMethod.GET)
    public String getCreateSurveyView() {
        return "Survey-create";
    }

    @RequestMapping(value = "/Survey-create", method = RequestMethod.POST)
    public String create(@RequestParam(value = "difficulty") String difficulty,
                         @RequestParam(value = "user_id") Long user_id,
                         @RequestParam(value = "exam_id")Long exam_id,
                         @RequestParam(value = "likeability")String  likeability)throws SQLException, ParseException {

        Survey survey= new Survey (difficulty, user_id,exam_id, likeability);
        SurveyService.save(survey);

        return "redirect:/surveysListServletMapping";
    }


    @RequestMapping(value = "/survey-edit", method = RequestMethod.GET)
    public String getAnswerEdit(Model model,
                                @RequestParam(value = "id") Long id) throws SQLException {


        Survey survey = surveyService.findOne(id);
        model.addAttribute("survey", survey);
        return "survey-edit";


    }

    @RequestMapping(value = "/survey-edit", method = RequestMethod.POST)
    public String update(@RequestParam(value = "difficulty") String difficulty,
                         @RequestParam(value = "user_id") Long user_id,
                         @RequestParam(value = "exam_id")Long exam_id,
                         @RequestParam(value = "likeability")String  likeability)throws SQLException, ParseException {



        Survey survey= new Survey (difficulty, user_id,exam_id, likeability);
        surveyService.save(survey);
        return "redirect:/surveyListServletMapping";
    }

    @RequestMapping(value = "/deleteSurveyAction", method = RequestMethod.POST)
    public String delete(@RequestParam(value = "id") Long id) throws SQLException {

        surveyService.delete(id);
        return "redirect:/surveysListServletMapping";

    }
    */
    }

