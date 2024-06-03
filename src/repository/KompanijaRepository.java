/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import domen.Kompanija;
import domen.Modul;
import domen.NivoStudija;
import domen.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nn
 */
public class KompanijaRepository {
    
     Connection konekcija;
    Repository repository;

    public KompanijaRepository() {
        konekcija=repository.returnConnection();
        
    }
    public void saveKompanija(Kompanija kompanija){
        
        
        try{
          
           
           String query = "INSERT INTO kompanija VALUES(?, ?, ?, ?)";
           PreparedStatement ps =konekcija.prepareStatement(query);
           ps.setInt(1, kompanija.getKompanijaID());
           ps.setString(2, kompanija.getNazivKonpanije());
           ps.setString(3, kompanija.getMaticniBrojKompanije());
           
           ps.setInt(4, kompanija.getMesto().getMestoID());
           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
       
     public void deleteKompanija(Kompanija kompanija){
        try{
           
           
           String query = "DELETE FROM kompanija where kompanijaID=" + kompanija.getKompanijaID();
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
     
      public void updateStudent(Kompanija kompanija){
        
        try{
        
          
           
           String query = "UPDATE kompanija SET id = ?, nazivKompanije = ?, maticniBrojKompanije = ?, mestoID = ?  WHERE id =" + kompanija.getKompanijaID();
           java.sql.PreparedStatement ps = konekcija.prepareStatement(query);
           ps.setInt(1, kompanija.getKompanijaID());
           ps.setString(2, kompanija.getNazivKonpanije());
           
           ps.setString(3, kompanija.getMaticniBrojKompanije());
           ps.setInt(4, kompanija.getMesto().getMestoID());
           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
        
    }
    
}
