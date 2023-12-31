package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Annotations
@Controller
// annotation for endpoint
@RequestMapping("/user")
public class UserController {

    RoleService roleService;
    UserService userService;

    // user controller
    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    //redirect to create page
    @GetMapping("/create")
    public String createUser(Model model){

        // new objects for role and user services
        model.addAttribute("user", new UserDTO());
        // return all roles
        model.addAttribute("roles", roleService.findAll());
        // return to create
        model.addAttribute("users", userService.findAll());
        // return create page
        return "/user/create";
    }

    // Navigate to create page
    @PostMapping("/create")
    public String insertUser(@ModelAttribute("user") UserDTO user, Model model){

//        model.addAttribute("user", new UserDTO());
//        model.addAttribute("roles", roleService.findAll());

        // save info on refresh
        userService.save(user);
//        model.addAttribute("users", userService.findAll());
//        return "/user/create";
        // redirect to same page
        return "redirect:/user/create";
    }
}
