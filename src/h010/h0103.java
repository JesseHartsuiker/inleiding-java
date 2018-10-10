package h010;




import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h0103 extends Applet {
    TextField tekstvak;
    Label maandlabel;
    String s, tekst;

    int dag;



    public void init(){
        tekstvak = new TextField("", 30);
        maandlabel = new Label("Type het maandnummer");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";

        add(maandlabel);
        add(tekstvak);




    }

    public void paint(Graphics g) {
        g.drawString(tekst,35,130);


    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);


            repaint();

            switch(dag) {
                case 1: tekst = "Januari 31 dagen";
                    break;
                case 2: tekst = "Februari 29 dagen";
                    break;
                case 3: tekst = "Maart 31 dagen";
                    break;
                case 4: tekst = "April 30 dagen";
                    break;
                case 5: tekst = "Mei 31 dagen";
                    break;
                case 6: tekst = "Juni 30 dagen";
                    break;
                case 7: tekst = "Juli 31 dagen";
                    break;
                case 8: tekst = "Augustus 31 dagen";
                    break;
                case 9: tekst = "September 30 dagen";
                    break;
                case 10: tekst = "Oktober 31 dagen";
                    break;
                case 11: tekst = "November 30 dagen";
                    break;
                case 12: tekst = "December 31 dagen";
                    break;
                default: tekst ="Dit is geen maand";
            }
            tekstvak.setText(null);

            repaint();
        }
    }

}