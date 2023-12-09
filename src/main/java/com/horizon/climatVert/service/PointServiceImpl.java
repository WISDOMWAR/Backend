package com.horizon.climatVert.service;

import java.awt.Point;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PointServiceImpl implements PointService {

	@Autowired
	private PointService pointService;
	
	@Override
	public Point savePoint(Point point) {
		
		return pointService.savePoint(point);
	}

	@Override
	public List<Point> getalllistPoint() {
		
		return pointService.getalllistPoint();
	}

	@Override
	public Point getPointByid(Long id) {
		
		return pointService.getPointByid(id);
	}

	@Override
	public List<Point> rechercheparmotclé(String mp) {
		
		return pointService.rechercheparmotclé(mp);
	}

	@Override
	public void deletePoint(Long Pointid) {
		
		
	}

}
