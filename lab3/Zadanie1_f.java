import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Character;

public class Zadanie1_f
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj łańcuch znaków");
		String str = input.next();
		System.out.println(change(str));
	}

	public static String change(String str)
	{
		int str_lng = str.length();
		StringBuffer str_bfr = new StringBuffer(str_lng);

		for(int y = 0;y < str_lng;y++)
		{
			if(Character.isLowerCase(str.charAt(y)))
			{
				str_bfr.append(Character.toUpperCase(str.charAt(y)));
			}

			else
			{
				str_bfr.append(Character.toLowerCase(str.charAt(y)));
			}
		}
		
		
		return str_bfr.toString();
	}
}
