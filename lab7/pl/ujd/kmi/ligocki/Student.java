package pl.ujd.kmi.ligocki;

public class Student extends Osoba {
    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return getNazwisko() + " " + getRokUrodzenia() + " " + kierunek;
    }

    @Override
    public String getNazwisko() {
        return super.getNazwisko();
    }

    @Override
    public int getRokUrodzenia() {
        return super.getRokUrodzenia();
    }

    public String getKierunek() {
        return kierunek;
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


    private String kierunek;
}
