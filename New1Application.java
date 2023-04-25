package com.example.New1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.qsp.stdentrestapi.dto.Student;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class New1Application {

	public static void main(String[] args) {
		SpringApplication.run(New1Application.class, args);
		Student student=new Student();
		student.setId(1);
		
	}

}
