package com.horizon.climatVert.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.horizon.climatVert.entity.Quiz;



public interface QuizService {
	
	public Quiz saveQuiz(Quiz quiz);
	public List<Quiz> getalllistQuiz();
    public Quiz getQuizByid(Long id);
    
	public List<Quiz> rechercheparmotclé(String mq);
    public void deleteQuiz(Long Quizid);
}
