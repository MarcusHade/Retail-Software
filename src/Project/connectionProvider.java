

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;  
//import java.sql.DriverManager;

/**
 *
 * @author Gnaneshwaar
 */
public class connectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rs", "root", "admin");
            return con;
        }
        catch(Exception e){              

            System.out.println("the exception is "+ e);
            return (null); 
        }
    }
            
}
