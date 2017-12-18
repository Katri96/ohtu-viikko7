/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author mkatri
 */

public abstract class KPS implements Komento {
    private final Tuomari tuomari;
    private String siirto;
    
    
    public KPS() {
        this.tuomari = new Tuomari();
    }

    @Override
    public void pelaa() {
        
        while(true) {
            String ekanSiirto = ekaSiirto();
            
            if (!onkoOkSiirto(ekanSiirto)) {
                break;
            }
            System.out.print("Ensimmäisen pelaajan siirto: ");
            System.out.print(ekanSiirto + " ");
            String tokanSiirto = siirto();
            if (!onkoOkSiirto(tokanSiirto)) {
                break;
            }
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
        }
        
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);   
    }
    
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    public static KPS pelaajaVsPelaaja(IO io) {
        return new KPSPelaajaVsPelaaja(io);
    }
    
    public static KPS pelaajaVsTekoaly(IO io) {
        return new KPSTekoaly(io);
    }
    
    public static KPS pelaajaVsParempiTekoaly(IO io) {
        return new KPSParempiTekoaly(io);
    }
    
    protected abstract String siirto();
    protected abstract String ekaSiirto();
    
}
