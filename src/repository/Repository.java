/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.*;
public class Repository {
    
    public Connection konekcija;
    public Connection returnConnection(){
        try{
           String url="jdbc:mysql://localhost:3360/PraksaApp";
           Connection konekcija=DriverManager.getConnection(url, "root", "");
    } catch(SQLException ex){
            System.out.println(ex.getMessage()+"neuspesno povezivanje");
    }
       return konekcija;
    }
    
    
}
