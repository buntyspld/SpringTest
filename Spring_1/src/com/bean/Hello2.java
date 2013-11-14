package com.bean;

public class Hello2 {
private String message;
public String getMessage() {
	return message;
}


public void write()
{
	System.out.println(getMessage());
	}
public Hello2(String msg)
{
message=msg;
}
}