import pl.ujd.kmi.ligocki.Osoba;

import java.time.LocalDate;
import java.util.Arrays;

public class OsobaTest {
    public static void main(String[] args)
    {
        Osoba[] grupa=new Osoba[5];
        grupa[0]= new Osoba("Kowalski",LocalDate.of(1984,11,23));
        grupa[1]= new Osoba("Kowalski",LocalDate.of(1973,4,11));
        grupa[2]= new Osoba("Nowak",LocalDate.of(1965,6,13));
        grupa[3]= new Osoba("Lewandowski",LocalDate.of(1965,6,13));
        grupa[4]=new Osoba("Nazwisko",LocalDate.of(2001,12,28));
		System.out.println("Przed sortowaniem");
        for (Osoba p : grupa) {
            System.out.println(p.toString());
        }

        Arrays.sort(grupa);
		System.out.println("Po sortowaniu");
        for (Osoba p : grupa) {
            System.out.println(p.toString());
        }
    }
}
