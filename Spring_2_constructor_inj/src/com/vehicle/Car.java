package com.vehicle;

public class Car {
	
Wheel wheelType;

public Wheel getWheelType() {
	return wheelType;
}

public void setWheelType(Wheel wheelType) {
	this.wheelType = wheelType;
}

public void showCarDetails()
{
System.out.println("Typ eof wheel is "+getWheelType().getWheelLoc());	
}

}
