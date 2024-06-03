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
import domen.Mesto;

import java.sql.Connection;

/**
 *
 * @author nn
 */
public class MestoRepository {
    
       Connection konekcija;
    Repository repository;

    public MestoRepository() {
        konekcija=repository.returnConnection();
        
    }
    
     public void saveMesto(Mesto mesto){
        
        
        try{
          
           
           String query = "INSERT INTO mesto VALUES(?, ?, ?)";
           PreparedStatement ps =konekcija.prepareStatement(query);
           ps.setInt(1, mesto.getMestoID());
           ps.setString(2, mesto.getNazivMesta());
           ps.setLong(3, mesto.getPtt());
           
          
           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
       
     public void deleteMesto(Mesto mesto){
        try{
           
           
           String query = "DELETE FROM mesto where id=" + mesto.getMestoID();
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
     
      public void updateMesto(Mesto mesto){
        
        try{
        
          
           
           String query = "UPDATE mesto SET id = ?, nazivMesta = ?, ptt = ? WHERE id =" + mesto.getMestoID();
           java.sql.PreparedStatement ps = konekcija.prepareStatement(query);
           ps.setInt(1, mesto.getMestoID());
           ps.setString(2, mesto.getNazivMesta());
           
           ps.setLong(3, mesto.getPtt());
          
           
           ps.executeUpdate();
           ps.close();
           konekcija.close();
        } catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
        
    }
    
}
