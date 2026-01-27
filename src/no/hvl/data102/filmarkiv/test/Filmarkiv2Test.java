package no.hvl.data102.filmarkiv.test;

import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv2;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Filmarkiv2Test {


    @Test
    void finnFilm() {
        Filmarkiv2 samling = new Filmarkiv2();
        Film film1 = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        Film film2 = new Film(2,"Grethe", "Proj 2 electric boogaloo", 2007, Sjanger.DRAMA, "StudioStudios");
        samling.leggTilFilm(film1);
        samling.leggTilFilm(film2);
        assertEquals(film1,samling.finnFilm(1));
        assertEquals(film2,samling.finnFilm(2));
    }

    @Test
    void leggTilFilm() {
        var Film = new Film();

        Filmarkiv2 samling = new Filmarkiv2();
        Film aaa = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        samling.leggTilFilm(new Film(1,"Grethe", "Proj 2 electric boogaloo", 2007, Sjanger.ACTION, "StudioStudios"));

        Assertions.assertEquals(2,samling.antall(),2);


    }

    @Test
    void slettFilm() {
        Filmarkiv2 samling = new Filmarkiv2();
        Film aaa = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        Film bbb = new Film(2,"Grethe", "Proj 2 electric boogaloo", 2007, Sjanger.ACTION, "StudioStudios");

        samling.slettFilm(2);
        Assertions.assertEquals(1,samling.antall(),1);
    }

    @Test
    void soekTittel() {
        Filmarkiv2 Tittel = new Filmarkiv2();
        Tittel.leggTilFilm(new Film(1, "Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        Tittel.leggTilFilm(new Film(1, "Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        Tittel.leggTilFilm(new Film(1, "Grethe", "Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        Tittel.leggTilFilm(new Film(1, "Grethe", "Filmen", 2005, Sjanger.ACTION, "StudioStudios"));

        Film[] test = new Film[4];
        test[0] = new Film(1, "Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        test[1] = new Film(1, "Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        assertArrayEquals(test, Tittel.soekTittel("Proj"));
    }

    @Test
    void soekProdusent() {
        Filmarkiv2 helloworld = new Filmarkiv2();
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        helloworld.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        helloworld.leggTilFilm(new Film(1,"Andrea", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        helloworld.leggTilFilm(new Film(1,"Andrea", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));

        Film[] test = new Film[4];
        test[0] = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        test[1] = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        assertArrayEquals(test, helloworld.soekProdusent("Grethe"));

    }

    @Test
    void antall() {
        Filmarkiv2 samling = new Filmarkiv2();
        Film aaa = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        Film bbb = new Film(2,"Grethe", "Proj 2 electric boogaloo", 2007, Sjanger.ACTION, "StudioStudios");

        samling.antall(Sjanger.ACTION);
        Assertions.assertEquals(1,samling.antall(),1);
    }

    @Test
    void testAntall() {
        Filmarkiv2 samling = new Filmarkiv2();
        samling.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios"));
        samling.leggTilFilm(new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.DRAMA, "StudioStudios"));

        assertEquals(samling.antall(),2);
    }
}

