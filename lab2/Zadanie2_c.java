import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Zadanie2_c
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
		System.out.println("Maksymalna ilość wystąpień: "+ileMaksymalnych(arr));	
	}

		
	public static void generuj(int tab[],int n,int min_Wartosc,int max_Wartosc)
	{
		Random rand = new Random();
		for(int y = 0; y < n; y++)
		{
			tab[y] = rand.nextInt(max_Wartosc) - min_Wartosc;
		}
	}

	public static int ileMaksymalnych(int tab[])
	{
		int max = 0;
		int max_num = 0;
		for(int y = 0; y < tab.length;y++)
		{
			if(tab[y] > max)
			{
				max = tab[y];
				max_num = 1;
			}

			if(tab[y] == max)
			{
				max_num++;
			}
		}
		return max_num;	
	}
}	
