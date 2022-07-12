package constructor;

public class Ex1
{

	 int id;  
     String name;  
	    
	    //creating a parameterized constructor  
	   
	    Ex1 (int i,String n)
	    {  
	    id = i;  
	    name = n;  
	    }  
	    
	    
	    //method to display the values  
	    void display() 
	    {
	    	System.out.println("ID = "+id);
	    	System.out.println("NAME = "+name);
	    }  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	Ex1 s1 = new Ex1(111,"Karan");  
	    	Ex1 s2 = new Ex1(222,"Aryan");  
	    	
	    	
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display(); 

	}

}
