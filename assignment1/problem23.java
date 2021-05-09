import java.util.*;
class problem23
{
	public static void main(String args[])
	{
	int m=1,num,fnum=0,rem2,rem;
	char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};
	String b="";
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter no:");
	num=sc.nextInt();
	
	while(num>0)
	{
		rem=num%10;
		fnum=fnum+m*rem;
		m=2*m;
		num=num/10;
	}
	
	while(fnum>0)
	{
		rem2=fnum%16;
		b=a[rem2]+b;
		fnum=fnum/16;
	}
	
	System.out.println(b);
	}
}