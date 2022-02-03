import java.util.Scanner;
import java.math.BigInteger;
import java.lang.Math;

public class Zadanie4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj n");
		int n = input.nextInt();
		int n2 = n*n;
		
		BigInteger suma = new BigInteger("0");	
		for(int y = 0;y < n2;y++)
		{	
			BigInteger two = new BigInteger("2");
			two = two.pow(y);
			suma = suma.add(two);
		}

		System.out.println("Ilość ziaren wynosi: "+suma);
	}
}
