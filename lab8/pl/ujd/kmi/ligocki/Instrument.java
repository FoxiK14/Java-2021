package pl.ujd.kmi.ligocki;

import java.time.LocalDate;

public abstract class Instrument
{
    private String producent;
    private LocalDate rokProdukcji;

    public String getProducent()
    {
        return producent;
    }

    public LocalDate getRokProdukcji()
    {
        return rokProdukcji;
    }

    public abstract void dzwiek();

@Override
    public String toString()
    {
        return "("+ getProducent() +"," + getRokProdukcji() +")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;
        Instrument other = (Instrument) obj;

        return getProducent() == other.getProducent() && getRokProdukcji() == other.getRokProdukcji();
    }





}
