import java.util.Scanner;
class problem19
{
	public static void main(String args[])
	{
		int a,q,r,i=0;
		int b[]= new int[40];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		a=sc.nextInt();
		
		while(a>0)
		{
			q=a/2;
			r=a%2;
			a=q;
			b[i++]=r;
		}
		for(int j=i;j>=0;j--)
		{
		System.out.print(b[j]);
		}
			
	}
}
			
			