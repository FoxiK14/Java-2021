import java.util.Scanner;
import java.lang.String;

public class Zadanie1_a
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Podaj łańcuch znaków");
		String string = inp.next();
		
		System.out.println("Podaj literę do sprawdzenia");
		char c = inp.next().charAt(0);

		System.out.printf("Ilość wystąpień znaku %c to %d\n",c,countChar(string,c));	
	}

	private static int countChar(String string,char c)
	{	
		int length = string.length();
		int num = 0;
		for(int y = 0; y < length; y++)
		{
			if(c == string.charAt(y))
			{
				num++;	
			}
		}

		return num;
	}
}

