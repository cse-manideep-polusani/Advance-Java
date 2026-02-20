package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
//@Scope("prototype")
public class Car implements Vechile{
	 public Car() {
		 System.out.println("Car been created by spring");
	 }
	 
	@Override
	public void run() {
		System.out.println("Car running..");
	}
}
