/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;
   import domen.Modul;
import domen.NivoStudija;
import domen.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import domen.SkolskaGodina;
import domen.StudijskiProgram;
/**
 *
 * @author nn
 */
public class SkolskaGodinaRepository {
    
       Connection konekcija;
    Repository repository;

    public SkolskaGodinaRepository() {
        konekcija=repository.returnConnection();
        
    }
    public void saveSkolskaGodina(SkolskaGodina sg){
        
        
        try{
          
           
           String query = "INSERT INTO skolskaGodina VALUES(?, ?)";
           PreparedStatement ps =konekcija.prepareStatement(query);
           ps.setInt(1, sg.getSkolskaGodinaID());
           ps.setString(2, sg.getGodinaStudija());
           
           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
       
     public void deleteSkolskaGodina(SkolskaGodina sg){
        try{
           
           
           String query = "DELETE FROM skolskaGodina where id=" + sg.getSkolskaGodinaID();
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
     
      public void updateStudjskiProgram(SkolskaGodina sg){
        
        try{
        
          
           
           String query = "UPDATE skolskaGodina SET id = ?, godinaStudija = ? WHERE id =" + sg.getSkolskaGodinaID();
           java.sql.PreparedStatement ps = konekcija.prepareStatement(query);
           ps.setInt(1, sg.getSkolskaGodinaID());
           ps.setString(2, sg.getGodinaStudija());

           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
        
    }
 
}
