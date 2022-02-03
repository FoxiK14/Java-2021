import java.util.*;
import static java.lang.Math.*;
public class Zadanie2_1e
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();
        int suma = 0;

        for(int x = 0; x < n; x++)
        {
                double silnia = 1;
                double wyraz = wejscie.nextDouble();
                for(int y = 1; y <= x+1; y++)
                {
                        silnia *= y;
                //      System.out.printf("Silnia wynosi %f\n",silnia);
                }

                if(wyraz > pow(2,x) && wyraz < silnia )
                {
                        suma += 1;
                }
        }

        System.out.printf("Ilość liczb spełniających równanie wynosi %d\n",suma);

    }
}
