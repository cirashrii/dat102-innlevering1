package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import no.hvl.data102.filmarkiv.klient.Tekstgrensesnitt;

import no.hvl.data102.filmarkiv.klient.FilmarkivMain;


import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Meny extends Tekstgrensesnitt{
        private Tekstgrensesnitt tekstgr;
        private FilmarkivADT filmarkiv;
        public Meny(FilmarkivADT filmarkiv){
            tekstgr = new Tekstgrensesnitt();
            this.filmarkiv = filmarkiv;



        }
        public void start(FilmarkivADT filmarkiv){
// legg inn en del forhåndsdefinerte filmer for å teste metodene
// ..
// TODO

            Film aaa = new Film(3,"George", "Wars", 1995, Sjanger.ACTION, "Disney");
            filmarkiv.leggTilFilm(aaa);
            filmarkiv.leggTilFilm(new Film(1, "Ashley", "Loaf Cat: Loafening", 2028, Sjanger.DRAMA, "Ashley"));
            filmarkiv.leggTilFilm(new Film(2, "Grethe", "Proj", 2026, Sjanger.SCIFI,"Disn"));
            int alltid = 0;

            // opprettet en ny (new) scanner for tastatur (System.in)
            int antall=3;

            while(alltid==0) {
                int meny = Integer.parseInt(showInputDialog("Hva vil du gjøre? \n1) Legg til film   2) Slett film   3) Se arkiverte filmer "));

                switch (meny) {

                    case 1:
                        antall++;

                        filmarkiv.leggTilFilm(lesFilm(antall));

                        System.out.println();
                        System.out.println("Gratulere du har lagt til en film!");
                        System.out.println();
                        //insert metode fra tekstgrense
                        break;

                    case 2:


                        // Velg en film fra tall 1 til antall
                        // Flytt de andre ned et hakk
                        // Mens jeg gjør det, oppdater hver index til -1 av hva det var (typ. setAntall(getAntall()-1) eller noe sånt)
                        // Profit

                        System.out.println();
                        break;

                    case 3:
                        int tall = Integer.parseInt(showInputDialog("hvilket filmnummer ser du etter?\nDet finnes filmer fra 1 - " + antall));

                        Film temp = filmarkiv.finnFilm(tall);
                        skrivUtFilm(temp);

                        break;

                    default:
                        System.out.println("Bro...");
                        System.out.println();

                        break;
                }
            }
        }
}
