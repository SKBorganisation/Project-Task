package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.")
public class Test {
	public static void main(String[] args) {
		System.out.println("In Main()");
		SpringApplication.run(Test.class);
		System.out.println("main end()");
		}

}
