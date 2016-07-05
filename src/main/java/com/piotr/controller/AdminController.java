package com.piotr.controller;

import com.piotr.service.ResultService;
import com.piotr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by jalos on 05.07.2016.
 */
@Controller
public class AdminController {
    @Autowired
    ResultService resultService;

    public String getExamHistory(@PathVariable("result")Long )


}
