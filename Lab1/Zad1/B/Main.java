import java.util.Scanner;
import java.util.Locale;

import java.lang.Math.*;

public class Main{
  	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    	System.out.println("Podaj liczbe naturalna N, nastepnie wprowadz N liczb naturalnych.");
    	int n = scan.nextInt();
    	int wynik = 0;
    	for(int i=0; i<=n; i++){
      		wynik *= scan.nextInt();
    	}
  	}

}
