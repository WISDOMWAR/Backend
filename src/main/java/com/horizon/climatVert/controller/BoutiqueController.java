package com.horizon.climatVert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horizon.climatVert.entity.Boutique;
import com.horizon.climatVert.service.BoutiqueService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/boutique")
@RequiredArgsConstructor
public class BoutiqueController {
	
	@Autowired
	 private BoutiqueService boutiqueService;

	@PostMapping("/ajouter")
	public Boutique saveBoutique(Boutique boutique) {
		return boutiqueService.saveBoutique(boutique);
	}
	@GetMapping("/listedebotique")
	public List<Boutique> getalllistBoutique() {
		return boutiqueService.getalllistBoutique();
	}
	@GetMapping("/boutiquebyid/{id}")
	public Boutique getArticleByid(Long id) {
		return boutiqueService.getBoutiqueByid(id);
	}

	
	@DeleteMapping("/delete/{id}")
	public void deleteBoutique(Long Boutiqueid) {
		boutiqueService.deleteBoutique(Boutiqueid);
	}
	 

}
