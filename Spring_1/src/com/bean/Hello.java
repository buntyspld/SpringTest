package com.bean;

public class Hello {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
public void write()
{
	System.out.println(getMessage());
	}
}
