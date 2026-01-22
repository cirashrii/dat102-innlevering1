package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

    Film[] filmarkiv;
    int maksantall;
    int antall;

    public Filmarkiv(int maksantall) {
        this.filmarkiv = new Film[maksantall];
        this.maksantall = maksantall;
        this.antall=0;
    }

    //test
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


    @Override
    public Film finnFilm(int nr) {
        for (int i = 0; i < antall; i++) {
            if (filmarkiv[i].getFilmnr() == nr) {
                return filmarkiv[i];
            }
        }
        return null;
    }


    @Override
    public void leggTilFilm(Film nyFilm) {
        if (antall == maksantall) {
            filmarkiv = dobleTabell(filmarkiv);
        }
        filmarkiv[antall] = nyFilm;
        antall++;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        for (int i = 0; i < antall; i++) {
            if (filmarkiv[i].getFilmnr() == filmnr) {
                filmarkiv[i] = filmarkiv[antall];
                filmarkiv[antall] = null;
                antall--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        Film[] tittel = new Film[antall];
        int count = 0;
        for(int i=0; i<antall; i++){
            if (filmarkiv[i].getTittel().contains(delstreng)){
                count++;
                tittel[count - 1] = filmarkiv[i];
            }

        }
        return tittel;
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        int count = 0;
        Film[] filmProdusent = new Film[antall];

        for (int i = 0; i < antall; i++) {
            if (filmarkiv[i].getProdusent().contains(delstreng)) {
                count++;
                filmProdusent[count-1] = filmarkiv[i];
            }
        }
        return filmProdusent;
    }

    @Override
    public int antall(Sjanger sjanger) {
        int x = 0;
        for (int i = 0; i < antall; i++) {
            if (filmarkiv[i].getSjanger() == sjanger) {
                x++;
            }
        }
        return x;
    }

    @Override
    public int antall() {
        return antall;
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