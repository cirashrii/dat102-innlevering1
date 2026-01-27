package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import no.hvl.data102.filmarkiv.klient.Tekstgrensesnitt;

import no.hvl.data102.filmarkiv.klient.FilmarkivMain;


import java.util.Scanner;

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
            Scanner in = new Scanner(System.in);
            while(alltid==0) {
                System.out.print("Hva vil du gjøre?\n1) legg til film\n2) Slett film\n3) Se arkiverte filmer\nSvar her: ");

                // les inn
                int tall = in.nextInt();

                switch (tall) {

                    case 1:
                        antall++;

                        filmarkiv.leggTilFilm(lesFilm(antall));

                        System.out.println();
                        System.out.println("Gratulere du har lagt til en film!");
                        System.out.println();
                        //insert metode fra tekstgrense
                        break;

                    case 2:
                        System.out.println();
                        break;

                    case 3:
                        System.out.println(filmarkiv.finnFilm(1));
                        System.out.println();

                        break;

                    default:
                        System.out.println("Bro...");
                        System.out.println();

                        break;
                }
            }

            // lukk scanneren igjen
            in.close();
        }

}
