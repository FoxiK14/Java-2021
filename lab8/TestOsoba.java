import pl.ujd.kmi.ligocki.Osoba;
import pl.ujd.kmi.ligocki.Pracownik;
import pl.ujd.kmi.ligocki.Student;

import java.util.*;
import java.time.LocalDate;

public class TestOsoba
{

    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        LocalDate date = LocalDate.of(2020, 1, 8);
        ludzie[0] = new Pracownik("Kowalski",new String[] {"Jan"}, LocalDate.of(1998,10,20),true,50000,date);
        ludzie[1] = new Student("Nowak", new String[] {"Małgorzata"},LocalDate.of(1995,11,13),false,"informatyka",4.3);
        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + " " +  Arrays.toString(p.getImiona()) + " " + "Data urodzenia "+ p.getDataUrodzenia() + " " + "Płeć " + p.getPlec() + " " + " " + p.getOpis());
        }
    }
}






