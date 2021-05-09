import java.util.*;
class problem22
{
	public static void main(String args[])
	{
		int m=1;
		int fnum=0;
		int dnum=1,num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no:");
		num=sc.nextInt();
		
		/*if(num%10==1)
		{
			fnum=1;
		}*/
		
		while(num>0)
		{
			dnum=num%10;
			fnum=fnum+dnum*m;
			m=2*m;
			num=num/10;
		}

		System.out.println(fnum);
	}
}