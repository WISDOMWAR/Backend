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
import com.horizon.climatVert.entity.Reclamation;
import com.horizon.climatVert.service.ReclamationService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/reclamation")
@RequiredArgsConstructor
public class ReclamationController {
   @Autowired
	private ReclamationService reclamationService;
   
   @PostMapping("/ajouter")
public Reclamation saveReclamation(@RequestBody Reclamation reclamation) {
	return reclamationService.saveReclamation(reclamation);
}
   @GetMapping("/listedeReclamation")
public List<Reclamation> getalllistReclamation() {
	return reclamationService.getalllistReclamation();
}
   @GetMapping("/Reclamationbyid/{id}")
public Reclamation getReclamationByid(@PathVariable Long id) {
	return reclamationService.getReclamationByid(id);
}

@DeleteMapping("/delete/{id}")
public void deleteReclamation(Long Reclamationid) {
	reclamationService.deleteReclamation(Reclamationid);
}
	
	
}
