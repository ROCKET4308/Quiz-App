package com.rocket.quizapp.service;

import com.rocket.quizapp.entity.Question;
import com.rocket.quizapp.entity.Quiz;
import com.rocket.quizapp.repository.QuestionRepository;
import com.rocket.quizapp.repository.QuizRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@AllArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;
    public ResponseEntity<String> createQuiz(String category,int numQ, String title){
        List<Question> questions = questionRepository.findRandomQuestionByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepository.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
