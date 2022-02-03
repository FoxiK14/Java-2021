import java.util.Scanner;
import java.lang.String;

public class Zadanie1_d
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj łańcuch znaków");
		String str = input.next();
		int n;
		while(true)
		{
			System.out.println("Podaj liczbę powtórzeń łańcucha");
			n = input.nextInt();
			if(n > 0)
			{
				input.close();
				break;
			}

			else
			{
				System.out.println("Liczba musi być większa od zera");
			}	
		}

		System.out.println("Otrzymany łańcuch: "+repeat(str,n));

	}

	public static String repeat(String str,int n)
	{	
		String str_hlp = str;
		for(int y = 0;y < n;y++)
		{
			str_hlp += str;
		}

		return str_hlp;
	}
}
