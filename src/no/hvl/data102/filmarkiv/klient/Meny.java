package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class Meny {
        private Tekstgrensesnitt tekstgr;
        private FilmarkivADT filmarkiv;
        public Meny(FilmarkivADT filmarkiv){
            tekstgr = new Tekstgrensesnitt();
            this.filmarkiv = filmarkiv;
        }
        public void start(){
// legg inn en del forhåndsdefinerte filmer for å teste metodene
// ..
// TODO
            Film aaa = new Film(3,"George", "Wars", 1995, Sjanger.ACTION, "Disney");

        }
}
