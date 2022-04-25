package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class SirNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nm1= Arrays.asList("Rajesh","suraj","Tom");
		List<String> nm2=Arrays.asList("varma","sharma","karma");
				
		
		//List<String> nm3= new ArrayList<String>();
	
		for(String x:nm2)
		{
			nm1.stream().map(y->y+" "+x).forEach(y->System.out.println(y));
			return;
			
		}
	
	
	

	}

}
