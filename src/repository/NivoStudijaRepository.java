/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import domen.Kompanija;
import domen.NivoStudija;
import domen.Modul;
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
public class NivoStudijaRepository {
    
    
       Connection konekcija;
    Repository repository;

    public NivoStudijaRepository() {
        konekcija=repository.returnConnection();
        
    }
    public void saveNivoStudija(NivoStudija ns){
        
        
        try{
          
           
           String query = "INSERT INTO nivoStudija VALUES(?, ?)";
           PreparedStatement ps =konekcija.prepareStatement(query);
           ps.setInt(1, ns.getNivoID());
           ps.setString(2, ns.getNazivNivoa());
          
           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
       
     public void deleteNivoStudija(NivoStudija ns){
        try{
           
           
           String query = "DELETE FROM nivoStudija where id=" + ns.getNivoID();
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
     
      public void updateStudent(NivoStudija ns){
        
        try{
        
          
           
           String query = "UPDATE nivoStudija SET id = ?, nazivMesta = ? WHERE id =" + ns.getNivoID();
           java.sql.PreparedStatement ps = konekcija.prepareStatement(query);
           ps.setInt(1, ns.getNivoID());
           ps.setString(2, ns.getNazivNivoa());
       
           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
        
    }
    
}
