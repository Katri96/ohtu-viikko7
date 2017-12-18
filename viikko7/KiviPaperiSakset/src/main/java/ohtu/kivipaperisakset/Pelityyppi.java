/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author mkatri
 */
public final class Pelityyppi {
    private final Map<String, KPS> pelityyppi;
    private IO io;
    
    public Pelityyppi(IO io) {
        pelityyppi = new HashMap<>();
        this.io = io;
        alustaPelityyppi();
    }
    
    public void alustaPelityyppi() {
        pelityyppi.put("a", KPS.pelaajaVsPelaaja(this.io));
        pelityyppi.put("b", KPS.pelaajaVsTekoaly(this.io));
        pelityyppi.put("c", KPS.pelaajaVsParempiTekoaly(this.io));
    }
    
    public KPS hae(String syote){
        return pelityyppi.get(syote);
    }

}
