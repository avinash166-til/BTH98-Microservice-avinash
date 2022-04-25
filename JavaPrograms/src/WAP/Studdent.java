/* WAP to create student objects array of 3 students, sort them based on rollnumbers. */

package WAP;

import java.util.Scanner;

public class Studdent{
	
	int a[]=new int[3];
	Scanner sc = new Scanner(System.in);
	void sorting()
	{
		for(int i=0;i<=a.length-1;i++)
		{
	
		a[i]= sc.nextInt();	
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int swap=a[i];
				a[i]=a[i+1];
				a[+1]=swap;
				
			}
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.println(a[i]);
		}
		
			}
	
	

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);	
	Studdent st=new Studdent();
	st.sorting();

	}

}

