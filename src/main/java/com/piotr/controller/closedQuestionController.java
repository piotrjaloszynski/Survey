package com.piotr.controller;

import com.piotr.model.Question;
import com.piotr.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jalos on 12.05.2016.
 */
@Controller
public class ClosedQuestionController {
    @Autowired
    private QuestionService questionService;
    @RequestMapping(value="/questionsListServletMapping",method= RequestMethod.GET)
    public String getQuestionListView(Model model){
List<Question> questions=questionService.findAll();
      model.addAttribute("questionslist",questions) ;
        return "question-list";

    }

}
//This String will be interpreted by Spring MVC as the name of the view that
//will be rendered. DispatcherServlet will ask the view resolver to resolve this logical
//      view name into an actual view.
//@RequestMapping
//The @RequestMapping annotations define handlers onto Controller classes and/or onto
//       controller methods. These annotations are looked-up among stereotyped classes by the
//     DispatcherServlet. The main idea behind the @RequestMapping annotations is to
//    define a primary path mapping on the class-level and to narrow HTTP request methods,
//    headers, parameters, and media-types on the methods.
//    To implement this narrowing, the @RequestMapping annotation accepts comma-separated
//      parameters within parentheses.
//    Consider the following example:
//@RequestMapping(value="/server", method=RequestMethod.GET)