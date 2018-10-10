package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class h0105 extends Applet {

    int cijfer;
    TextField tekstvak;
    Label label;
    String tekst;
   



    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("Vul uw cijfer in");



        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if (cijfer > 5.4) {
                tekst = "je hebt een voldoende";
                repaint();
            } else {
                tekst = "je hebt een onvoldoende";
            }
            repaint();

        }
    }
}



