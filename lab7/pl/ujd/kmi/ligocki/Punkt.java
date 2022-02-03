package pl.ujd.kmi.ligocki;


public class Punkt
{

    public Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }


    @Override
    public  boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass())
            return false;
        Punkt other = (Punkt) obj;

        return x ==other.x && y== other.y;
    }
    public void show()
    {
        System.out.println("<" + x + ", " + y + ">");
    }

    public int x()
    {
        return x;
    }

    public int y()
    {
        return y;
    }

    public int x, y;
}