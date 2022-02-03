package pl.ujd.kmi.ligocki;

import java.time.LocalDate;

public class Osoba implements Comparable<Osoba>{

    public Osoba(String nazwisko,LocalDate dataUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }
    private String nazwisko;
    private LocalDate dataUrodzenia;

	@Override
    public int compareTo(Osoba o)
    {
        int wynik=nazwisko.compareTo(o.nazwisko);
        if(wynik!=0)
        {
            return wynik;
        }
        else return dataUrodzenia.compareTo(o.dataUrodzenia);
    }
    @Override
    public String toString()
    {
        return getClass().getName() + " "+ "[" + nazwisko + " "+ dataUrodzenia + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;
        Osoba other = (Osoba) obj;

        return nazwisko.equals(other.nazwisko) && dataUrodzenia.equals(other.dataUrodzenia);
    }

}
