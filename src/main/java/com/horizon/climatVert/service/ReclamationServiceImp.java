package com.horizon.climatVert.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.horizon.climatVert.entity.Reclamation;
import com.horizon.climatVert.repository.ReclamationRepository;


@Service
public class ReclamationServiceImp implements ReclamationService {

	private ReclamationRepository reclamationRepository;
	@Override
	public Reclamation saveReclamation(Reclamation reclamation) {
		
		return reclamationRepository.save(reclamation);
	}

	@Override
	public List<Reclamation> getalllistReclamation() {
		
		return reclamationRepository.findAll();
	}

	@Override
	public Reclamation getReclamationByid(Long id) {
		
		return reclamationRepository.getById(id);
	}


	@Override
	public void deleteReclamation(Long Reclamationid) {
		
		
	}

	@Override
	public List<Reclamation> rechercheparmotclé(String mr) {
		// TODO Auto-generated method stub
		return null;
	}



}
