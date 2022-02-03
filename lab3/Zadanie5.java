import java.util.Scanner;
import java.math.BigDecimal;
import java.lang.Math;

public class Zadanie5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj n");
		int n = input.nextInt();
		System.out.println("Podaj k");
		BigDecimal k = input.nextBigDecimal();
		System.out.println("Podaj p");
		BigDecimal p = input.nextBigDecimal();
		BigDecimal one = new BigDecimal("1");
		input.close();
		BigDecimal suma = new BigDecimal("0");
			
		for(int y = 0;y < n;y++)
		{	
			suma = suma.add(k.multiply(p.add(one)));
		}

		System.out.println("Wielkość kapitału po n latach wynosi: "+suma);
	}
}
