package com.piotr.controller;

import com.piotr.model.Answer;
import com.piotr.model.User;
import com.piotr.service.AnswerService;
import com.piotr.service.UserService;
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
public class UserController {

    /*
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/UsersListServletMapping",method= RequestMethod.GET)
    public String getUserListView(Model model)  throws SQLException {
        List<User> users=UserService.findAll();
        model.addAttribute("UsersLoop",users);
        return "User-list";


    }
    //--------------
    @RequestMapping(value = "/User-create", method = RequestMethod.GET)
    public String getCreateUserView() {
        return "User-create";
    }
    //String name, String surname, String department, String position, String manager, String staff, String AVP, String director, String VP)
    @RequestMapping(value = "/User-create", method = RequestMethod.POST)
    public String create(@RequestParam(value = "name") String name,
                         @RequestParam(value = "surname") String surname,
                         @RequestParam(value = "department") String department,
                         @RequestParam(value = "position") String position,
                         @RequestParam(value = "manager") String manager,
                         @RequestParam(value = " staff") String  staff,
                         @RequestParam(value = " AVP") String  AVP,
                         @RequestParam(value = " director") String  director,
                         @RequestParam(value = "  VP") String   VP,
                         @RequestParam(value = "id") Long id)throws SQLException, ParseException {

       User user= new User(name, surname,department, position,manager,staff,AVP,director,VP,);
       userService.save(user);

        return "redirect:/usersListServletMapping";
    }


    @RequestMapping(value = "/user-edit", method = RequestMethod.GET)
    public String getUserEdit(Model model,
                                @RequestParam(value = "id") Long id) throws SQLException {


        User user = userService.findOne(id);
        model.addAttribute("user", user);
        return "user-edit";


    }

    @RequestMapping(value = "/user-edit", method = RequestMethod.POST)
    public String update(@RequestParam(value = "name") String name,
                         @RequestParam(value = "surname") String surname,
                         @RequestParam(value = "department") String department,
                         @RequestParam(value = "position") String position,
                         @RequestParam(value = "manager") String manager,
                         @RequestParam(value = " staff") String  staff,
                         @RequestParam(value = " AVP") String  AVP,
                         @RequestParam(value = " director") String  director,
                         @RequestParam(value = "  VP") String   VP,
                         @RequestParam(value = "id") Long id)throws SQLException, ParseException {

        User user= new User(name, surname,department, position,manager,staff,AVP,director,VP,);
        userService.save(user);
        return "redirect:/userListServletMapping";
    }

    @RequestMapping(value = "/deleteUserAction", method = RequestMethod.POST)
    public String delete(@RequestParam(value = "id") Long id) throws SQLException {

        userService.delete(id);
        return "redirect:/usersListServletMapping";

    }
    */}


