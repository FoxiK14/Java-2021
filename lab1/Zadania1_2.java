import static java.lang.Math.*;
public class Zadanie1_2
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.printf("Podaj liczbę skladników\n");
        int n = wejscie.nextInt();

        double[] ciąg = new double[n];

        System.out.printf("Podaj kolejną liczbę\n");

        double i = wejscie.nextDouble();
        ciąg[n-1] = i;

        for(int x = 0; x < n-1 ; x++)
        {
                System.out.printf("Podaj kolejną liczbę\n");
                double k = wejscie.nextDouble();
                ciąg[x] = k;
        }

        for(int x = 0; x < n ; x++)
        {
                System.out.printf("%f,",ciąg[x]);
        }

        System.out.printf("\n");
    }
}
