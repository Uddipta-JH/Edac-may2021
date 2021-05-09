import java.util.*;
class problem24
{
	public static void main(String args[])
	{
	int m=1,fnum=0,num,rem,rem1,i=0;
	int a[]=new int[20];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a Binary no:");
	num=sc.nextInt();
	
	while(num>0)
	{
		rem=num%10;
		fnum=fnum+rem*m;
		m=m*2;
		num=num/10;
	}
	
	System.out.println("Decimal no"+fnum);
	
	while(fnum>0)
	{
		rem1=fnum%8;
		a[i++]=rem1;
		fnum=fnum/8;
	}
	
	for(int j=i;j>=0;j--)
	{
		System.out.print(a[j]);
	}
	}
}
	
	