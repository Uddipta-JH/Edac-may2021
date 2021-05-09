import java.util.*;
class prob20
{
	public static void main(String args[])
	{
		int dec,rem;
		String hex1="";
		char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter decimal no.:");
		dec=sc.nextInt();
		
		while(dec>0)
		{
			rem=dec%16;
			hex1=ch[rem]+hex1;
			dec=dec/16;
		}
		
		System.out.println("Hexadecimal no.:"+hex1);
	}
}