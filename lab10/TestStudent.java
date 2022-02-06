import pl.kmi.ujd.kaluza.Osoba;
import pl.kmi.ujd.kaluza.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Student("ligocki1", LocalDate.of(1999, 2, 20), 3.78));
        grupa.add(new Student("ligocki2", LocalDate.of(1999, 9, 13), 4.25));
        grupa.add(new Student("ligocki3", LocalDate.of(2000, 2, 20), 3.23));
        grupa.add(new Student("ligocki4", LocalDate.of(2000, 9, 13), 5.0));
        grupa.add(new Student("ligocki5", LocalDate.of(1999, 9, 13), 4.8));
        for (Osoba ludzie : grupa) {
            System.out.println(ludzie);
        }
    }

}
