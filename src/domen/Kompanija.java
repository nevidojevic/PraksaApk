/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author janja
 */
public class Kompanija {
    
    private int kompanijaID;
    private String nazivKonpanije;
    private String maticniBrojKompanije;
    private Mesto mesto;

    public Kompanija(int kompanijaID, String nazivKonpanije, String maticniBrojKompanije, Mesto mesto) {
        this.kompanijaID = kompanijaID;
        this.nazivKonpanije = nazivKonpanije;
        this.maticniBrojKompanije = maticniBrojKompanije;
        this.mesto = mesto;
    }
    
    

    public int getKompanijaID() {
        return kompanijaID;
    }

    public void setKompanijaID(int kompanijaID) {
        this.kompanijaID = kompanijaID;
    }

    public String getNazivKonpanije() {
        return nazivKonpanije;
    }

    public void setNazivKonpanije(String nazivKonpanije) {
        this.nazivKonpanije = nazivKonpanije;
    }

    public String getMaticniBrojKompanije() {
        return maticniBrojKompanije;
    }

    public void setMaticniBrojKompanije(String maticniBrojKompanije) {
        this.maticniBrojKompanije = maticniBrojKompanije;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

  
    
       
    
}


