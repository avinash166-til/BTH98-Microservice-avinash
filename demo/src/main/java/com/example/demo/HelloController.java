package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller

@RestController
public class HelloController {
	
	@RequestMapping("/")
	//@ResponseBody
	String hello() {
		return "Hello from my spring boot application!";
	}
	@RequestMapping("/tool")
	String tools()
	{
		return "tools " ;
	}
	
	@RequestMapping("/student/{name}/{id}")
	
	String inputs(@PathVariable String name, @PathVariable Long id )
	{
		return " Name " +name+" id "+id;
	}
	
	@RequestMapping("/add/{a}/{b}")
	
		int calculate(@PathVariable int a, @PathVariable int b)
		
		{
		return a+b ;
		
		}
	
	@RequestMapping("/sub/{a}/{b}")
	
	int calculate1(@PathVariable int a, @PathVariable int b)
	
	{
	return a-b ;
	
	}
	
	@RequestMapping("/div/{a}/{b}")
	
	int calculate2(@PathVariable int a, @PathVariable int b)
	
	{
	return a/b ;
	}
	
	@RequestMapping("grade/{a}/{b}/{c}")
	
	int grade(@PathVariable int a,@PathVariable int b,@PathVariable int c)
	{
		return a+b+c;
	}
	
	}
	
	
	

