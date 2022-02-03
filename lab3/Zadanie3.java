import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.String;
import java.io.*;

public class Zadanie3
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(args[0]));
		String wyraz = args[1];	
		int ilosc = 0;

		while(file.hasNext())
		{	
			StringBuffer text = new StringBuffer(file.next());
			if(wyraz.equals(text.toString()))
			{
				ilosc++;
			}
		}
		file.close();

		System.out.println("Wyraz "+wyraz+" wystąpił "+ilosc+" razy.");
	}
}
