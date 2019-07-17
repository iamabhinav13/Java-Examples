import java.util.*;
import java.io.*;
class qwe
{
	static void print()
	{
		int a=10;
		System.out.println("a:"+a);
	}	
	public static void main(String args[])
	{
		try
		{
			print();
		}
		finally
		{
			System.out.println("DONE");
		}
	}	
}