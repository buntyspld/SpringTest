package com.saurabh;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
	String type;
	Point pointA;
	Point pointB;
	Point pointC;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println("Trangle Drawn is of type " + getType());
		System.out.println("Point A = (" + getPointA().getX() + ","
				+ getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ","
				+ getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ","
				+ getPointC().getY() + ")");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("In Destroy Method After Setting all properties");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out
				.println("In afterPropertiesSet Method Before Setting all properties");
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void myInIt() {
		System.out.println("My own init Saurabh");
	}

	public void myDestory() {
		System.out.println("My own destroy- Saurabh");
	}
}