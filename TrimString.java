package stringHandling;
//trim() or strip()-> Use to remove starting and ending space of string
public class TrimString {

	public static void main(String[] args) {
	String s1="     My name is Sachin     ";
	String s2="     Sea is c    ";
	
	System.out.println("Given String:\n"+s1);
	System.out.println("\nUsing trim() Or strip()  :\n"+s1.strip()+"\n"+s2.trim()); //
	
	
	System.out.println("\nUsing stripLeading() :\n"+s2.stripLeading()); // Remove starting space
	
	System.out.println("\nUsing stripTrailing() :\n"+s2.stripTrailing()); //Remove last space
	

	}

}
/*OUTPUT
Given String:
     My name is Sachin     

Using trim() Or strip()  :
My name is Sachin
Sea is c

Using stripLeading() :
Sea is c    

Using stripTrailing() :
     Sea is c


*/