package com.Main;
import com.bean.Hello;
import com.bean.Hello2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
public static void main(String args[])
{
//	ApplicationContext context=new ClassPathXmlApplicationContext("myXML.xml");
//	
//	Hello h1=(Hello) context.getBean("Hello");
//	h1._getMessage();
//	h1.method();
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("myXML.xml"));
	Hello h2 = (Hello)factory.getBean("Hello");

	h2.write();
	
	Hello2 h1=(Hello2) factory.getBean("Hello2");
	h1.write();
	
}
}