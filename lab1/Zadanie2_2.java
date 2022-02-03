import java.util.*;
import static java.lang.Math.*;
public class Zadanie2_2
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();
        int suma = 0;

        for(int x = 0; x < n; x++)
        {
                double wyraz = wejscie.nextDouble();
                if( wyraz > 0)
                {
                        suma += wyraz;
                }
        }

        suma *= 2;

        System.out.printf("Suma wynosi %d\n",suma);

    }
}
