package com.example.demo;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping("/student1/{name}/{id}")
	
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
	
	@RequestMapping("grade1/{a}/{b}/{c}")
	
	int grade1(@PathVariable int a,@PathVariable int b,@PathVariable int c)
	{
		return a+b+c;
	}
	
	
	@RequestMapping("/Maths1/{a}/{b}")
	
	String Maths1(@PathVariable Long a, @PathVariable Long b)
	
	{
	return "addition= "+(a+b)+" subtract  ="+(a-b)+" division ="+(a/b)+" \nmultiplication ="+(a*b) ;
	
	}
	
	@RequestMapping("/Student/{marks}/{name}")
	
		String grade(@PathVariable int marks, @PathVariable String name)
		{
		Student st= new Student(marks,name);
				 return st.grade();
		//return "Student name is"+name+" Grade "+marks;
		}
	
	}
	
	
	

