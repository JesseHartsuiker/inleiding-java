package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstvak;
    Label label;
    String s, tekst;
    int uitkomst;

    public void init () {
        tekstvak = new TextField("",20);
        label = new Label ("Voer je cijfer in, en druk op Enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            uitkomst = Integer.parseInt( s);


            if (uitkomst > 0 && uitkomst < 3) {
                tekst = "Slecht";
            }

            else if (uitkomst >= 4 && uitkomst <= 4) {
                tekst = "Onvoldoende";
            }


            else if (uitkomst >=5  && uitkomst <= 5) {
                tekst = "Matig";
            }
            else if (uitkomst >=6  && uitkomst <= 7) {
                tekst = "Voldoende";
            }


            else if (uitkomst == 8 || uitkomst ==9 || uitkomst ==10) {
                tekst = "Goed";
            }

            else if (uitkomst >10 || uitkomst ==0 ) {
                tekst = "Kies een getal van 1 t/m 10";
            }

            else if (uitkomst <1){
                tekst = "Voer een geldig nummer in";
            }


            repaint();
        }

    }
}