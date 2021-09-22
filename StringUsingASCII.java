package stringHandling;

public class StringUsingASCII {

	public static void main(String[] args) {
		byte a[]= {65,66,67,68,69,70};
		String s1=new String(a);
		System.out.println(s1);	//The convert ascii to char 
		
		
		//String s2=new String(a,starting index,number of words);
			String s2=new String(a,3,2);
System.out.println(s2);
	}

}

/*OUTPUT
ABCDEF
DE
*/