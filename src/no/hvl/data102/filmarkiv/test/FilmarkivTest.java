package no.hvl.data102.filmarkiv.test;

import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FilmarkivTest {

    @Test
    void dobleTabell() {

    }

    @Test
    void finnFilm() {
    }

    @Test
    void leggTilFilm() {
        var Film = new Film();

        Filmarkiv samling = new Filmarkiv(4);
        Film aaa = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        samling.leggTilFilm(new Film(1,"Grethe", "Proj 2 electric boogaloo", 2007, Sjanger.ACTION, "StudioStudios"));

        Assertions.assertEquals(2,samling.antall(),2);


    }

    @Test
    void slettFilm() {
        Filmarkiv samling = new Filmarkiv(2);
        Film aaa = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        Film bbb = new Film(2,"Grethe", "Proj 2 electric boogaloo", 2007, Sjanger.ACTION, "StudioStudios");

        samling.slettFilm(2);
        Assertions.assertEquals(1,samling.antall(),1);
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
        Filmarkiv helloworld = new Filmarkiv(4);
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));

        assertEquals(helloworld.antall(),2);
    }
}