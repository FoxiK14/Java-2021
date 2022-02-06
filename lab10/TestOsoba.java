import pl.kmi.ujd.kaluza.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("ligocki1", LocalDate.of(1999, 2, 20)));
        grupa.add(new Osoba("ligocki2", LocalDate.of(1999, 9, 13)));
        grupa.add(new Osoba("ligocki3", LocalDate.of(2000, 2, 20)));
        grupa.add(new Osoba("ligocki4", LocalDate.of(2000, 9, 13)));
        grupa.add(new Osoba("ligocki5", LocalDate.of(1999, 9, 13)));
        for (Osoba ludzie : grupa)
        {
            System.out.println(ludzie);
        }

    }
}
