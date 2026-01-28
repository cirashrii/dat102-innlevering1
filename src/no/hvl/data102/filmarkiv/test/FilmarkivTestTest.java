package no.hvl.data102.filmarkiv.test;

import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FilmarkivTestTest {

    // Given
    // Setter opp testen
    // Forventning, hva skal testen produsere? Start with why

    // When
    // Kjører testen

    // Then
    // Evaluerer resultatet, sjekker om man får ønsket resultat

    @Test
    void leggTilFilm_skalLeggeTilFilmIArray() {
        // Given
        Film expected = new Film(0, "Ashley", "Loaf Cat: Loafening", 2028, Sjanger.DRAMA, "Ashley");
        Filmarkiv testfilmarkiv = new Filmarkiv(50);

        // When
        testfilmarkiv.leggTilFilm(expected);

        // Then
        Assertions.assertEquals(1,testfilmarkiv.antall(),1);
    }

}
