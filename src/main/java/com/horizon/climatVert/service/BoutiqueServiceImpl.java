package com.horizon.climatVert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horizon.climatVert.entity.Boutique;

@Service
public class BoutiqueServiceImpl implements BoutiqueService {

	@Autowired
	private BoutiqueService boutiqueService;
	
	
	@Override
	public Boutique saveBoutique(Boutique boutique) {
		
		return boutiqueService.saveBoutique(boutique);
	}

	@Override
	public List<Boutique> getalllistBoutique() {
		
		return boutiqueService.getalllistBoutique();
	}

	@Override
	public Boutique getBoutiqueByid(Long id) {
		
		return boutiqueService.getBoutiqueByid(id);
	}

	@Override
	public List<Boutique> rechercheparmotclé(String mb) {
	
		return boutiqueService.rechercheparmotclé(mb);
	}

	@Override
	public void deleteBoutique(Long Boutiqueid) {
		
		
	}

}
