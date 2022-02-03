import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Zadanie2_a
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
		System.out.println("Nieparzyste: "+ileNieparzystych(arr)+" Parzyste: "+ileParzystych(arr));	
	}

		
	public static void generuj(int tab[],int n,int min_Wartosc,int max_Wartosc)
	{
		Random rand = new Random();
		for(int y = 0; y < n; y++)
		{
			tab[y] = rand.nextInt(max_Wartosc) - min_Wartosc;
		}
	}

	public static int ileNieparzystych(int tab[])
	{
		int niep = 0;
		for(int y = 0; y < tab.length;y++)
		{
			if(tab[y] % 2 == 1 || tab[y] % 2 == -1)
			{
				niep++;
			}
		}

		return niep;
	}

	
	public static int ileParzystych(int tab[])
	{
		int parz = 0;
		for(int y = 0; y < tab.length; y++ )	
		{
			if(tab[y] % 2 == 0)
			{
				parz++;
			}
		}

		return parz;
	}
}
