import java.util.*;
import static java.lang.Math.*;
public class Zadanie1c
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj ilość składników\n");
        int n = wejscie.nextInt();

        float suma = 0;
        for(int a = 0;a < n;a++)
        {
            System.out.printf("Podawaj kolejne składniki\n");
            float skladnik = abs(wejscie.nextFloat());
            suma += skladnik;
        }

        System.out.printf("Suma wynosi %f\n",suma);
    }
}
