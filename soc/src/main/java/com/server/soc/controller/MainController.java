package com.server.soc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return new ResponseEntity<>(new String("Working!!!"), HttpStatus.ACCEPTED);
    }

}
