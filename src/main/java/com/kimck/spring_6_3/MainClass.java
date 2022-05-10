package com.kimck.spring_6_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student stu1 = ctx.getBean("student2", Student.class);
		
		System.out.println(stu1.getName());
		
		Student stu3 = ctx.getBean("student3", Student.class);
		
		System.out.println(stu3.getName());
		
		ctx.close();
		
		
	}

}
