package com.server.soc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return new ResponseEntity<>(new String("Working!!!"), HttpStatus.ACCEPTED);
    }

    @GetMapping("/")
    public String getMethodName(HttpServletRequest request, Model model) {
        return "home";
    }

    @GetMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        return "login";
    }
    
    

}
