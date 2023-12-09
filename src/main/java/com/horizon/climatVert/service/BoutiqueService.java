package com.horizon.climatVert.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.horizon.climatVert.entity.Boutique;
import com.horizon.climatVert.repository.BoutiqueRepository;

import lombok.RequiredArgsConstructor;



public interface BoutiqueService {
  
	

	public Boutique saveBoutique(Boutique boutique);
	public List<Boutique> getalllistBoutique();
    public Boutique getBoutiqueByid(Long id);
    
	public List<Boutique> rechercheparmotclé(String mb);
    public void deleteBoutique(Long Boutiqueid);
	
}
