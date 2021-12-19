package String;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Veloity";
		String r = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println("Original String is "+s);
		System.out.println("Reverse String is "+r);

	}

}
