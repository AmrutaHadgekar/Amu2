package sample;

public class EvenOdd_InArrayList
{
	public static void main(String args[])
	{  
		int a[]={1,2,5,6,3,2}; 
		
		System.out.println("Odd Numbers:");  
		int oddcount = 0 ;
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2!=0)
			{  
			System.out.println(a[i]);  
			oddcount = oddcount+1;	
		    }  
		}
		System.out.println("No of Odd = " +oddcount);
		
		
		System.out.println("Even Numbers:");  
		int evencount = 0;
		for(int j=0;j<a.length;j++)
		{  
			if(a[j]%2==0)
			{  
				System.out.println(a[j]);  
				evencount++;
			}  
	    } 
		
		System.out.println("No of Even = " +evencount);
		}
}

