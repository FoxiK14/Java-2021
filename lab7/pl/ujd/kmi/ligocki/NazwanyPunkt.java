package pl.ujd.kmi.ligocki;

import pl.ujd.kmi.nazwisko.Punkt;

public class NazwanyPunkt extends Punkt
{

    public NazwanyPunkt(int x, int y, String name)
    {
        super(x, y);
        this.name = name;
    }



    public boolean equals(Object obj)
    {
        if (!super.equals(obj)) {
            return false;
        }

        // metoda super.equals sprawdziła, że this oraz otherObject
        // odnoszą się do obiektów tej samej klasy
        NazwanyPunkt other = (NazwanyPunkt) obj;
        return name.equals(other.name);
    }

    public void show()
    {
        System.out.println(name + ":<" + x() + ", " + y() + ">");
    }

    public String name;
}