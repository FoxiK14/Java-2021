import java.util.*;
import static java.lang.Math.*;
public class Zadanie1f
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();
        
        double suma = 0;

        for(int a = 0;a < n;a++)
        {   
            System.out.printf("Podawaj kolejne liczby\n");
            double skladnik = pow((wejscie.nextDouble()),2);
            suma += skladnik ;
        }

        System.out.printf("Suma wynosi %f\n",suma);
    }
}  
