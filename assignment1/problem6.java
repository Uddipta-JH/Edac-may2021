import java.util.*;
class problem6
{
	public static void main(String args[])
		{
		int a,b,sum,sub,add,multi,div,mod;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 :");
		a=sc.nextInt();
		System.out.println("Enter number 2 :");
		b=sc.nextInt();
		sum=a+b;
		sub=a-b;
		multi=a*b;
		div=a/b;
		mod=a%b;
		System.out.println("Addition:"+sum);
		System.out.println("Subtraction:"+sub);
		System.out.println("Multiplication:"+multi);
		System.out.println("Division:"+div);
		System.out.println("Modulation:"+mod);
		}
}
				