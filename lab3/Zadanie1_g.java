import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Character;

public class Zadanie1_g
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
		int lng_chng = str_lng+1;
		int str_chng = 1;
		for(int y = 1;y < lng_chng;y++)
		{
			if(y % 4 == 0)
			{
				str_bfr.append("\'");
				lng_chng++;
				str_chng++;
			}

			else
			{
				str_bfr.append(str.charAt(y-str_chng));
			}	
		}
		
		return str_bfr.toString();
	}
}

