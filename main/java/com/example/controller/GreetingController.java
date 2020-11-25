package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Greeting;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private static final String template ="Hello,%s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}
	
	@PostMapping("/post")
	public Greeting sayHello(@RequestBody Greeting greeting) {
		return new Greeting(greeting.getCounter(),greeting.getName());
	}
	
	@PutMapping("/put/{name}")
	public Greeting sayHelloPut(@PathVariable String name) {
		return new Greeting(counter.incrementAndGet(),String.format(template,name));
	}
}
