import java.util.Scanner;
class problem5
{
	public static void main(String args[])
	{
		int a,b,ans;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no.1:");
		a=sc.nextInt();
		System.out.println("Enter no.2:");
		b=sc.nextInt();
		
		ans=a*b;
		
		System.out.println(a+"*"+b+"="+ans);
		
	}
}