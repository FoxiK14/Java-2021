import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Zadanie1_g
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();	
		int arr_args;
		int lewy;
		int prawy;
		while(true)
		{	
			System.out.println("Podaj wielkość tablicy");			
			arr_args = input.nextInt();

			System.out.println("Podaj lewy koniec przedziału");
			lewy = input.nextInt();

			System.out.println("Podaj prawy koniec przedziału");
			prawy = input.nextInt();


			if(arr_args > 0 && lewy >= 1 && lewy < prawy && prawy >= 1 && arr_args > prawy)
			{
				break;	
			}
			else 
			{	
				System.out.println("Podałeś niepoprawne wartości");
			}
		}

		int[] arr = new int[arr_args];
		
		for(int y = 0; y < arr_args; y++)
		{
			arr[y] = rand.nextInt(1998) - 999;
		}

		for(int y = 0; y < arr_args;y++)
		{
			int arg = arr[y];
			System.out.printf("%d ",arg);		
		}

		System.out.printf("\n");		
		
		double counter = Math.floor(((double)prawy/2));
		int counter1 = 0;

		for(int y = lewy; y < lewy+counter; y++)
		{
			System.out.println("1");
			int help = arr[y];
       			arr[y] = arr[prawy - counter1];
			arr[prawy - counter1] = help;
			counter1++;			
		}

		for(int y = 0;y < arr_args;y++)
		{
			int arg = arr[y];
			System.out.printf("%d ",arg);
		}
		
		System.out.printf("\n");		

	}
}
