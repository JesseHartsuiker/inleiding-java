package h06;
//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class h062 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a =60 ;
        b =60 ;
        c = 3600 ;
        d = 24  ;
        e= 86400  ;
        f= 365 ;

        uitkomst = (a * b);
        uitkomst2 = (c * d);
        uitkomst3 = (e * f);

    }

    public void paint(Graphics g) {
        g.drawString("De seconden in een uur = " + uitkomst, 20, 20);
        g.drawString("De seconden in een dag = " + uitkomst2, 20, 40);
        g.drawString("De seconden in een jaar = " + uitkomst3, 20, 60);


    }
}