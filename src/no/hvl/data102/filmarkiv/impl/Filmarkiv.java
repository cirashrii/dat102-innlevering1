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
