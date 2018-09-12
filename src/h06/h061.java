package h06;
//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class h061 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 113;
        b = 4;

        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("plus 25 cent",20,35 );
        g.drawString("jesse €28,25,-",20,55 );
        g.drawString("jan €28,25 ,-",20,75 );
        g.drawString("ali €28,25,-",20,95 );
        g.drawString("jeannette €28,25,-",20,115 );





    }
}