import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Zadanie1_a
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Podaj wielkość tabeli");	
		int arr_args;
		while(true)
		{	
			arr_args = input.nextInt();
			if(arr_args <= 0)
			{
				System.out.println("Wielkość tabeli musi być liczbą nieujemną!");	
			}
			else 
			{	
				input.close();
				break;
			}
		}

		int[] arr = new int[arr_args];
		
		for(int y = 0; y < arr_args; y++)
		{
			arr[y] = rand.nextInt(1998) - 999;
		}

		int parz = 0;
		int nieparz = 0;

		for(int y = 0; y < arr_args; y++)
		{
			if(arr[y] % 2 == 0)
			{
				parz++;
			}

			else nieparz++;	
		}

		System.out.println("Ilość parzystych wynosi "+parz+" Ilość nieparzystych wynosi "+nieparz);	
	}
}


