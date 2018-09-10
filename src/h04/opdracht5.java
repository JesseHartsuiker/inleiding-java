//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

import static java.awt.Color.yellow;

public class opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(100,20,150,250,0,360);

        g.setColor(Color.BLACK);
        g.drawOval(100, 20, 150, 250);


    }
}