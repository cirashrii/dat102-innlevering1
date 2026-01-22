package no.hvl.data102.filmarkiv.test;

import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FilmarkivTest {

    @Test
    void dobleTabell() {

    }

    @Test
    void finnFilm() {
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

        Film[] test = new Film[4];
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        assertEquals(2, helloworld.soekProdusent("Grethe"));
    }

    @Test
    void antall() {
    }

    @Test
    void testAntall() {
        Filmarkiv helloworld = new Filmarkiv(4);
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));

        assertEquals(helloworld.antall(),2);
    }
}