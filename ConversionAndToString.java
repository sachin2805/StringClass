package stringHandling;

class Dimensions
{
	double w,h,d;
	Dimensions(double w, double h, double d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
	}
	public String toString()
	{
		return "Dimensions are : "+w+" by "+h+" by "+d;
		
	}
	
	
}
public class ConversionAndToString {

	public static void main(String[] args) {
		Dimensions d=new Dimensions(10, 12, 14);
		System.out.println(d);
		
		String d1="Box = "+d;
		System.out.println(d1);
		

	}

}
/*OUTPUT
Dimensions are : 10.0 by 12.0 by 14.0
Box = Dimensions are : 10.0 by 12.0 by 14.0
*/