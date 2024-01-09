package com.quize.controller;

import com.quize.entities.Quiz;
import com.quize.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    //create
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz Create(@RequestBody Quiz quiz){
        return quizService.add(quiz);

    }


    //getAll
    @GetMapping
    public List<Quiz> getAll(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id){
        return quizService.get(id);
    }



}
