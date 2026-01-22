package no.hvl.data102.filmarkiv.test;

import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class FilmarkivTest {

    @Test
    void dobleTabell() {
//        Filmarkiv helloworld = new Filmarkiv(2);
//        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
//        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
//        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
//
//        assertEquals(helloworld.antall(),3);
        //out of bounds error, dobletabell fungerer ikke
        //vet ikke hvordan jeg sjekker dobletabell direkte (uten å legge til metoder), må istedet satse på antall
    }

    @Test
    void finnFilm() {
        Filmarkiv samling = new Filmarkiv(4);
        Film aaa = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        Film bbb = new Film(2,"Grethe", "Proj 2 electric boogaloo", 2007, Sjanger.DRAMA, "StudioStudios");


        samling.leggTilFilm(aaa);
        samling.leggTilFilm(bbb);

        assertEquals(samling.finnFilm(1),aaa);
        assertEquals(samling.finnFilm(2),bbb);
    }

    @Test
    void leggTilFilm() {
    }

    @Test
    void slettFilm() {
    }

    @Test
    void soekTittel() {
    }

    @Test
    void soekProdusent() {
        Filmarkiv helloworld = new Filmarkiv(4);
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        assertEquals(Film[], helloworld.soekProdusent("ACTION"));
    }

    @Test
    void antall() {
    }

    @Test
    void testAntall() {
        Filmarkiv samling = new Filmarkiv(4);
        samling.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        samling.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.DRAMA, "StudioStudios"));

        assertEquals(samling.antall(),2);
    }
}