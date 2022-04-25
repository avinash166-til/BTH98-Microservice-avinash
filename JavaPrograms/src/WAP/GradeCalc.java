package WAP;

class GradeCalc1 {

	int rollnum;
	String name;
	int marks;
	
	GradeCalc1(int rollnum,String name,int marks)
	{
		this.rollnum=rollnum;
		this.name=name;
		this.marks=marks;
	}
	
	
void gradeCalculator()
{
	if(this.marks>=70 && this.marks<80)
	{
		System.out.println("Grade C");
}
	else if(this.marks>=80 && this.marks<90)
	{
		System.out.println("Grade B");
}
	else if(this.marks>=90 && this.marks<=100)
	{
		System.out.println("Grade A");
}
	else {
		System.out.println("Fail");
	}
	
}
}
public class GradeCalc{
	
	public static void main(String[] args) {
		
GradeCalc1 gd=new GradeCalc1(101,"ramesh",60);
gd.gradeCalculator();
	}

}

