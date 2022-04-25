package THBS.JAVAPRG;

class Num{
	private int a;
	
	Num(int a)
	{
		this.a=a;
		
	}
	
	public int getA()
	{
		return a;
	}
	
	public void setA()
	{
		this.a=a;
	}
	
	
}



public class NumberCalc {
	

public static void prime(Num nm)
{
	boolean ab=true;
	int b=nm.getA()/2;
	
	for(int i=2;i<=b;i++)
	{
	
	if(nm.getA()%i==0)
	{
		System.out.println("not prime");
	      ab=false;
	      break;
	}
	}

	
if(ab==true)
{
	System.out.println("prime number");
	
}
	
}

	
public static void main(String[] args) {
	
		Num nm=new Num(12);
		prime(nm);

	}

}
