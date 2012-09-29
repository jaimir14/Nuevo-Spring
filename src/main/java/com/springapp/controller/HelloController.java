package com.springapp.controller;


import org.jboss.logging.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class HelloController {
    protected final Logger logger = Logger.getLogger(getClass());

    @RequestMapping("/hello.html")
    public String handleRequest(Model model) {

        logger.debug("Returning index view");
        model.addAttribute("message", "HELLO!!!");
        return "hello";
    }
}
