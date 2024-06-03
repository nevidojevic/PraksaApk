/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author janja
 */
public class Ugovor {
    
    private int ugovorID;
     private Student student;
     private Kompanija kompanija;
     private Date datumOd;
     private Date datumDo;
     private SkolskaGodina skolskaGodina;
     private Mesto mesto;

    public Ugovor(int ugovorID, Student student, Kompanija kompanija, Date datumOd, Date datumDo, SkolskaGodina skolskaGodina, Mesto mesto) {
        this.ugovorID = ugovorID;
        this.student = student;
        this.kompanija = kompanija;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.skolskaGodina = skolskaGodina;
        this.mesto = mesto;
    }

    public int getUgovorID() {
        return ugovorID;
    }

    public void setUgovorID(int ugovorID) {
        this.ugovorID = ugovorID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Kompanija getKompanija() {
        return kompanija;
    }

    public void setKompanija(Kompanija kompanija) {
        this.kompanija = kompanija;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    public SkolskaGodina getSkolskaGodina() {
        return skolskaGodina;
    }

    public void setSkolskaGodina(SkolskaGodina skolskaGodina) {
        this.skolskaGodina = skolskaGodina;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }
    
    
    
}
