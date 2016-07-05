package com.piotr.controller;

import com.piotr.model.AnswerGiven;
import com.piotr.model.Exam;
import com.piotr.model.Question;
import com.piotr.model.User;
import com.piotr.service.AnswerGivenService;
import com.piotr.service.QuestionService;
import com.piotr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by jalos on 17.05.2016.
 */

@Controller
public class QuestionController {
@Autowired
QuestionService questionService;
@Autowired
    AnswerGivenService answerGivenService;
@Autowired
    UserService userService;

    @RequestMapping(value = "/question/{id}", method = RequestMethod.GET)

        public String getQuestionView(@PathVariable("id") Long questionId, Model model) {
            Question question = questionService.findOne(questionId);
                      model.addAttribute("question",question);
                return "Question";//pobieranie pytania ktorego mamy wysweitlic
    }
    @RequestMapping(value="/next-question",method= RequestMethod.POST)
    public String nextQuestionView(
            @RequestParam(name="questionId")Long questionId,
            @RequestParam(name="examId")Long examId,
            @RequestParam ("answers")Long [] answers, Model model,
            RedirectAttributes redirectAttributes){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        User user= userService.findByEmail(name);
       answerGivenService.saveAllAnswers(user.getId(),questionId,answers);
        List<Question> questions=questionService.findByExamId(examId);
        redirectAttributes.addFlashAttribute("allQuestionNumber",questions.size() );

        Question question=questionService.nextQuestion(questionId,examId);
        if(question==null){
            redirectAttributes.addFlashAttribute("examId", examId);
            return "redirect:/result";//24.05.2016
        }
        return "redirect:/question/"+question.getId();

    }


    }




