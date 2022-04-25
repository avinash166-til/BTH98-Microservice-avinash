package WAP;

class Calculator1{
	
	private int a;
	private int b;
	
	Calculator1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

	public static void addition(Calculator1 cl)
	{
	int c=	cl.getA()+cl.getB();
	System.out.println(cl.getA()+" + "+cl.getB()+" = " +c);
	}
	
	
	public static void subtract(Calculator1 cl)
	{
	int c=	cl.getA()-cl.getB();
	System.out.println(cl.getA()+" - "+cl.getB()+" = " +c);
	}
	
	
	public static void multiplication(Calculator1 cl)
	{
	int c=	cl.getA() *cl.getB();
	System.out.println(cl.getA()+" * "+cl.getB()+" = " +c);
	}
	
	
	public static void division(Calculator1 cl)
	{
	int c=	cl.getA()/cl.getB();
	System.out.println(cl.getA()+" / "+cl.getB()+" = " +c);
	}

	
	public static void main(String[] args) {
		
	Calculator1 cl=new Calculator1(21,22);
	addition(cl);
	subtract(cl);
	multiplication(cl);
	division(cl);
	

		
	}

}
