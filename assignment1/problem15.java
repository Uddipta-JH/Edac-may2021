import java.util.*;
class problem15
{
	public static void main(String args[])
	{
		int trash,x,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value x:");
		x=sc.nextInt();
		System.out.println("Enter value y:");
		y=sc.nextInt();
		trash=x;
		x=y;
		y=trash;
		System.out.println("Value x swapped:"+x);
		System.out.println("Value y swapped:"+y);
	}
}
		