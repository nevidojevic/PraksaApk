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
import domen.StudijskiProgram;

/**
 *
 * @author nn
 */
public class StudijskiProgramRepository {
    
       Connection konekcija;
    Repository repository;

    public StudijskiProgramRepository() {
        konekcija=repository.returnConnection();
        
    }
    public void saveStudijskiProgram(StudijskiProgram sp){
        
        
        try{
          
           
           String query = "INSERT INTO studijskiProgram VALUES(?, ?)";
           PreparedStatement ps =konekcija.prepareStatement(query);
           ps.setInt(1, sp.getProgramID());
           ps.setString(2, sp.getNazivPrograma());
           
           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
       
     public void deleteStudijskiProgram(StudijskiProgram sp){
        try{
           
           
           String query = "DELETE FROM studijskiProgrm where id=" + sp.getProgramID();
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
     
      public void updateStudjskiProgram(StudijskiProgram sp){
        
        try{
        
          
           
           String query = "UPDATE studijskiProgram SET id = ?, nazivPrograma = ? WHERE id =" + sp.getProgramID();
           java.sql.PreparedStatement ps = konekcija.prepareStatement(query);
           ps.setInt(1, sp.getProgramID());
           ps.setString(2, sp.getNazivPrograma());

           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
        
    }
    
}
