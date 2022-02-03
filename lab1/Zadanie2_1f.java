import java.util.*;
import static java.lang.Math.*;
public class Zadanie2_1f
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
                if(x % 2 == 0 && wyraz % 2 == 0)
                {
                        suma += 1;
                }
        }

        System.out.printf("Ilość liczb spełniających równanie wynosi %d\n",suma);

    }
}
