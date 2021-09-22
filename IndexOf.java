package stringHandling;

public class IndexOf {

	public static void main(String[] args) {
	
		String s="Profound gives Java Cource in fisible fees";
		System.out.println("Using indexOf = "+s.indexOf('f'));
		
		System.out.println("Using lastIndexOf = "+s.lastIndexOf('f'));
System.out.println("Using indexOf('f',5) = "+s.indexOf('f',5));
		
		System.out.println("Using lastIndexOf('f',7) = "+s.lastIndexOf('f',7));

	}

}
/*OUTPUT
Using indexOf = 3
Using lastIndexOf = 38
Using indexOf('f',5) = 30
Using lastIndexOf('f',7) = 3

*/