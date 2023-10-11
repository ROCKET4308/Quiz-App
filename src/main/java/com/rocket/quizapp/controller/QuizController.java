package com.rocket.quizapp.controller;

import com.rocket.quizapp.service.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("quiz")
@AllArgsConstructor
public class QuizController {

    private final QuizService quizService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return  quizService.createQuiz(category, numQ, title);
    }
}
