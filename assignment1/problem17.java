import java.util.Scanner;
class problem17
{
	public static void main(String args[])
	{
		int m=1,i=0,rem,rem1,rem3,a1=0,a,b1=0,b,sum;
		Scanner sc=new Scanner(System.in);
		int c[]=new int[20];
		
		System.out.println("enter 1st no:");
		a=sc.nextInt();
		System.out.println("enter 2nd no:");
		b=sc.nextInt();
		
		while(a>0)
		{
		rem=a%10;
		a1=a1+rem*m;
		m=m*2;
		a=a/10;
		}
		m=1;
		while(b>0)
		{
		rem1=b%10;
		b1=b1+rem1*m;
		m=m*2;
		b=b/10;
		}
		
		sum=a1+b1;
		
		while(sum>0)
		{
			rem3=sum%2;
			c[i++]=rem3;
			sum=sum/2;
		}
		
		for(int j=i;j>=0;j--)
		{
		System.out.print(c[j]);
		}
	}
}