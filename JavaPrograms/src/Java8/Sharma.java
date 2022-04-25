package Java8;

import java.util.Arrays;
import java.util.List;

public class Sharma {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//WAP to print all names along with surname "Sharma".

		List<String> mylist = Arrays.asList("Rajesh","Suraj","Tom");
		mylist.stream().map(x -> x+" Sharma").forEach(y -> System.out.println(y));



		}

}
