/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author janja
 */
public class SkolskaGodina {
    
    private int skolskaGodinaID;
    public String godinaStudija;

    public SkolskaGodina(int skolskaGodinaID, String godinaStudija) {
        this.skolskaGodinaID = skolskaGodinaID;
        this.godinaStudija = godinaStudija;
    }

    
    
    public int getSkolskaGodinaID() {
        return skolskaGodinaID;
    }

    public void setSkolskaGodinaID(int skolskaGodinaID) {
        this.skolskaGodinaID = skolskaGodinaID;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    
    
}
