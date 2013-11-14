package com.saurabh;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle {

	List<Point> Points;

	public List<Point> getPoints() {
		return Points;
	}

	public void setPoints(List<Point> points) {
		Points = points;
	}

	public void draw() {
		for (Point point : Points)
			System.out.println("Point  =(" + point.getX() + "," + point.getY()
					+ ")");
	}

}
