import java.util.*;
public class Zadanie1b
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj ilość czynników\n");
        int n = wejscie.nextInt();

        float iloczyn = 1;
        for(int a = 0;a < n;a++)
        {
            System.out.printf("Podawaj kolejne czynniki\n");
            float czynnik = wejscie.nextFloat();
            iloczyn *= czynnik;
        }

        System.out.printf("Iloczyn wynosi %f\n",iloczyn);
    }
}
