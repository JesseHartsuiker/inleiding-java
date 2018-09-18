package h08 ;
//Voorbeeld 8.6

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h081 extends Applet {
    TextField tekstvak;
    Button knop;
    Button reset;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        reset = new Button("reset");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
        add(reset);
        reset.addActionListener( new ResetListener() );
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Jammer, " +
                    "maar nu staat er iets anders");
            repaint();

        }
    }
    class ResetListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }
}