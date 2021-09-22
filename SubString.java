package stringHandling;

public class SubString {

	public static void main(String[] args) {
		String s1="Class is Class , Glass is Glass and Interface is Interface";
		String search= "is";
		String sub="was",result="";
		int i;
		System.out.println("Given String :-> \n"+s1);
		
		System.out.println("---------------------------------------------------------------------\nSubstring by replasing is by was one by one :->");
		
		do {
		System.out.println(s1);
		 i=s1.indexOf(search);
		
		if(i!=-1)
		{
			result=s1.substring(0,i);
			result=result+sub;
			result=result+s1.substring(i+search.length());
			s1=result;
		}

	}while(i!=-1);
		
		System.out.println("---------------------------------------------------------------------\nString :->\n"+s1);
		
		System.out.println("\ns1.substring(17) :->\n"+s1.substring(17));
		
		System.out.println("\ns1.substring(17,16) :-> \n"+s1.substring(17,33));

		
		System.out.println("\ns1.substring(and,61) :-> \n"+s1.substring(s1.indexOf("and"),61));
	}
	 
  
}

/*OUTPUT
 * Given String :-> 
Class is Class , Glass is Glass and Interface is Interface
---------------------------------------------------------------------
Substring by replasing is by was one by one :->
Class is Class , Glass is Glass and Interface is Interface
Class was Class , Glass is Glass and Interface is Interface
Class was Class , Glass was Glass and Interface is Interface
Class was Class , Glass was Glass and Interface was Interface
---------------------------------------------------------------------
String :->
Class was Class , Glass was Glass and Interface was Interface

s1.substring(17) :->
 Glass was Glass and Interface was Interface

s1.substring(17,16) :-> 
 Glass was Glass

s1.substring(and,61) :-> 
and Interface was Interface
*/
 

