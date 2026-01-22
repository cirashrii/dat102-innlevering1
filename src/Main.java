import no.hvl.data102.filmarkiv.impl.*;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Film aaa = new Film(1,"Grethe", "Proj Filmen", 2005, Sjanger.ACTION, "StudioStudios");
        Film bbb = new Film(1,"Grethe", "Proj 2 electric boogaloo", 2007, Sjanger.ACTION, "StudioStudios");


        Film[] filmarkiv = new Film[2];
        filmarkiv[0] = aaa;
        filmarkiv[1] = bbb;

        for(Film f:filmarkiv){
            System.out.println(f);
        }


        // Hvis samme nummer skrives ut, fix override 1.1


    }

}