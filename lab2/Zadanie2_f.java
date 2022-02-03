import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Zadanie2_f
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
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
		
		generuj(arr,arr_args,999,1998);
		signum(arr);

		for(int y = 0;y < arr_args;y++)
		{
			int arg = arr[y];
			System.out.printf("%d ",arg);
		}
		System.out.println(" ");	
	}

		
	public static void generuj(int tab[],int n,int min_Wartosc,int max_Wartosc)
	{
		Random rand = new Random();
		for(int y = 0; y < n; y++)
		{
			tab[y] = rand.nextInt(max_Wartosc) - min_Wartosc;
		}
	}

	public static void signum(int tab[])
	{
		for(int y = 0; y < tab.length; y++)
		{
			if(tab[y] > 0)
			{
				tab[y] = 1;
			}

			if(tab[y] < 0)
			{
				tab[y] = -1;
			}
		}
	}
}
