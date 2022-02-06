package pl.kmi.ujd.ligocki;

import java.time.LocalDate;

public class Student extends Osoba implements Comparable, Cloneable{

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (super.compareTo(o) == 0)
        {
            if (student.sredniaOcen > this.sredniaOcen)
            {
                return 1;
            }
            else if (student.sredniaOcen < this.sredniaOcen)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
        return super.compareTo(o);
    }

    private double sredniaOcen;
}
