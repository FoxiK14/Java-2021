import java.util.*;
import static java.lang.Math.*;
public class Zadanie2_4
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();
        double max = 0;

        for(int x = 0; x < n; x++)
        {
                double wyraz = wejscie.nextDouble();

                if(wyraz > max )
                {
                        max = wyraz;
                }

        }



        System.out.printf("Największa liczba wynosi %d\n",max);
    }
}