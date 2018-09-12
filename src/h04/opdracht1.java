package h04;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, -120, 270, 120);
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, 120, 270, -120);
    }
}