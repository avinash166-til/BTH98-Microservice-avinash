package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 {
	
	 int a;
	

	
	public static void main(String[] args) {
		
		Collection1 co=new Collection1();
		
		
	List<Integer> cl=new ArrayList<Integer>();
	
	cl.add(1);
	cl.add(2);
	cl.add(3);
	
	Iterator it=cl.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	for(Integer x:cl)
	{
		System.out.println(x);
	}
	
		

	}

}
