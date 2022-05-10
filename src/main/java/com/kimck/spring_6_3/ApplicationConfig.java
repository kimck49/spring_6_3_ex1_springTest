package com.kimck.spring_6_3;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() {//메서드의 이름이 주입되는 객체(bean)의 이름
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("육상");
		hobbys.add("승마");		
		
		Student student = new Student("강감찬", 30, hobbys);
		
		student.setHeight(178);
		student.setWeight(91);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("영화감상");
		hobbys.add("게임");		
		
		Student student = new Student("권율", 37, hobbys);
		
		student.setHeight(169);
		student.setWeight(67);
		
		return student;
	}
	
	
}
