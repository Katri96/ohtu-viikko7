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
public class UusiPeli {
       
    public void aloita() {
        IO io = new KonsoliIO();
        Pelityyppi pelityyppi = new Pelityyppi(io);

        while (true) {
            ohjeet();
            String syote = io.nextLine();
            KPS kps = pelityyppi.hae(syote);
            if (kps != null) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                kps.pelaa();
            } else {
                break;
            }
        }
    }
    
    public static void ohjeet() {
        System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
    }
}
