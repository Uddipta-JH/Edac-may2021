import java.util.Scanner;
class problem11
{
	public static void main(String args[])
	{
		float r;
		double area;
		double pmeter;
		double pi=(double)22/7;
		
		//System.out.print(pi);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Radius:");
		r=sc.nextFloat();
		area=pi*r*r;
		pmeter=pi*2*r;
		
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+pmeter);
	}
}
