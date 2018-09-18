package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h083 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    double bedrag;
    double btw;


    public void init() {
        label = new Label("vul hier uw bedrag in zonder btw");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TeksvakListener());
        add(tekstvak);
        add(label);
        btw = 1.21;

    }


    public void paint(Graphics g) {
        g.drawString("€ " + bedrag * btw, 50, 80);


    }

    class TeksvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            bedrag = Double.parseDouble(s);
            repaint();

        }
    }
}




