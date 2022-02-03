import pl.ujd.kmi.ligocki.BetterRectangle;

public class TestBetterRectangle {
    public static void main(String[] args)
    {

        BetterRectangle x=new BetterRectangle();

        x.setLocation(3,4);
        x.setSize(10,20);

        System.out.println("Obwód " + x.getPerimeter());
        System.out.println("Pole " + x.getArea());

    }
}
