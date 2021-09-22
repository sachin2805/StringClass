package stringHandling;

import java.util.Scanner;

public class CreateString {

	public  static void main(String args[])
	{
	char a[]= {'s','o','n','a','l','i'} ;
		
		
		String s=new String(a);
		String s1= "Sachin";
		String s2="Sachin";
		String s3="SACHIN";
		
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("Check Using == //check addresess\n"+(s1==s2));//that check addresses
		System.out.println("Check Using equals() method\n"+s1.equals(s2));
		//check equality
		System.out.println("Check Using equals() method\n"+s1.equals(s3));
		//ignore case and check equality
		System.out.println("Check Using equalsIgnoreCase() method\n"+s1.equalsIgnoreCase(s3));
	}
}
/*OUTPUT
sonali
Sachin
Check Using == //check addresess
true
Check Using equals() method
true
Check Using equals() method
false
Check Using equalsIgnoreCase() method
true
*/
