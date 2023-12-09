package com.horizon.climatVert.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.horizon.climatVert.entity.Quiz;
import com.horizon.climatVert.repository.QuizRepository;


@Service
public class QuizServiceImpl implements QuizService {

	private QuizRepository quizRepository;
	@Override
	public Quiz saveQuiz(Quiz quiz) {
		
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> getalllistQuiz() {
		
		return quizRepository.findAll();
	}

	@Override
	public Quiz getQuizByid(Long id) {
		
		return quizRepository.getById(id);
	}

	@Override
	public List<Quiz> rechercheparmotclé(String mq) {
		
		return quizRepository.findAll();
	}

	@Override
	public void deleteQuiz(Long Quizid) {
		
		
	}

}
