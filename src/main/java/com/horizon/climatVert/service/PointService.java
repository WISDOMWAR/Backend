package com.horizon.climatVert.service;

import java.awt.Point;
import java.util.List;

import org.springframework.stereotype.Service;

import com.horizon.climatVert.entity.Boutique;


public interface PointService {

	public Point savePoint(Point point);
	public List<Point> getalllistPoint();
    public Point getPointByid(Long id);
    
	public List<Point> rechercheparmotclé(String mp);
    public void deletePoint(Long Pointid);
	
}
