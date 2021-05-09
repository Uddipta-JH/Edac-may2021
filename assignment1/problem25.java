import java.util.Scanner;
class problem25
{
	public static void  main(String args[])
	{
		int rem,num,fnum=0,m=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		while(num>0)
		{
			rem=num%10;
			fnum=fnum+rem*m;
			m=m*8;
			num=num/10;
		}
		
		System.out.print("Decimal no:"+fnum);
	}
}