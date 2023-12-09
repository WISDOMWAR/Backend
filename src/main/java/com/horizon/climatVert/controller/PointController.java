package com.horizon.climatVert.controller;

import java.awt.Point;
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

import com.horizon.climatVert.service.PointService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/points")
@RequiredArgsConstructor
public class PointController {
	
	@Autowired
	private PointService pointService;

	@PostMapping("/ajouter")
	public Point savePoint(@RequestBody Point point) {
		return pointService.savePoint(point);
	}

	@GetMapping("/listedePoint")
	public List<Point> getalllistPoint() {
		return pointService.getalllistPoint();
	}

	@GetMapping("/Pointyid/{id}")
	public Point getPointByid(@PathVariable Long id) {
		return pointService.getPointByid(id);
	}

	public List<Point> rechercheparmotclé(String mp) {
		return pointService.rechercheparmotclé(mp);
	}

	@DeleteMapping("/delete/{id}")
	public void deletePoint(@PathVariable("id") Long Pointid) {
		pointService.deletePoint(Pointid);
	}
	
	
	

}
