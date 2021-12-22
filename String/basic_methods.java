package String;

public class basic_methods
{	
   public static void main(String[] args)
{
//constatnt pool area
	//new keyword is not used so constatnt pool area 
	//memory strored in heap area-->string pool area...constant area
	//duplicate objects are not allowd
	String s="Priyanka"; 
	              
//non-constatnt pool area
	//new keyword is used so constatnt pool area
	//memory strored in heap area-->string pool area...non-constant area
	//duplicate objects are allowd
	
	String s1= new String ("Priyanka");
	String s2= new String ("priyanka K");
	String s3= new String ("PRIYANKA");
	String s5= new String ("");
	String s6= new String ("Priyanka Jantre");
	String s7= new String ("Vishal");
	
//String class methods
	
	// 1) lenght method() s.length();     //obj name. method name
	System.out.println(s.length());       //it gives lengh of string
	System.out.println(s1.length());
	System.out.println(s2.length());
	
	
	// 2) toUpperCase
	System.out.println(s);               //prevoisly priyanka is in lower case
	System.out.println(s.toUpperCase()); //all capital letters
	
	
	// 3) toLowerCase                    
	System.out.println(s.toLowerCase()); //all small letters
	
		
	// 4) equals method                  //comparision will takeplace
	System.out.println(s.equals(s1));    //s-s1 => (Priyanka) both are same so true
	System.out.println(s.equals(s2));    //s-s2 => (Priyanka & priyanka k) both are different so false
	System.out.println(s1.equals(s3));   //s1-s3 =>(Priyanka & PRIYANKA) both r different so false
	
	
	// 5) equal ignoreCase method      //charator sequence will check
	System.out.println(s1.equalsIgnoreCase(s3)); //here small letters comparing with capital letters
	                                     //so we did ignore small n capital, n give output.. both r same so true
	
	
	// 6) contains method              //charators contains in string or not
	System.out.println(s.contains("riy"));  //all charactors sequence r available so true
	System.out.println(s2.contains("iynk")); //char sequence not avialable in s2 so false
	
	
	
	// 7) isEmpty method
	System.out.println(s3.isEmpty());   //string has char so false..
	System.out.println(s5.isEmpty());   //string is emplty so true
	
	
	
	// 8) charAT method                 // it give index of string like 0, 1,2
	System.out.println(s2.charAt(3));   //char no of 3 is y
	System.out.println(s.charAt(0));    //char no of 0 is p
	
	//Error- String Index OutOf Bounds Exception: go out of capacity
	//System.out.println(s.charAt(9));

	
	// 9) endsWith method
	System.out.println(s.endsWith("nka")); //T //ens with nka
	System.out.println(s2.endsWith(" ka")); //f not ends with " ka"

	
	// 10) startsWith method/ endsWith
	System.out.println(s.startsWith("pri")); //F.. starts with Pri
	System.out.println(s.startsWith("Pri")); //T
	System.out.println(s.startsWith("riy", 1));//T 1 no charactor sodun pudhch print ahe ka paha
	System.out.println(s.startsWith("riya", 2));//F 2 charactor chi jaga sodun.. iya print vayla pahij hot.. bt riya ahe ithe.. so F
	
	
	// 12) subSring method
	System.out.println(s6.substring(0));  //Priyanka Jantre.. Priyanka
	System.out.println(s6.substring(3));  //yanka Jantre... 3pasun pudhe
	System.out.println(s6.substring(7));  //a Jantre
	
	
	// 13) Concat method
	System.out.println(s6.concat(s7));
	System.out.println(s6.concat(" Vishal"));	
	
	
	// 14) IndexOf method
	System.out.println(s7.indexOf('V'));
	System.out.println(s7.indexOf('i'));
	System.out.println(s6.indexOf('J'));
	System.out.println(s2.indexOf('K'));
	System.out.println(s2.indexOf('k'));
	
	
	// 15) Replace method
	System.out.println(s6.replace(" ", " V ")); //space replaced with V
	System.out.println(s.replace("P","J" ));
	
	
	// 16) split method // print one one letter... i love my india
	String given="Vishu : is : my : life"; 
	String referance= ":";   // ":" disel tevha split kraychy
	
	//given.split(referance);// it's o/p will give one string i.e Vishuismylife
	
	String out[]=given.split(referance); //out mule split kelele chara distat
	 System.out.println(out[0]);
	 System.out.println(out[3]);
	 
	 for(int i=0; i<=3; i++)
	 {
		 System.out.println(out[i]);
	 }
	
	
}
   
   

	
}
