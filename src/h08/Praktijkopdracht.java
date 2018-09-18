package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    Button Minknop;
    Button Plusknop;
    Button Deelknop;
    Button Keerknop;
    TextField tekstvak1;
    TextField tekstvak2;
    double Getal1;
    double Getal2;

    public void init() {
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);


        Minknop = new Button("-");
        Minknop.addActionListener(new MinknopListener());
        Plusknop = new Button ("+");
        Plusknop.addActionListener(new Plusknoplistener());
        Deelknop = new Button ("/");
        Deelknop.addActionListener(new Deelknoplistener());
        Keerknop = new Button("*");
        Keerknop.addActionListener(new Keerknoplistener());
        add(Minknop);
        add(Plusknop);
        add(Deelknop);
        add(Keerknop);
        add(tekstvak1);
        add(tekstvak2);
    }

    class MinknopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Je klikt op de min.");
            String A = tekstvak1.getText();
            Getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            Getal2 = Double.parseDouble(B);
            double uitkomst = Getal1 - Getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    class Plusknoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Je klikt op de plus");
            String C = tekstvak1.getText();
            Getal1 = Double.parseDouble(C);
            String D = tekstvak2.getText();
            Getal2 = Double.parseDouble(D);
            double uitkomst = Getal1 + Getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }

    }

    class Deelknoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Je klikt op  de deel");
            String E = tekstvak1.getText();
            Getal1 = Double.parseDouble(E);
            String F = tekstvak2.getText();
            Getal2 = Double.parseDouble(F);
            double uitkomst = Getal1 / Getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }

    }

    class Keerknoplistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Je klikt op de keer knop");
            String G = tekstvak1.getText();
            Getal1 = Double.parseDouble(G);
            String H = tekstvak2.getText();
            Getal2 = Double.parseDouble(H);
            double uitkomst = Getal1 * Getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }



}