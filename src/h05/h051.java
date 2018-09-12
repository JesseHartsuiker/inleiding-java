package h05;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class h051 extends Applet {
    int uitlijning;
     int    hoogte;
     Color kleurtje;



    public void init() {
        setSize(2024,1068);
        uitlijning =  800;
        kleurtje = Color.magenta;
        hoogte = 150;


    }

    public void paint(Graphics g) {


        g.setColor(kleurtje);
        g.fillArc(uitlijning,600,300,hoogte,0,360);
        g.drawRect(uitlijning, 200, 300, hoogte);
        g.fillRect(uitlijning, 200, 300, hoogte);
        g.fillArc(1300,200,300,hoogte,0,45);

        g.setColor(Color.black);
        g.drawOval(uitlijning, 200, 300, hoogte);
        g.drawOval(uitlijning, 600, 300, hoogte);
        g.drawOval(1300, 200, 300, hoogte);
        g.drawOval(1400, 600, 150, hoogte);
        g.drawRoundRect(200, 600, 300, hoogte, 10, 10);
        g.drawRect(200, 200, 300, hoogte);
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