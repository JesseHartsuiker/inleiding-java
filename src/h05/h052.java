package h05;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class h052 extends Applet {
    int valerie;
    int valeriey;




    public void init() {

 valerie = 80;
 valeriey = 60;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(120, -40, 120, 140);
        g.drawLine(120, 140, 280, 140);


        g.drawString("100", 90, 55);
        g.drawString("80", 90, 75);
        g.drawString("60", 90, 92);
        g.drawString("40", 90, 105);
        g.drawString("20", 90, 120);
        g.drawString("0", 90, 140);
        g.drawString("Valerie", 120, 160);
        g.drawString("Hans", 165, 160);
        g.drawString("Jeroen", 200, 160);
        g.setColor(Color.red);
        g.fillRect(120, valeriey, 40, valerie);
        g.drawRect(120, valeriey, 40, valerie);
        g.setColor(Color.blue);
        g.fillRect(160, 65, 40, 75);
        g.drawRect(160, 65, 40, 75);
        g.setColor(Color.yellow);
        g.fillRect(200, 45, 40, 95);
        g.drawRect(200, 45, 40, 95);


    }
}
