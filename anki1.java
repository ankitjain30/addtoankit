import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a>0)
		{System.out.println(" number is positive");
		}
		else if(a<0)
		{ System.out.println(" number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
		}
	
}