package com.caselab.task.modules.echo.controller;



import com.caselab.task.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NonNull;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/echo")

public class EchoController {
    @GetMapping("/hello")
    public ResponseEntity<@NonNull String> hello() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
