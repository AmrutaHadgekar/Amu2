package sample;

public class ReverseString {

	public static void main(String[] args)
	{
		String str = "automation";
        char arr[] = str.toCharArray();  // converted to character array and printed in reverse order
       
        System.out.println("Original string = " +str);
        
        System.out.print("Reversed String = ");
        for(int i= arr.length-1; i>=0; i--) 
        {
            System.out.print(arr[i]);
        }
    }
	}


