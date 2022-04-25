package THBS.JAVAPRG;

import java.util.ArrayList;
import java.util.List;

class Student
{
	private String name;
	private int id;

	Student(String name, int id)
	{
		this.name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
public class GradeStudent {
	
	public  static void grade(Student st)
	{
	
		System.out.println(st.getId());
	}

	public static void main(String[] args) {
		Student s1=new Student("ash",123);
		Student s2=new Student("rash",123);
		
		List<Student> st=new ArrayList<Student>();
		
		
		st.add(s1);
		st.add(s2);
		
	

	}

}
