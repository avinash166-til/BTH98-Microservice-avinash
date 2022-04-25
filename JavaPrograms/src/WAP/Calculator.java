/*  2. WAP to create Calculator class which is accepting two numbers and 
performing addition,subtraction,multiplication and division functions. */

package WAP;

import java.util.Scanner;

public class Calculator {
	int a;
	int b;
	
	Calculator(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void addition()
	{
		

		 int c1=a+b;
		 System.out.println(a +" + " +b+"  " +" output: " +c1);
	}
	
	void subtract() {
	
		 int c1 = a - b;
		 System.out.println(a +" - " +b+"  " +" output: " +c1);
		}


	void mult() {
		 int c1=a*b;
		 System.out.println(a +" * " +b+"  " +" output: " +c1);
		}

   void div() {
		 int c1=a/b;
		 System.out.println(a +" / " +b+"  " +" output: " +c1);
		}


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first num");
		int a=sc.nextInt();
		System.out.println("enter sec num");
		int b=sc.nextInt();
Calculator cl =new Calculator(a,b);
cl.addition();
cl.subtract();
cl.mult();
cl.div();
	}

}
