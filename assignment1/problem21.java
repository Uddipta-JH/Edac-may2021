import java.util.*;
class problem21
{
	public static void main(String args[])
	{
		int dec,rem,i=0;
		Scanner sc=new Scanner(System.in);
		int a[]= new int[10];
		
		System.out.println("Enter number:");
		dec=sc.nextInt();
		
		while(dec>0)
		{
			rem=dec%8;
			a[i++]=rem;
			dec=dec/8;
		}
		
		System.out.println("Octal number:");
		for(int j=i-1;j>=0;j--)
		{
		System.out.print(a[j]);
		}
	}
}