package h06;
//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class Praktijkopdracht extends Applet {

    double uitkomst;
    double a;
    double b;
    double c;
     double d;
    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;

        uitkomst = (a + b + c ) / d ;

        uitkomst = uitkomst * 10;
        int  uitkomstint = (int) uitkomst;
        uitkomst = (double) uitkomstint;
        uitkomst = uitkomst / 10; 

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }


}