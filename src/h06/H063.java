package h06;

//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class H063 extends Applet {
    int x;

    public void init() {
        x = Integer.MAX_VALUE;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + (x + 10), 20, 20);
    }
}