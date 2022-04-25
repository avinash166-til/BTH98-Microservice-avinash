package THBS.JAVAPRG;

public class EvenNum {

	public static void filterEven(int arr[])
	{
		//System.out.println(arr[1]);
		for(int j=0;j<arr.length;j++)
		{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			
			}
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {

int arr[]= {12,23,44,11};
filterEven(arr);

}
	}


