import java.util.*;
import static java.lang.Math.*;
public class Zadanie1d
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj ilość składników\n");
        int n = wejscie.nextInt();

        double suma = 0;
        for(int a = 0;a < n;a++)
        {
            System.out.printf("Podawaj kolejne składniki\n");
            double skladnik = sqrt(abs(wejscie.nextDouble()));
            suma += skladnik;
        }

        System.out.printf("Suma wynosi %lf\n",suma);
    }
}
