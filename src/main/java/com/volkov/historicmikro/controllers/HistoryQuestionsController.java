package com.volkov.historicmikro.controllers;


import com.volkov.historicmikro.model.Question;
import com.volkov.historicmikro.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HistoryQuestionsController {

  @Autowired
  private QuestionRepo questionRepo;

    @GetMapping("/questions")
    public List<Question> getRandomQuestions(@RequestParam("amount") int amount) {
        List<Question> questions = questionRepo.findAll();
        Collections.shuffle(questions);
        return questions.stream().limit(amount).toList();
    }
}
