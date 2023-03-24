package com.hafeez;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GittestApplication.class, args);
		System.out.println("hao ");
		System.out.println("updated only in temp");
		System.out.println("added in temp2");
		
		List<Integer> res=new ArrayList<>();
		
	}

}
