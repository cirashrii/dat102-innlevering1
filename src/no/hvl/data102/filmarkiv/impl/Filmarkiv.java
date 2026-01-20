package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv {

    Film[] filmarkiv;
    int maksantall;
    int antall;

    public Filmarkiv(int maksantall) {
        this.filmarkiv = new Film[maksantall];
        this.maksantall = maksantall;
        this.antall=0;
    }

    public Film[] dobleTabell(Film[] tab) {
        this.maksantall = maksantall*2;
        Film[] nytab = new Film[maksantall];
        int i = 0;
        while (i < maksantall) {
            nytab[i] = tab[i];
            i++;
        }
        return nytab;
        }
    }

    @Override
    public Film finnFilm(int nr) {

        return Film[nr];
    }

    @Override
    public void leggTilFilm(Film nyFilm) {

    }

    @Override
    public boolean slettFilm(int filmnr) {
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        return new Film[0];
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        return new Film[0];
    }

    @Override
    public int antall(Sjanger sjanger) {
        return 0;
    }

    @Override
    public int antall() {
        return 0;
    }

    private Film[] trimTab(Film[] tab, int n) {
// n er antall elementer
        Film[] nytab = new Film[n];
        int i = 0;
        while (i < n) {
            nytab[i] = tab[i];
            i++;
        }
        return nytab;
    }
}
