package pl.ujd.kmi.ligocki;

public class Nauczyciel extends Osoba {
    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return getNazwisko() + " " + getRokUrodzenia() + " " + pensja;
    }

    @Override
    public String getNazwisko() {
        return super.getNazwisko();
    }

    @Override
    public int getRokUrodzenia() {
        return super.getRokUrodzenia();
    }

    public int getPensja() {
        return pensja;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;
        Osoba other = (Osoba) obj;

        return getNazwisko() == other.getNazwisko() && getRokUrodzenia() == other.getRokUrodzenia();
    }

    private int pensja;
}
