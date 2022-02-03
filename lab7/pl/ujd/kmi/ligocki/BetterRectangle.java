package pl.ujd.kmi.ligocki;

import java.awt.Rectangle;


public class BetterRectangle extends Rectangle {


    public BetterRectangle()
    {
        super();
        super.setLocation(x,y);
        super.setSize(width, height);
    }


    public int getPerimeter()
    {
        return 2*width+2*height;
    }

    public int getArea()
    {
        return width*height;
    }
}
