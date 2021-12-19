package String;

public class Split_Use {

	public static void main(String[] args) {
		
		String given=" I/ LOVE/ MY/ INDIA";
		String ref="/";
		String out[]=given.split(ref);
		System.out.println(out[3]);
		
		for(int i=0; i<=3; i++)
		{
			System.out.println(out[i]);
		}

	}

}
