import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Zadanie1_c
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

		int max = 0;
		int max_num = 0;

		for(int y = 0; y < arr_args; y++)
		{
			if(arr[y] > max)
			{
				max = arr[y];
				max_num = 1;
			}

			if(arr[y] == max)
			{
				max_num++;
			}
		}

		System.out.println("Wartość maksymalna to "+max+".Wystąpiła "+max_num+" razy.");	
	}
}

