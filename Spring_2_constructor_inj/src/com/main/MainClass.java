package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;

import com.vehicle.Car;
public class MainClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
Car C= (Car) context.getBean("Car");
C.showCarDetails();

	}

}
