/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author janja
 */
public class Kompanija {
    
    private int kompanijaID;
    private String nazivKonpanije;
    private String maticniBrojKompanije;
    private Mesto mesto;

    public Kompanija(int kompanijaID, String nazivKonpanije) {
        this.kompanijaID = kompanijaID;
        this.nazivKonpanije = nazivKonpanije;
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
    
    
    
}
