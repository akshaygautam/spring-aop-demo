package com.akshay.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService  {

	public String getFortune() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		return "Heavy traffic";
	}

	public String getFortune(boolean tripWire){
		if(tripWire)throw new RuntimeException("Tripped wire");
		
		return "Heavy traffic";
	}
}
