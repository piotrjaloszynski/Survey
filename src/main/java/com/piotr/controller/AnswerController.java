package com.piotr.controller;

import com.piotr.model.Answer;
import com.piotr.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by jalos on 30.04.2016.
 */


@Controller
public class AnswerController {

    /*
@Autowired
    private AnswerService answerService;
    @RequestMapping(value = "/AnswersListServletMapping",method= RequestMethod.GET)
public String getAnswerListView(Model model)  throws SQLException{
        List<Answer> answers=AnswerService.findAll();
        model.addAttribute("AnswersLoop",answers);
        return "Answer-list";


    }
   //--------------
   @RequestMapping(value = "/Answer-create", method = RequestMethod.GET)
   public String getCreateAnswerView() {
       return "Answer-create";
   }

    @RequestMapping(value = "/Answer-create", method = RequestMethod.POST)
    public String create(@RequestParam(value = "answerContent") String answerContent,
                         @RequestParam(value = "isCorrect") String isCorrect,
                         @RequestParam(value = "isWrong") String isWrong,
                         @RequestParam(value = "question_id") Long question_id)throws SQLException, ParseException {

        Answer answer= new Answer(answerContent, isCorrect,isWrong, question_id);
        answerService.save(answer);

        return "redirect:/answersListServletMapping";
    }


    @RequestMapping(value = "/answer-edit", method = RequestMethod.GET)
    public String getAnswerEdit(Model model,
                                 @RequestParam(value = "id") Long id) throws SQLException {


        Answer answer = answerService.findOne(id);
        model.addAttribute("answer", answer);
        return "answer-edit";


    }

    @RequestMapping(value = "/answer-edit", method = RequestMethod.POST)
    public String update(@RequestParam(value = "answerContent") String answerContent,
                         @RequestParam(value = "isCorrect") String isCorrect,
                         @RequestParam(value = "isWrong") String isWrong,
                         @RequestParam(value="question_id")
                         @RequestParam(value = "id") Long id) throws SQLException, ParseException {



        Answer answer= new Answer(answerContent, isCorrect,isWrong, question_id);
        answerService.save(answer);
        return "redirect:/answerListServletMapping";
    }

    @RequestMapping(value = "/deleteAnswerAction", method = RequestMethod.POST)
    public String delete(@RequestParam(value = "id") Long id) throws SQLException {

        answerService.delete(id);
        return "redirect:/answersListServletMapping";

}

*/}
