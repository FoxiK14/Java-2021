import java.util.*;
import static java.lang.Math.*;
public class Zadanie2_1a
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();

        double suma = 0;

        for(int x = 0 ; x < n ; x++)
        {
                double skladnik = wejscie.nextDouble();

                if(skladnik % 2 == 1)
                {
                        suma += 1;
                }

        }

        System.out.printf("Ilość liczb parzystych wynosi %f\n",suma);
    }
}