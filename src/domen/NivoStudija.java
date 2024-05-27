/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author janja
 */
public class NivoStudija {
    
    public int nivoID;
    public String nazivNivoa;

    public NivoStudija(int nivoID, String nazivNivoa) {
        this.nivoID = nivoID;
        this.nazivNivoa = nazivNivoa;
    }

    public int getNivoID() {
        return nivoID;
    }

    public void setNivoID(int nivoID) {
        this.nivoID = nivoID;
    }

    public String getNazivNivoa() {
        return nazivNivoa;
    }

    public void setNazivNivoa(String nazivNivoa) {
        this.nazivNivoa = nazivNivoa;
    }
    
    
}
