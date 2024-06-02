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
    
       public void saveStudent(Student student){
        try{
           String url="jdbc:mysql://localhost:3360/PraksaApp";
           Connection konekcija=DriverManager.getConnection(url, "root", "");
           // System.out.println("Uspesno uspostavljanje konekcije");
           
           String query = "INSERT INTO student VALUES(?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement ps =konekcija.prepareStatement(query);
           ps.setInt(1, student.getStudentID());
           ps.setString(2, student.getJmbg());
           ps.setString(3, student.getBrojIndeksa());
           
           ps.setString(4, student.getIme());
           ps.setString(5, student.getPrezime());
           ps.setInt(6, student.getModul().getModulID());
           ps.setInt(7, student.getNivo().getNivoID());
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void deleteStudent(Student student){
        try{
            String url="jdbc:mysql://localhost:3360/PraksaApp";
           Connection konekcija=DriverManager.getConnection(url, "root", "");
           // System.out.println("Uspesno uspostavljanje konekcije");
           
           String query = "DELETE FROM student where brojIndeksa=" + student.getBrojIndeksa();
            System.out.println(query);
            java.sql.Statement statement=konekcija.createStatement();
            int row = statement.executeUpdate(query);
            System.out.println("row: "+row);
            statement.close();
            konekcija.close();
        
        } catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
    }
    
    public void updateStudent(Student student){
        
        try{
        
            String url="jdbc:mysql://localhost:3360/PraksaApp";
           Connection konekcija=DriverManager.getConnection(url, "root", "");
           // System.out.println("Uspesno uspostavljanje konekcije");
           
           String query = "UPDATE student SET jmbg = ?, brojIndeksa = ?, ime = ?, prezime = ?, modul = ?, nivo = ? WHERE studentID =" + student.getStudentID();
           java.sql.PreparedStatement ps = konekcija.prepareStatement(query);
           ps.setString(1, student.getJmbg());
           ps.setString(2, student.getBrojIndeksa());
           
           ps.setString(3, student.getIme());
           ps.setString(4, student.getPrezime());
           ps.setInt(5, student.getModul().getModulID());
           ps.setInt(6, student.getNivo().getNivoID());
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
        
        
        
    }
}


