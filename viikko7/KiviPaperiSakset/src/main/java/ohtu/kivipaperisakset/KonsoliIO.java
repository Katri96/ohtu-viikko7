/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;
import java.util.Scanner;
/**
 *
 * @author mkatri
 */
public class KonsoliIO implements IO {
    private Scanner lukija;
    
    public KonsoliIO() {
        this.lukija = new Scanner(System.in);
    }

    @Override
    public String nextLine() {
        return lukija.nextLine();
    }
    
    
}
