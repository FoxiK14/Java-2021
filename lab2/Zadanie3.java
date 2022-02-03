import java.util.Scanner;
import java.util.Random;

public class Zadanie3
{
	public static void main(String[] args)
	{
		int n;int k;int m;
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Podaj wartość liczby m w zakresie od 0 do 10");
			m = input.nextInt();

			System.out.println("Podaj wartość liczby n w zakresie od 0 do 10");
			n = input.nextInt();
		
			System.out.println("Podaj wartość liczby k w zakresie od 0 do 10");
			k = input.nextInt();

			if(n >= 0 && n <= 10 && m >= 0 && m <= 10 && k >= 0 && k <= 10)
			{
				input.close();
				System.out.printf("\n");
				break;
			}

			else
			{
				System.out.println("Podaj poprawne wartości liczb!");
			}
		}
		
		int[][] matrix1 = new int[m][n];
		int[][] matrix2 = new int[n][k];
		int[][] matrix3 = new int[m][k];

		generuj(matrix1,m,n);
		generuj(matrix2,n,k);
		System.out.println("Macierz 1.");
		wypisz(matrix1,m,n);
		System.out.println("Macierz 2.");
		wypisz(matrix2,n,k);
		iloczyn(matrix1,matrix2,matrix3,m,n,k);
		System.out.println("Macierz wynikowa");
		wypisz(matrix3,m,k);


	}
	
	public static void generuj(int tab[][],int x,int y)
	{
		Random rand = new Random();
		for(int p = 0; p < x; p++)
		{
			tab[p][0] = rand.nextInt(10);

			for(int o = 1; o < y; o++)
			{
				tab[p][o] = rand.nextInt(10);
			}
		}
	}

	public static void wypisz(int tab[][],int x,int y)
	{
		for(int p = 0; p < x; p++)
		{
			for(int o = 0; o < y; o++)
			{
				int arg = tab[p][o];
				System.out.printf("%d ",arg);
			}
			System.out.println("\n");
		}
	}

	public static void iloczyn(int tab1[][],int tab2[][],int tab3[][],int x,int y,int z)
	{
		int n1 = x;
		int n2 = y;
		int n3 = z;
		for(int o = 0; o < n1; o++)
		{	
			int arg = 0;
			for(int p = 0; p < n3; p++)
			{	
				for(int q = 0; q < n2; q++)
				{
					arg += tab1[o][q] * tab2[q][p];
				}
				tab3[o][p] = arg;	
			}
		}	
	}
}

