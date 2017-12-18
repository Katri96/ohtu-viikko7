package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {
    private IO io;
    
    public KPSPelaajaVsPelaaja(IO io) {
        this.io = io;
    }
    
    @Override
    protected String siirto() {
        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = io.nextLine();
        System.out.println(tokanSiirto);
        return tokanSiirto;
    }

    @Override
    protected String ekaSiirto() {
        String ekanSiirto = io.nextLine();
        return ekanSiirto;
    }
    
}