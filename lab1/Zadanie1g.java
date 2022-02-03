import java.util.*;
import static java.lang.Math.*;
public class Zadanie1g
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();

        double suma = 0;
        double iloczyn = 1;

        for(int a = 0;a < n;a++)
        {
            System.out.printf("Podawaj kolejne liczby\n");
            double g = wejscie.nextDouble();
            suma += g;
            iloczyn *= g;
        }

        double sumailoczyn = suma + iloczyn;

        System.out.printf("Suma wynosi %f\n",sumailoczyn);
    }
}
