package com.output.Saurabh.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.output.OutputHelper;
import com.output.Saurabh.*;
import com.output.Saurabh.impl.*;
public class App {
public static void main(String args[])
{
	//method1:
	/*IOutputGenerator output=new CsvOutputGenerator();
	output.generateOutput();*/
	
	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	OutputHelper output= (OutputHelper) context.getBean("OutputHelper");
	output.generateOutput();
	
	
	
	}
}
