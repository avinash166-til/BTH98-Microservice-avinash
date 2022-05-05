package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity 
@Table(name ="Studdent")

public class Studdent {
	
	private @Id @GeneratedValue Long Id;
	
	private String name;
	private int marks;
	private String grade;
	
	public Studdent() {}
	
	public Studdent(Long id, String name, int marks) {
		super();
		Id = id;
		this.name = name;
		this.marks = marks;
	}
	

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Studdent [Id=" + Id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studdent other = (Studdent) obj;
		return Objects.equals(Id, other.Id) && marks == other.marks && Objects.equals(name, other.name);
	}
	

	
	
}
