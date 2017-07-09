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
		int ch  = s.nextInt();
		if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||
		ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
		{
	     System.out.println("vowel");
		}
		else
		{
			System.out.println("consonant");
		}
		
		
		}
	
}
