/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author janja
 */
public class Modul {
    private int modulID;
    private String nazivModula;
    private StudijskiProgram studijskiProgram;

    public Modul(int modulID, String nazivModula, StudijskiProgram studijskiProgram) {
        this.modulID = modulID;
        this.nazivModula = nazivModula;
        this.studijskiProgram = studijskiProgram;
    }

    
    
    public int getModulID() {
        return modulID;
    }

    public void setModulID(int modulID) {
        this.modulID = modulID;
    }

    public String getNazivModula() {
        return nazivModula;
    }

    public void setNazivModula(String nazivModula) {
        this.nazivModula = nazivModula;
    }

    public StudijskiProgram getStudijskiProgram() {
        return studijskiProgram;
    }

    public void setStudijskiProgram(StudijskiProgram studijskiProgram) {
        this.studijskiProgram = studijskiProgram;
    }
    
    
    
}
