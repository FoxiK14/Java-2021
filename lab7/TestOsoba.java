import pl.ujd.kmi.ligocki.Nauczyciel;
import pl.ujd.kmi.ligocki.Osoba;
import pl.ujd.kmi.ligocki.Student;

public class TestOsoba {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Nazwisko", 2001);
        Student student = new Student("Nazwisko", 2001,"Informatyka");
        Nauczyciel nauczyciel = new Nauczyciel("Kowalski", 1975,2300);

        System.out.println(osoba.toString());
        System.out.println(student.toString());
        System.out.println(nauczyciel.toString());
        System.out.println(osoba.equals(osoba));
        System.out.println(nauczyciel.equals(osoba));
        System.out.println(student.equals(osoba));
        System.out.println(osoba.getNazwisko());
        System.out.println(student.getKierunek());
        System.out.println(nauczyciel.getPensja());

    }
}


