/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author janja
 */
public class Mesto {
    
    private int mestoID;
    private String nazivMesta;
    private long ptt;

    public Mesto(int mestoID, String nazivMesta, long ptt) {
        this.mestoID = mestoID;
        this.nazivMesta = nazivMesta;
        this.ptt = ptt;
    }

    public int getMestoID() {
        return mestoID;
    }

    public void setMestoID(int mestoID) {
        this.mestoID = mestoID;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    public long getPtt() {
        return ptt;
    }

    public void setPtt(long ptt) {
        this.ptt = ptt;
    }
    
    
    
}
