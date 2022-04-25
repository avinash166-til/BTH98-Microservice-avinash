package Java8;


interface Rbi
{
	public void banks(int i);
}
	
	class SBI implements Rbi
	{
		
		@Override
		
		public void banks(int i)
		{
			System.out.println("SBI bank");
		}
	}
	
	class Icci implements Rbi
	{
		
		@Override
		
		public void banks(int i)
		{
			System.out.println("SBI bank");
		}
	}

public class ImplentsPrg {

	public static void main(String[] args) {
	
		SBI sb=new SBI();
	sb.banks(20);
	//sb.bank(23);

	}

}
