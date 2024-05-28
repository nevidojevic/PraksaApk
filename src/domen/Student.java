
package domen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author janja
 */
public class Student {
    private int studentID;
    private String jmbg;
    private String brojIndeksa;
    private String ime;
    private String prezime;
    private Modul modul;
    private NivoStudija nivo;

    public Student(int studentID, String jmbg, String brojIndeksa, String ime, String prezime, Modul modul, NivoStudija nivo) {
        this.studentID = studentID;
        this.jmbg = jmbg;
        this.brojIndeksa = brojIndeksa;
        this.ime = ime;
        this.prezime = prezime;
        this.modul = modul;
        this.nivo = nivo;
    }
    
    

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
    }

    public NivoStudija getNivo() {
        return nivo;
    }

    public void setNivo(NivoStudija nivo) {
        this.nivo = nivo;
    }
    
    
    
   
    
    
    
   
}
