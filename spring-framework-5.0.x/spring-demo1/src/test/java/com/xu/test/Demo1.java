package com.xu.test;

import com.xu.spring.TestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo1 {

//	@Test
//	public  void test(){
//		BeanFactory BeanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
//		TestBean testbean = (TestBean) BeanFactory.getBean("testbean");
//		testbean.println();
//	}

	public static void main(String[] args) {
		BeanFactory BeanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		TestBean testbean = (TestBean) BeanFactory.getBean("testbean");
		testbean.println();
	}
}
