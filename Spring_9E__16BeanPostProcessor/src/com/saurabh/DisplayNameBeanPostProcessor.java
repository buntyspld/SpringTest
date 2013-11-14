package com.saurabh;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out
				.println("In postProcessAfterInitialization methiod ,Bean Name is "
						+ beanName);
		// TODO Auto-generated method stub
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out
				.println("In postProcessBeforeInitialization method ,Bean Name is "
						+ beanName);
		return bean;
	}

}
