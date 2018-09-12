package h04;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        setBackground(Color.white);

        // Overschakelen op een Graphics2D object
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(3));

        // Tekenen
        g2.setColor(Color.black);
        g2.drawRoundRect(150, 50, 125, 120, 10, 10);
        g2.drawOval(170, 70, 30, 30);
        g2.drawOval(230, 70, 30, 30);
        g2.drawOval(170, 125, 30, 30);
        g2.drawOval(230, 125, 30, 30);

        g2.fillOval(170, 70, 30, 30);
        g2.fillOval(230, 70, 30, 30);
        g2.fillOval(170, 125, 30, 30);
        g2.fillOval(230, 125, 30, 30);





    }
}