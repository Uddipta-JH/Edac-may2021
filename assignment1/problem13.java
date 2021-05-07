import java.util.*;
class problem13
{
	public static void main(String args[])
	{
	float w,h,area,pmeter;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter width of rectangle:");
	w=sc.nextFloat();
	System.out.println("Enter heigh of rectangle:");
	h=sc.nextFloat();
	area=w*h;
	pmeter=2*(w+h);
	System.out.println("Area is "+w+"*"+h+"="+area);
	System.out.println("Perimeter is 2*("+w+"+"+h+")="+pmeter);
	}
}