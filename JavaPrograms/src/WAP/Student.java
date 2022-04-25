/* WAP for calculating student's grade based on below rules. 
 * 90-100 --> A, 80-90 --> B, 70-80 --> C, otherwise Fail.
 */

package WAP;

import java.util.Scanner;

public class Student {
	
	String name;
	int Percentage;
	
	Student(int Percentage, String name)
	{
		this.name=name;
		this.Percentage=Percentage;
	}
	
	void result()
	{
		if(Percentage>=90 && Percentage<=100)
		{
			System.out.println(" A");
		}
		else if(Percentage>=80 && Percentage<=90)
		{
			System.out.println("B");
		}
		else if(Percentage>=70 && Percentage<=80)
		{
			System.out.println("c");
		}
		
		else if(Percentage<70 )
		{
			System.out.println("fail");
		}
		else 
		{
			System.out.println("Invalid Percentage");
		}
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter Percentage");
		Scanner  sc=new Scanner(System.in);
		int p=sc.nextInt();
		System.out.println("enter name");
		String s=sc.next();
		System.out.print("Result:");
		Student st=new Student(p,s);
		st.result();
		
				
				
				
		

	}
}


