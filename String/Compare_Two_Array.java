package Logical_Program;

import java.util.Arrays;

public class Compare_Two_Array {

	public static void main(String[] args) 
	{
	int ar1[]= {1,2,3};
	int ar2[]= {2,5,6};
	int ar3[]= {1,2,3};
	System.out.println(Arrays.equals(ar1,ar2));

	System.out.println(Arrays.equals(ar1,ar3));

	System.out.println(Arrays.equals(ar2,ar3));
	}

}
