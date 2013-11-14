package com.saurabh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {
	public static  void main(String args[])
	{
	/*Triangle t= new Triangle();
	t.draw();*/   //Simple approch
	
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Triangle T=(Triangle) context.getBean("triangle1");
		T.draw();
		
	}
}
