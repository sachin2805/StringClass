package stringHandling;

public class Getchar {

	public static void main(String[] args) {
		String s="Profound gives Java Cource in fisible rate";
			int start=0;
			int end=26;
			
			
			System.out.println(s);
			
			char b[]=new char[end-start];
			s.getChars(start, end, b, 0);
			System.out.println("After Using getChar() method -> \n");
			System.out.println(b);
			
	}

}
/*OUTPUT
Profound gives Java Cource in fisible rate
After Using getChar() method -> 

Profound gives Java Cource

*/