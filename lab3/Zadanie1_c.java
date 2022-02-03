import java.util.Scanner;
import java.lang.String;
import java.lang.Math;

public class Zadanie1_c
{
	public static void main(String[] args)
	{	
		System.out.println("Podaj łańcuch znaków");
		Scanner input = new Scanner(System.in);
		String str = input.next();
			
		if(str.length() > 2)
		{
			System.out.println("Środkowy znak podanego łańucha to: "+middle(str));
		}

		else
		{
			System.out.println("Łańcuch jest za krótki");
		}		
	}

	public static String middle(String str)
	{	
		int str_lng = str.length();
		int range = (int)Math.floor(str_lng/2);
		
		if(str_lng % 2 == 0)
		{
			String x = str.substring((range-1),(range+1));
			return x;
		}

		else
		{
			String y = str.substring(range,(range+1));
			return y;
		}
	}

}
