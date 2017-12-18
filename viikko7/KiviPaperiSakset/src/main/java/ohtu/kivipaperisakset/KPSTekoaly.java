package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPS{
    private Tekoaly tekoaly;
    private IO io;

    public KPSTekoaly(IO io) {
        this.tekoaly = new Tekoaly();
        this.io = io;
    }

    public String siirto() {
        String tokaSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokaSiirto);
        return tokaSiirto;
    }
    
    @Override
    protected String ekaSiirto() {
        String ekanSiirto = io.nextLine();
        return ekanSiirto;
    }
}