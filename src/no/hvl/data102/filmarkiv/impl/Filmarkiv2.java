package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {
    public class LinearNode<T> {
        public T data;
        public LinearNode<T> neste;

        public LinearNode(T data) {
            this.data = data;
            neste = null;
        }
    }

    private int antall;
    private LinearNode<Film> start;

    public Filmarkiv2(){
        start = null;
        antall = 0;
    }

    @Override
    public Film finnFilm(int nr) {
        LinearNode<Film> iterasjon = start;
        while (iterasjon != null) {
            if (iterasjon.data.getFilmnr() == nr) {
                return iterasjon.data;
            }
            iterasjon = iterasjon.neste;
        }
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        LinearNode<Film> ny = new LinearNode<>(nyFilm);
        ny.neste = start;
        start = ny;
        antall++;

    }

    @Override
    public boolean slettFilm(int filmnr) {
        Film filmen = finnFilm(filmnr);
        LinearNode<Film> slett = start;
        LinearNode<Film> forrige = null;
        if (antall > 0) {
            while (slett != null) {
                if (slett.data == filmen) {
                    if (forrige == null) {
                        start = slett.neste;
                    } else {
                        forrige.neste = slett.neste;
                    }
                    antall--;
                    return true;
                }
                forrige = slett;
                slett = slett.neste;
            }
        }
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        Film[] tittel = new Film[antall];
        int count = 0;
        LinearNode<Film> iterasjon = start;
        while (iterasjon != null) {
            if (iterasjon.data.getTittel().contains(delstreng)) {
                count++;
                tittel[count - 1] = iterasjon.data;
            }
            iterasjon = iterasjon.neste;
        }
        return tittel;
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        Film[] produsent = new Film[antall];
        int count = 0;
        LinearNode<Film> iterasjon = start;
        while (iterasjon != null) {
            if (iterasjon.data.getProdusent().contains(delstreng)) {
                count++;;
                produsent[count - 1] = iterasjon.data;
            }
            iterasjon = iterasjon.neste;
        }
        return produsent;
    }

    @Override
    public int antall(Sjanger sjanger) {
        int count = 0;;
        LinearNode<Film> iterasjon = start;
        while (iterasjon != null) {
            if (iterasjon.data.getSjanger().equals(sjanger)) {
                count++;
            }
            iterasjon = iterasjon.neste;
        }
        return count;
    }

    @Override
    public int antall() {
        return antall;
    }

    private Film[] trimTab(Film[] tab, int n) {
        Film[] nytab = new Film[n];
        int count = 0;
        LinearNode<Film> iterasjon = start;
        while (iterasjon != null && count < n) {
            nytab[count] = iterasjon.data;
            iterasjon = iterasjon.neste;
            count++;
        }
        return nytab;
    }
}
