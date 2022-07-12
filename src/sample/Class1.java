package sample;

import java.util.Arrays;

public class Class1
{

	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original Array = "+Arrays.toString(arr));
		
		/* for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.println("Array Elements = " +arr[i]);
		} */
		
		int Evencount = 0;
		int Oddcount = 0; 
		for(int i= 0; i<arr.length;i++)
		{
			if (arr[i]%2 == 0)
			{
				Evencount++;
			}
			else 
			{
				Oddcount++;
			}
		}
		
		System.out.println("No of Even_Numbers  = "+Evencount);
		System.out.println("No of Odd_Numbers  = "+Oddcount);
		
		/*
			public static void main(String[] args)
 {
    int[] array_nums = {5, 7, 2, 4, 9};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int ctr = 0;
	for(int i = 0; i < array_nums.length; i++)
	{
		if(array_nums[i] % 2 == 0)
			ctr++;
	}
	System.out.println("Number of even numbers : "+ctr);
	System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
			*/

	}

}
