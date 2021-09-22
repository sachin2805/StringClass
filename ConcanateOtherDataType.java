package stringHandling;

public class ConcanateOtherDataType {

	public static void main(String[] args) {
		int age=21;
		
		String s1="Sachin";
		
		System.out.println(s1);
		s1=s1+age;
		System.out.println(s1);

	}

}
/*OUTPUT
Sachin
Sachin21
*/