package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

import no.hvl.data102.filmarkiv.klient.FilmarkivMain;


import java.util.Scanner;

public class Meny {
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

            int antall=0;


            int alltid = 0;

            // opprettet en ny (new) scanner for tastatur (System.in)

            Scanner in = new Scanner(System.in);
            while(alltid==0) {
                System.out.print("Hva vil du gjøre?\n1) legg til film\n2) Slett film\n3) Se arkiverte filmer\nSvar her: ");

                // les inn
                int tall = in.nextInt();

                switch (tall) {

                    case 1:
                        antall++;

                        System.out.println("Hvem er produsenten?\n Svar: ");
                        String produsent = in.next();

                        System.out.println("Hva er tittelen?\nSvar: ");
                        String tittel = in.next();

                        System.out.println("Hva er lanseringsår?\nSvar: ");
                        int aar = in.nextInt();

                        int nytt = 0;
                        Sjanger sjanger = Sjanger.HISTORY;

                        while (nytt == 0) {
                            System.out.println("Hvilken sjanger er filmen?\n1)Action\n2)Drama\n3)Historie\n4)Sci-Fi\nSvar: ");
                            int sjangerTall = in.nextInt();
                            switch (sjangerTall) {

                                case 1:
                                    sjanger = Sjanger.ACTION;
                                    nytt++;
                                    break;

                                case 2:
                                    sjanger = Sjanger.DRAMA;
                                    nytt++;
                                    break;

                                case 3:
                                    sjanger = Sjanger.HISTORY;
                                    nytt++;
                                    break;

                                case 4:
                                    sjanger = Sjanger.SCIFI;
                                    nytt++;
                                    break;

                                default:

                                    break;
                            }
                        }

                        System.out.println("Hvilket filmselskap er det?\nSvar: ");
                        String filmselskap = in.next();


                        filmarkiv.leggTilFilm(new Film(antall, produsent, tittel, aar, sjanger, filmselskap));
                        System.out.println();
                        System.out.println("Gratulere du har lagt til en film!");
                        System.out.println();


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


            Film aaa = new Film(3,"George", "Wars", 1995, Sjanger.ACTION, "Disney");

        }
}
