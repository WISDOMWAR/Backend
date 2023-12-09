package com.horizon.climatVert.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.horizon.climatVert.entity.Reclamation;


public interface ReclamationService {
	
	
	public Reclamation saveReclamation(Reclamation reclamation);
	public List<Reclamation> getalllistReclamation();
    public Reclamation getReclamationByid(Long id);
    
	public List<Reclamation> rechercheparmotclé(String mr);
    public void deleteReclamation(Long Reclamationid);
}
