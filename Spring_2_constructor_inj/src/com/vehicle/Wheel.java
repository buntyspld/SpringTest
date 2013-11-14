package com.vehicle;

public class Wheel {
String WheelLoc;

public Wheel(String wheelLoc) {
	super();
	WheelLoc = wheelLoc;
}

public String getWheelLoc() {
	return WheelLoc;
}

public void setWheelLoc(String wheelLoc) {
	WheelLoc = wheelLoc;
	System.out.println("I am in setter metjhod of Wheel class");
}

public void displayWheelLocation()
{
System.out.println("Wheel Location is " +getWheelLoc());	
}
}
