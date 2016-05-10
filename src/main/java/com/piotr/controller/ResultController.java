package com.piotr.controller;

import com.piotr.model.Answer;
import com.piotr.model.Result;
import com.piotr.service.AnswerService;
import com.piotr.service.ResultService;
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
public class ResultController {
/*
    @Autowired
    private ResultService resultService;
    @RequestMapping(value = "/ResultsListServletMapping",method= RequestMethod.GET)
    public String getResultListView(Model model)  throws SQLException {
        List<Result> results=ResultService.findAll();
        model.addAttribute("ResultsLoop",results);
        return "Result-list";


    }
    //--------------
    @RequestMapping(value = "/Result-create", method = RequestMethod.GET)
    public String getCreateResultView() {
        return "Result-create";
    }

    @RequestMapping(value = "/Result-create", method = RequestMethod.POST)
    public String create(@RequestParam(value = "score") Long score,
                         @RequestParam(value = "exam_id") String exam_id,
                         @RequestParam(value = "user_id") String user_id) throws SQLException, ParseException {

        Result result= new Result(score, exam_id,user_id);
        resultService.save(result);

        return "redirect:/resultsListServletMapping";
    }


    @RequestMapping(value = "/result-edit", method = RequestMethod.GET)
    public String getResultEdit(Model model,
                                @RequestParam(value = "id") Long id) throws SQLException {


        Result result = resultService.findOne(id);
        model.addAttribute("result", result);
        return "result-edit";


    }

    @RequestMapping(value = "/result-edit", method = RequestMethod.POST)
    public String update(@RequestParam(value = "score") Long score,
                         @RequestParam(value = "exam_id") String exam_id,
                         @RequestParam(value = "user_id") String user_id) throws SQLException, ParseException {



        Result result= new Result(score, exam_id,user_id);
        resultService.save(result);
        return "redirect:/resultListServletMapping";
    }

    @RequestMapping(value = "/deleteResultAction", method = RequestMethod.POST)
    public String delete(@RequestParam(value = "id") Long id) throws SQLException {

        resultService.delete(id);
        return "redirect:/resultsListServletMapping";

    }
    */}


