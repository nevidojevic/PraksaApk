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

/**
 *
 * @author nn
 */
public class StudentRepository {
    Connection konekcija;
    Repository repository;

    public StudentRepository() {
        konekcija=repository.returnConnection();
        
    }
    
    
    
    
    public List<Student> getAll(){ //pristupi bazi i uzmi i vrati sve studente
        List<Student> list=new ArrayList<>();
        try{
        
           String query = "SELECT * FROM student ORDER BY prezime";
            java.sql.Statement statement =konekcija.createStatement();
            java.sql.ResultSet rs= statement.executeQuery(query);
            
            while(rs.next()){
                int id=rs.getInt("studentID");
                String jmbg = rs.getString("jmbg");
                String brojIndeksa = rs.getString("brojIndeksa");
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                
                Modul modul = (Modul)rs.getObject("modul");
                NivoStudija nivo=(NivoStudija)rs.getObject("nivoStudija");
                Student s=new Student(id, jmbg, brojIndeksa, ime, prezime, modul, nivo);
                
                list.add(s);
            }
            
        } catch(SQLException ex){
            System.out.println("Greska pri konekciji");
        }
     
        
        
        return list;
    }
    
     public void saveStudent(Student student){
        try{
          
           
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
        
          
           
           String query = "UPDATE student SET jmbg = ?, brojIndeksa = ?, ime = ?, prezime = ?, modul = ?, nivo = ? WHERE id =" + student.getStudentID();
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
    public static void main(String[] args) {
      
        
    }
     
}
