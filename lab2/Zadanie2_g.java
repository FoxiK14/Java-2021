import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Zadanie2_g
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	
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
		
		generuj(arr,arr_args,999,1998);
		wypisz(arr);
		odwrocFragment(arr,lewy,prawy);
		wypisz(arr);
	
	}

		
	public static void generuj(int tab[],int n,int min_Wartosc,int max_Wartosc)
	{
		Random rand = new Random();
		for(int y = 0; y < n; y++)
		{
			tab[y] = rand.nextInt(max_Wartosc) - min_Wartosc;
		}
	}

	public static void wypisz(int arr[])
	{
	
		for(int y = 0;y < arr.length;y++)
		{
			int arg = arr[y];
			System.out.printf("%d ",arg);
		}
		System.out.println(" ");	
	}

	public static void odwrocFragment(int tab[],int lewy,int prawy)
	{
	
		double counter = Math.floor(((double)prawy/2));
		int counter1 = 0;

		for(int y = lewy; y < lewy+counter; y++)
		{
			System.out.println("1");
			int help = tab[y];
       			tab[y] = tab[prawy - counter1];
			tab[prawy - counter1] = help;
			counter1++;			
		}
	}
}
