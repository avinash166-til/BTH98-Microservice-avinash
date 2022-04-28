package com.example.demo;

public class Student {

	private int marks;
	private String name;
	
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	String grade()
	{
		if(getMarks()>=80 && getMarks()<=100)
		{
		return "Student name is: "+ getName() +" Grade is: A";	
		}
		
		else if(getMarks()>=65 && getMarks()<80)
		{
			return "Student name is: "+getName()+" grade is: B";
		}
		
		else if(getMarks()>=50 && getMarks()<65)
		{
			return "student name is: "+getName()+" Grade is: C";
		}
		
		else if(getMarks()>=35 && getMarks()<50)
		{
			return "Student name is: "+getName()+" Grade is: D";
		}
		
		else if(getMarks()<35 && getMarks()>=0)
		{
			return "Student name is: "+getName()+" Result is: Fail";
		}
		
		else {
			return " Invalid Number: Please enter marks between 0 to 100 ";
		}
	}
	
}
