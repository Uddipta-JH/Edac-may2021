import java.util.*;
class problem7
{
	public static void main(String Args[])
		{
		Scanner sc=new Scanner(System.in);
		int num,multi;
		System.out.println("Enter Number:");
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
			{
			multi=num*i;
			System.out.println(num+"*"+i+"="+multi);
			}
		}
}