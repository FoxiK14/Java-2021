package pl.kmi.ujd.ligocki;

import java.time.LocalDate;

public class Osoba implements Comparable, Cloneable{

    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    //
    @Override
    public int compareTo(Object o) {
        Osoba osoba = (Osoba) o;
        int temp_len;
        if (osoba.nazwisko.length() > this.nazwisko.length())
        {
            temp_len = this.nazwisko.length();
        }
        else
        {
            temp_len = osoba.nazwisko.length();
        }
        for (int i = 0; i < temp_len; i++)
        {
            if (osoba.nazwisko.charAt(i) > this.nazwisko.charAt(i))
            {
                return -1;
            }
            else if (osoba.nazwisko.charAt(i) < this.nazwisko.charAt(i))
            {
                return 1;
            }
            if (osoba.dataUrodzenia.isAfter(this.dataUrodzenia))
            {
                return -1;
            }
            if (osoba.dataUrodzenia.isBefore(this.dataUrodzenia))
            {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString(){
        return this.getClass() + "[" + nazwisko + " : " + dataUrodzenia + "]";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (this.getClass() != o.getClass() || o.getClass() == null) return false;
        Osoba osoba = (Osoba) o;
        return this.nazwisko.equals(osoba.nazwisko) && this.dataUrodzenia == osoba.dataUrodzenia;
    }



    private String nazwisko;
    private LocalDate dataUrodzenia;

}
