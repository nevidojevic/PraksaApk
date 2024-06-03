/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;


import domen.Ugovor;
import domen.NivoStudija;
import domen.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author nn
 */
public class UgovorRepository {
    
    
      Connection konekcija;
    Repository repository;

    public UgovorRepository() {
        konekcija=repository.returnConnection();
        
    }
    
    
    
    
//    public List<Student> getAll(){ //pristupi bazi i uzmi i vrati sve studente
//        List<Student> list=new ArrayList<>();
//        try{
//        
//           String query = "SELECT * FROM student ORDER BY prezime";
//            java.sql.Statement statement =konekcija.createStatement();
//            java.sql.ResultSet rs= statement.executeQuery(query);
//            
//            while(rs.next()){
//                int id=rs.getInt("studentID");
//                String jmbg = rs.getString("jmbg");
//                String brojIndeksa = rs.getString("brojIndeksa");
//                String ime = rs.getString("ime");
//                String prezime = rs.getString("prezime");
//                
//                Modul modul = (Modul)rs.getObject("modul");
//                NivoStudija nivo=(NivoStudija)rs.getObject("nivoStudija");
//                Student s=new Student(id, jmbg, brojIndeksa, ime, prezime, modul, nivo);
//                
//                list.add(s);
//            }
//            
//        } catch(SQLException ex){
//            System.out.println("Greska pri konekciji");
//        }
//     
//        
//        
//        return list;
//    }
    
     public void saveUgovor(Ugovor ugovor){
        try{
          
           
           String query = "INSERT INTO student VALUES(?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement ps =konekcija.prepareStatement(query);
           ps.setInt(1, ugovor.getUgovorID());
           ps.setInt(2, ugovor.getStudent().getStudentID());
           ps.setInt(3, ugovor.getKompanija().getKompanijaID());
           
           ps.setDate(4, (java.sql.Date) ugovor.getDatumOd());
           ps.setDate(5, (java.sql.Date) ugovor.getDatumDo());
           ps.setInt(6, ugovor.getSkolskaGodina().getSkolskaGodinaID());
           ps.setInt(7, ugovor.getMesto().getMestoID());
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
     public void deleteUgovor(Ugovor ugovor){
        try{
           
           
           String query = "DELETE FROM ugovor where id=" + ugovor.getUgovorID();
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
    
    public void updateUgovor(Ugovor ugovor){
        
        try{
        
          
           
           String query = "UPDATE student SET id = ?, studentID = ?, kompanijaID = ?, datumOd = ?, datumDo = ?, skolskaGodinaID = ?, mestoID=?  WHERE id =" + ugovor.getUgovorID();
           java.sql.PreparedStatement ps = konekcija.prepareStatement(query);
          ps.setInt(1, ugovor.getUgovorID());
           ps.setInt(2, ugovor.getStudent().getStudentID());
           ps.setInt(3, ugovor.getKompanija().getKompanijaID());
           
           ps.setDate(4, (java.sql.Date) ugovor.getDatumOd());
           ps.setDate(5, (java.sql.Date) ugovor.getDatumDo());
           ps.setInt(6, ugovor.getSkolskaGodina().getSkolskaGodinaID());
           ps.setInt(7, ugovor.getMesto().getMestoID());
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
        
    }
    
    
}
