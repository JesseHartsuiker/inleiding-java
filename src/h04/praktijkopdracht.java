package h04;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {

    public void init() {
        setSize(2024,1068);
    }

    public void paint(Graphics g) {


        g.setColor(Color.magenta);
        g.fillArc(800,600,300,150,0,360);
        g.drawRect(800, 200, 300, 150);
        g.fillRect(800, 200, 300, 150);
        g.fillArc(1300,200,300,150,0,45);

        g.setColor(Color.black);
        g.drawOval(800, 200, 300, 150);
        g.drawOval(800, 600, 300, 150);
        g.drawOval(1300, 200, 300, 150);
        g.drawOval(1400, 600, 150, 150);
        g.drawRoundRect(200, 600, 300, 150, 10, 10);
        g.drawRect(200, 200, 300, 150);
        g.drawLine(50, 120, 600, 120);

        g.drawString("lijn",300,150 );
        g.drawString("rechthoek",300,400 );
        g.drawString("afgeronde rechthoek",280,800 );
        g.drawString("gevulde rechthoek met ovaal",850,400 );
        g.drawString("gevulde ovaal",900,800);
        g.drawString("taartpunt met ovaal eromheen",1350,400 );
        g.drawString("cirkel",1450,800 );







    }
}