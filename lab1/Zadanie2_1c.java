import java.util.*;
import static java.lang.Math.*;
public class Zadanie2_1c
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();

        int suma = 0;

        for(int x = 0 ; x < n ; x++)
        {
                double skladnik = sqrt(wejscie.nextDouble());

                if(skladnik % 3 == 0 && skladnik % 5 != 0)
                {
                        suma += 1;
                }

        }

        System.out.printf("Ilość liczb spełniających równanie wynosi %d\n",suma);
    }
}
