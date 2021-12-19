package String;

public class PalindromeProg {

	public static void main(String[] args) {
		
		String s = "NAYAN";
		String r = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			r = r+s.charAt(i);
		}
		
		System.out.println("Original string is "+s);
		System.out.println("Reverse string is "+r);
		
		if(s.equals(r))
		{
		  System.out.println("String is Palindrom");
		}
		else
		{
		  System.out.println("String is Not-palindrom");	
		}

	}

}
