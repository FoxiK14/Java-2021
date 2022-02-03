import java.util.*;
import static java.lang.Math.*;
public class Zadanie2_5
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();

        double[] ciąg = new double[n];
        int pary = 0;

        for(int x = 0; x < n ; x++)
        {
                System.out.printf("Podaj kolejną liczbę\n");
                double k = wejscie.nextDouble();
                ciąg[x] = k;
        }

        double[] ciąg = new double[n];

        for(int x = 0; x < n-1 ; x++)
        {
                if(ciąg[x] > 0 && ciąg[x+1] > 0)
                {
                        pary += 1;
                }

        }

        System.out.printf("Liczba par wynosi %d\n",pary);      
    }
}