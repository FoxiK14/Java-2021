mport java.util.*;
import static java.lang.Math.*;
public class Zadanie2_1d
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();
        int suma = 0;

        double[] ciąg = new double[n];

        for(int x = 0; x < n ; x++)
        {
                System.out.printf("Podaj kolejną liczbę\n");
                double k = wejscie.nextDouble();
                ciąg[x] = k;
        }

        for(int x = 1; x < n-1 ; x++)
        {
                if(ciąg[x] < ((ciąg[x-1] + ciąg[x+1]) / 2 ))
                {
                        suma += 1;
                }
        }

        System.out.printf("Ilość liczb spełniających równanie wynosi %d\n",suma);

    }
}
