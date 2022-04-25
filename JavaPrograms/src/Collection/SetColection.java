package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Laptop {
	
	private int sernum;
	private String cname;
	private int price;
	




	public Laptop(int sernum, String cname, int price) {
		super();
		this.sernum = sernum;
		this.cname = cname;
		this.price = price;
	}





	public int getSernum() {
		return sernum;
	}





	public void setSernum(int sernum) {
		this.sernum = sernum;
	}





	public String getCname() {
		return cname;
	}





	public void setCname(String cname) {
		this.cname = cname;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}

	




	@Override
	public int hashCode() {
		return Objects.hash(cname, price, sernum);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(cname, other.cname) && price == other.price && sernum == other.sernum;
	}





	@Override
	public String toString() {
		return "SetColection [sernum=" + sernum + ", cname=" + cname + ", price=" + price + "]";
	}



}

public class SetColection
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lp1 =new Laptop(123,"kar",1000);
		Laptop lp2=new Laptop(123,"sbi",1000);
		
		List<Laptop>  lp=new ArrayList<Laptop>();
		
		lp.add(lp1);
		lp.add(lp2);
		
		System.out.println(lp);
		

		
		

	}

}
