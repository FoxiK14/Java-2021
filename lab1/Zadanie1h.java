import java.util.*;
import static java.lang.Math.*;
public class Zadanie1h
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();

        double suma = 0;

        for(int a = 0;a < n;a++)
        {
            System.out.printf("Podaj kolejną liczbę\n");
            double g = wejscie.nextDouble();
            suma += g * pow((a+2),(-1));

        }

        System.out.printf("Suma wynosi %f\n",suma);
    }
}
