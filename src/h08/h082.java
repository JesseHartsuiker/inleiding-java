package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h082 extends Applet {
    Button mannenKnop;
    Button vrouwenknop;
    Button jongensknop;
    Button meisjesknop;

    int mannenTeller;
    int vrouwenteller;
    int jongensteller;
    int meisjesteller;
    int totaal;


    public void init() {
        setSize(1000, 800);
        KnopListener kl = new KnopListener();

        mannenKnop = new Button("mannenKnop");
        mannenKnop.addActionListener(kl);
        vrouwenknop = new Button("vrouwenknop");
        vrouwenknop.addActionListener(new vrouwen());
        jongensknop = new Button("jongensknop");
        jongensknop.addActionListener(new jongens());
        meisjesknop = new Button("meisjesknop");
        meisjesknop.addActionListener(new meisjes());
        mannenTeller = 0;
        vrouwenteller = 0;
        jongensteller = 0;
        meisjesteller = 0;
        add(mannenKnop);
        add(vrouwenknop);
        add(jongensknop);
        add(meisjesknop);

    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen  " + mannenTeller, 20, 50);
        g.drawString("aantal vrouwen  " + vrouwenteller, 20, 65);
        g.drawString("aantal jongens " + jongensteller, 20, 80);
        g.drawString("aantal meisjes " + meisjesteller, 20, 95);
        g.drawString("Totaal  " + totaal, 20, 110);
        totaal = mannenTeller + vrouwenteller + jongensteller + meisjesteller;

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannenTeller++;
            totaal++;
            repaint();

        }
    }

    class vrouwen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwenteller++;
            totaal++;
            repaint();
        }
    }

    class jongens implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            jongensteller++;
            totaal++;
            repaint();
        }
    }

    class meisjes implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            meisjesteller++;
            totaal++;
            repaint();

        }
    }


}
