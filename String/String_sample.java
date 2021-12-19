package String;

public class String_sample {

	public static void main(String[] args) 
	{
		String s = "Dhanaji";  // Heap--->string pool--->constant pool area
		                       // Duplicates not allowed
		String s1 = "Dhanaji"; // Duplicates are allowed
		String s10 = "Shirke";
		
		String s2 = new String ("Dhanaji"); // Heap--->String pool--->Non constant area
		String s3 = new String ("DHANAJI");
		String s4 = new String ("");
		String s5 = new String ("Dhanaji Shirke");
		System.out.println("==========Length==========");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s10.length());
		
		System.out.println("==========Case==========");
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println("==========Equal==========");
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s10));
		
		System.out.println(s.equalsIgnoreCase(s3));
		
		System.out.println("==========Contains==========");
		System.out.println(s2.contains("naj"));
		System.out.println(s2.contains("jna"));
		
		System.out.println("==========Empty==========");
		System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());
		
		System.out.println("==========CharacterAt==========");
		System.out.println(s3.charAt(0));
		System.out.println(s3.charAt(3));
		System.out.println(s3.charAt(6));
		//System.out.println(s3.charAt(10));
		
		System.out.println("==========Replace==========");
		System.out.println(s3.replace('I', 'A'));
		System.out.println(s3.replace('A', 'O'));
		System.out.println(s3.replaceAll(s3, s5));
		
		System.out.println("==========IndexOf==========");
		System.out.println(s3.indexOf('I'));
		System.out.println(s3.lastIndexOf('D'));
		
		System.out.println("==========Concat==========");
		System.out.println(s3.concat(s5));
		System.out.println(s3.concat(" SHIRKE"));
		
		System.out.println("==========start&End With==========");
		System.out.println(s3.startsWith("DHA"));
		System.out.println(s3.startsWith("NAJ"));
		System.out.println(s3.endsWith("JI"));
		System.out.println(s3.endsWith("HAN"));
		
		System.out.println("==========Equal==========");
		String s6 = null;
		//System.out.println(s6.isEmpty());
		System.out.println(s==s6);
		System.out.println(s==s1);
		
		System.out.println(s3.split("NAJ"));

	}

}
