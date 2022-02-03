import java.util.*;
public class Zadanie1a
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();
        
        float suma = 0;

        for(int a = 0;a < n;a++)
        {   
            System.out.printf("Podawaj kolejne liczby\n");
            float skladnik = wejscie.nextFloat();
            suma += skladnik ;
        }

        System.out.printf("Suma wynosi %f\n",suma);
    }
}           
