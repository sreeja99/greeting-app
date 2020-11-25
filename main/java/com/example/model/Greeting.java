package com.example.model;

public class Greeting {
	public long counter;
	private String name;
	public Greeting(long counter, String name) {
	        this.counter = counter;
	        this.name = name;
	    }
	
	 public String getName() {
		 return this.name;
	 }
	 
	 public long getCounter() {
		 return counter;
	 }
	 
	 public void setName(String name){
	        this.name = name;
	    }
	 
	 public void setCounter(long counter){
	        this.counter =counter;
	    }
}
