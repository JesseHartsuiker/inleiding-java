package h04;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawLine(50, 350, 50, 50);
        g.setColor(Color.red);
        g.fillRect(52, 50, 200, 50);
        g.drawRect(52, 50, 200, 50);
        g.setColor(Color.white);
        g.fillRect(52, 100, 200, 50);
        g.drawRect(52, 100, 200, 50);
        g.setColor(Color.blue);
        g.fillRect(52, 150, 200, 50);
        g.drawRect(52, 150, 200, 50);





    }
}