package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		LocalDate date= LocalDate.now();
		//System.out.println(date);
		
		
		LocalTime time= LocalTime.now();
		//System.out.println(time);
		
		
		LocalDateTime daytime= LocalDateTime.now();
		//System.out.println(daytime.getDayOfWeek());
	System.out.println(daytime.getMonth());
		
	
		System.out.println(daytime.getDayOfWeek());
		
		
		 

		 LocalDateTime yesterday = daytime.minusDays(0);    
		    LocalDateTime tomorrow = yesterday.plusDays(2); 
		System.out.println("enter number");
		
		
		int i=sc.nextInt();
		
		LocalDateTime ld= yesterday.plusDays(i);
		
		System.out.println(ld.getDayOfWeek());
		
		
		
		
		
		
		
	

	}

}
