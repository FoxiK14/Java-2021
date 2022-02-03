import pl.ujd.kmi.ligocki.Flet;
import pl.ujd.kmi.ligocki.Instrument;
import pl.ujd.kmi.ligocki.Fortepian;
import pl.ujd.kmi.ligocki.Skrzypce;


import java.util.ArrayList;



class TestInstrument
{
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet());
        orkiestra.add(new Fortepian());
        orkiestra.add(new Skrzypce());
        orkiestra.add(new Skrzypce());
        orkiestra.add(new Fortepian());
        for (Instrument i : orkiestra) {
            i.dzwiek();
        }
        for(Instrument i : orkiestra)
        {
            System.out.println(i.toString());
        }
        }
    }

















