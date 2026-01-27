package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;


import java.util.Scanner;

import static java.lang.System.in;

public class Tekstgrensesnitt {


    // Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
    public Film lesFilm(int a) {
        Scanner tekst = new Scanner(System.in);
        System.out.println("Hvem er produsenten?\n Svar: ");
        String produsent = tekst.next();

        System.out.println("Hva er tittelen?\nSvar: ");
        String tittel = tekst.next();

        System.out.println("Hva er lanseringsår?\nSvar: ");
        int aar = tekst.nextInt();

        int nytt = 0;
        Sjanger sjanger = Sjanger.HISTORY;

        while (nytt == 0) {
            System.out.println("Hvilken sjanger er filmen?\n1)Action\n2)Drama\n3)Historie\n4)Sci-Fi\nSvar: ");
            int sjangerTall = tekst.nextInt();
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
        String filmselskap = tekst.next();
        tekst.close();


        return new Film(a, produsent, tittel, aar, sjanger, filmselskap);



    }

    // Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void skrivUtFilm(Film film) {
        if (film == null) {
            System.out.println("Ingen film å vise");
            return;
        }

        System.out.println("Filmnummer: " + film.getFilmnr());
        System.out.println("Produsent: " + film.getProdusent());
        System.out.println("Tittel: " + film.getTittel());
        System.out.println("År: " + film.getAar());
        System.out.println("Sjanger: " + film.getSjanger());
    }

    // Skriver ut alle filmer med en spesiell delstreng i tittelen
//    public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
//        Film[] filmer = arkiv.finnFilm();
//
//        if (filmer.length == 0) {
//            System.out.println("Fant ingen filmer med " + delstreng + " i tittelen.");
//            return;
//        }
//
//        System.out.println("Filmer med " + delstreng + " i tittelen.");
//        for (int i = 0; i < filmer.length; i++) {
//            System.out.println((i + 1) + ": ");
//            skrivUtFilm(filmer[i]);
//        }
//    }

    // Skriver ut alle Filmer av en produsent (produsent er delstreng)
//    public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
//        Film[] filmer = arkiv.finnFilm();
//
//        if (filmer.length == 0) {
//            System.out.println("Fant ingen filmer fra produsent " + delstreng + "." );
//            return;
//        }
//        System.out.println("Filmer fra produsent " + delstreng + ":");
//        for (int i = 0; i < filmer.length; i++) {
//            System.out.println((i + 1) + ": ");
//            skrivUtFilm(filmer[i]);
//        }
//    }

    // Skriver ut en enkel statistikk som inneholder antall filmer totalt
// og hvor mange det er i hver sjanger.
    public void skrivUtStatistikk(FilmarkivADT arkiv) {
        System.out.println("Statistikk for filmarkivet");
        System.out.println("Antall filmer totalt: " + arkiv.antall());

        System.out.println("Antall filmer i hver sjanger: ");
        for (Sjanger sjanger : Sjanger.values()) {
            System.out.println("Antall " + sjanger + ": " + arkiv.antall(sjanger));
        }
    }
// osv ... andre metoder
}

