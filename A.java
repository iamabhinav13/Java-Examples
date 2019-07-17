import java.util.*;
import java.io.*;
class A
{
	public static void main(String args[])
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=r.nextInt();
		System.out.println("Enter the power of the no.");
		int b=r.nextInt();
		int s=0;
		for(int i=1;i<=b;i++)
		{
			s=a*a*i;
		}
		System.out.println("Ans"+s);
	}
}