package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS{
    private TekoalyParannettu tekoaly;
    private IO io;

    
    public KPSParempiTekoaly(IO io) {
        this.tekoaly = new TekoalyParannettu(20);
        this.io = io;
    }

    @Override
    public String siirto() {
        String tokaSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokaSiirto);
        tekoaly.asetaSiirto(tokaSiirto);
        return tokaSiirto;
    }
    
    @Override
    protected String ekaSiirto() {
        String ekanSiirto = io.nextLine();
        return ekanSiirto;
    }
}