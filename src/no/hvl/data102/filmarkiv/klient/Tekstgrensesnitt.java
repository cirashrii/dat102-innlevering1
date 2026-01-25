package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

import java.util.Scanner;

public class Tekstgrensesnitt {

    private Scanner scanner = new Scanner(System.in);

    // Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
    public Film lesFilm() {
        System.out.print("Filmnummer: ");
        int filmNr = Integer.parseInt(scanner.nextLine());

        System.out.print("Produsent: ");
        String produsent = scanner.nextLine();

        System.out.print("Tittel: ");
        String tittel = scanner.nextLine();

        System.out.print("År: ");
        int aar = Integer.parseInt(scanner.nextLine());

        System.out.print("Sjanger: ");
        Sjanger[] sjangere = Sjanger.values();

        for (int i = 0; i < sjangere.length; i++){
            System.out.println((i + 1) + ": " + sjangere[i]);
        }

        return new Film(filmNr, produsent, tittel, aar, sjanger);
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
    public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
        Film[] filmer = arkiv.finnFilm();

        if (filmer.length == 0) {
            System.out.println("Fant ingen filmer med " + delstreng + " i tittelen.");
            return;
        }

        System.out.println("Filmer med " + delstreng + " i tittelen.");
        for (int i = 0; i < filmer.length; i++) {
            System.out.println((i + 1) + ": ");
            skrivUtFilm(filmer[i]);
        }
    }

    // Skriver ut alle Filmer av en produsent (produsent er delstreng)
    public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
        Film[] filmer = arkiv.finnFilm();

        if (filmer.length == 0) {
            System.out.println("Fant ingen filmer fra produsent " + delstreng + "." );
            return;
        }
        System.out.println("Filmer fra produsent " + delstreng + ":");
        for (int i = 0; i < filmer.length; i++) {
            System.out.println((i + 1) + ": ");
            skrivUtFilm(filmer[i]);
        }
    }

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

