package com.horizon.climatVert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horizon.climatVert.entity.Quiz;
import com.horizon.climatVert.service.QuizService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/quiz")
@RequiredArgsConstructor
public class QuizController {
	
	@Autowired
	private QuizService quizService;

	
	@PostMapping("/ajouter")
	public Quiz saveQuiz(@RequestBody Quiz quiz) {
		return quizService.saveQuiz(quiz);
	}
   
	@GetMapping("/listedequiz")
	public List<Quiz> getalllistQuiz() {
		return quizService.getalllistQuiz();
	}

	@GetMapping("/quizbyid/{id}")
	public Quiz getQuizByid(@PathVariable Long id) {
		return quizService.getQuizByid(id);
	}


	@DeleteMapping("/delete/{id}")
	public void deleteQuiz(@PathVariable("id") Long Quizid) {
		quizService.deleteQuiz(Quizid);
	}
	
	

}
