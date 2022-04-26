package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

 class Student1 {
	
	private String stname;
	private int id;
	private Department1 dep_id;
	private  int cmarks,pmarks,mmarks,total;
	
	
	

	
	
	public Student1(String stname, int id, Department1 dep_id, int cmarks, int pmarks, int mmarks) {
		super();
		this.stname = stname;
		this.id = id;
		this.dep_id = dep_id;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
	}






	public String getStname() {
		return stname;
	}






	public void setStname(String stname) {
		this.stname = stname;
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public Department1 getDep_id() {
		return dep_id;
	}






	public void setDep_id(Department1 dep_id) {
		this.dep_id = dep_id;
	}






	public int getCmarks() {
		return cmarks;
	}






	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}






	public int getPmarks() {
		return pmarks;
	}






	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}






	public int getMmarks() {
		return mmarks;
	}






	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}
	
	
	public int getTotal() {
		return total;
	}

	
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public int getTmarks() {
		return this.cmarks+this.pmarks+this.mmarks;


	}
	@Override
	public String toString() {
		return "Student1 [stname=" + stname + ", id=" + id + ", dep_id=" + dep_id + ", cmarks=" + cmarks + ", pmarks="
				+ pmarks + ", mmarks=" + mmarks + "]";
	}




 }	
	
	class Department1 {
	private String depname;
	private int dep_id;
	
	
	 Department1(String depname, int dep_id) {
		super();
		this.depname = depname;
		this.dep_id = dep_id;
	}



	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}



	public int getDep_id() {
		return dep_id;
	}


	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}


	@Override
	public String toString() {
		return "Department [depname=" + depname + ", dep_id=" + dep_id + "]";
	}

}

public class TestStudent	
{
	public static void main(String[] args) {
		
		Department1 d1 = new Department1("cse",123);
		Department1 d2 = new Department1("eee",124);
		Department1 d3 = new Department1("ece",125);
		Department1 d4 = new Department1("Mec",126);
		
		Student1 s1 = new Student1("ravi",56,d1,51,62,53);
		Student1 s2 = new Student1("mavi",57,d2,61,66,68);
		Student1 s3 = new Student1("kavi",58,d3,61,76,77);
		Student1 s4 = new Student1("savi",59,d4,71,78,79);
		Student1 s5 = new Student1("ravi",46,d2,78,89,90);
		Student1 s6 = new Student1("lavi",49,d1,78,97,69);
		Student1 s7 = new Student1("bavi",46,d3,88,67,59);
		
		List<Student1> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);

		Map<Department1, List<Student1>> studentDeptWise = students.stream().collect(Collectors.groupingBy(Student1::getDep_id));
		
		System.out.println(studentDeptWise);
		
		
		//Map<Integer, List<Student1>> st = students.stream().filter(x->x.getCMarks()>50 ).collect(Collectors.groupingBy(Student1::getMarks));
		//System.out.println("\n"+st);
		//Map<Integer, List<Student1>> st1 = students.stream().collect(Collectors.groupingBy(Student1::getScore));
		//System.out.println(st1);
	

		
	}
 }

