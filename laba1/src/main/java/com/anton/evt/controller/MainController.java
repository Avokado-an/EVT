package com.anton.evt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bogdanov-anton")
public class MainController {
    @GetMapping("/helloWorld")
    @ResponseBody
    public String helloWorld() {
        return "helloWorld";
    }

    @GetMapping("/forbidden")
    public ResponseEntity deniedAccess() {
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
