package stringHandling;

public class StringJoin {

	public static void main(String[] args) {
		String s1=String.join("Worlds","Femous","Lower");
		
		System.out.println(s1);
		
		
	 s1=String.join(" ","Worlds","Femous","Lower");
		
		System.out.println(s1);
		
		String s2=String.join(" , ", " Email","Name"," Address");
		
		System.out.println(s2);

	}

}
/*OUTPUT
FemousWorldsLower
Worlds Femous Lower
 Email , Name ,  Address

 */
