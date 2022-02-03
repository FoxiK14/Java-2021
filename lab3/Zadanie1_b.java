import java.util.Scanner;
import java.lang.String;

public class Zadanie1_b 
{
	public static void main(String[] args)
	{	
		Scanner inp = new Scanner(System.in);
		System.out.println("Podaj łańcuch");
		String str = inp.next();
		System.out.println("Podaj łanuch do sprawdzenia");
		String subStr = inp.next();
		inp.close();
		
		System.out.println("Napis "+subStr+" wystąpił "+countSubStr(str,subStr)+" razy");
				
	}

	private static int countSubStr(String str,String substr)
	{
		int str_lngth = str.length();
		int substr_lngth = substr.length();
		int num = 0;
		
		for(int y = 0; y < (str_lngth - substr_lngth+1);y++)
		{	
			String check = str.substring(y,(y+substr_lngth));
			if(check.equals(substr))
			{	
				num++;	
			}	
		}

		return num;
	}
}
