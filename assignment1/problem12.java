import java.util.*;
class problem12
{
	public static void main(String args[])
		{
		Scanner sc= new Scanner(System.in);
		double sum=0,a,avg;
		for(int i=1;i<=3;i++)
			{
			System.out.println("Enter no "+i+":");
			a=sc.nextInt();
			sum+=a;
			}
		avg=sum/3;
		System.out.println("Average of 3 no.s:"+avg);
		}
}
			