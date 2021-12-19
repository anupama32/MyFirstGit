package Logical_Program;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  
	  System.out.println("Enter Number");
	  int num = s.nextInt();
	  
	  if(num%2==0)
	  {
		  System.out.println("Given Number is Even");
	  }
	  else
	  {
		  System.out.println("Given Number is Odd");
	  }

	}

}
