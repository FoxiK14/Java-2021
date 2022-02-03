import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.String;
import java.io.*;

public class Zadanie2
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(args[0]));
		String znak = args[1];
		StringBuffer text = new StringBuffer(100);
		
		while(file.hasNext())
		{
			text = text.append(file.next());
		}
		file.close();

		int text_lng = text.length();
		int ilosc = 0;
		for(int y = 0;y < text_lng;y++)
		{	
			//StringBuffer sgn = new StringBuffer(text.charAt(y));
			//System.out.println(((StringBuffer)text.charAt(y)));
			if(znak.charAt(0) == (text.charAt(y)))
			{
				ilosc++;
			}
		}

		System.out.println("Znak "+znak+" wystąpił "+ilosc+" razy.");
	}
}
