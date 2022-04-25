/* 1. WAP to check if the given number is even number or odd number? */

package THBS.JAVAPRG;

class Number{
	private int a;
	
	Number(int a)
	{
		this.a=a;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
		
}

public class CalcNumber {
	
	public static  void evenOdd(Number nm)
	{
		if(nm.getA()%2==0 || nm.getA()==0)
		{
			System.out.println("Even numbers");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

	public static void main(String[] args) {
	Number nm= new Number(18);
	evenOdd(nm);

	}

}
