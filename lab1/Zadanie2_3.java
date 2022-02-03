import java.util.*;
import static java.lang.Math.*;
public class Zadanie2_3
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();
        int dodatnie = 0;
        int zera = 0;
        int ujemne = 0;

        for(int x = 0; x < n; x++)
        {
                double wyraz = wejscie.nextDouble();

                if(wyraz > 0)
                {
                        dodatnie += 1;
                }

                if(wyraz == 0)
                {
                        zera += 1;
                }

                if(wyraz < 0)
                {
                        ujemne += 1;
                }

        }

        System.out.printf("Ilość liczb dodatnich wynosi %d\n",dodatnie);
        System.out.printf("Ilość zer wynosi %d\n",zera);
        System.out.printf("Ilość ujemnych wynosi %d\n",ujemne);
