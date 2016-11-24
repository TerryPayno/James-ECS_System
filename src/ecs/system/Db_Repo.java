/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author jwepa
 */
public class Db_Repo {
    //Global variable declaration 
    Statement stmt;
    Connection con;
    int p;
    
    
    public Db_Repo(){
        //constructor used to connect to the database 
        //when I create a database_repo object.
        p = 0;
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }           
        try{
            //connection string
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ECS_Coversheets_Database", "James", "Password");
            stmt = con.createStatement();
            //SQL statement stored in stmt
            ResultSet rs = stmt.executeQuery("SELECT * FROM APP.COVERSHEETS");
            //While loop to count the number of cover sheets 
            //in the database table to work out the next unique ID
            while (rs.next()) {
                rs.getInt("ID");
                p++;               
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }  
    
    
    public void UpdateDataDB(String code, String Title,int ID,String Name){
        //This method is used to store the cover sheet after it has been updated
        //with the student's information such as their student id and name.
        try{      
            //SQL query stored in query variable 
            String query = ("INSERT INTO APP.COMPCOVERSHEETS (ID,MODULE_CODE,MODULE_TITLE,STUD_ID,STUD_NAME) VALUES (?,?,?,?,?)");
            //Prepared statements have been used to prevent SQL injection.
            PreparedStatement pt = con.prepareStatement(query);
        
            pt.setInt(1, p);
            pt.setString(2, code);
            pt.setString(3, Title);
            pt.setInt(4, ID);
            pt.setString(5, Name);

            pt.executeUpdate();
            //increment "p" by 1 to keep the ID unique
            p++;
        
        }catch(SQLException e){
            System.err.println(e);
        }
    }
        
        
    public String[] Restobj(String Modcode){
        //restobj is a method that will update the attributes of the coversheet 
        //object with the correct attributes for the coversheet wanted.
        try{
            
            String query = "SELECT ID, MODULE_CODE, MODULE_TITLE FROM APP.COVERSHEETS WHERE MODULE_CODE = ?";
            //Again prepared statements are used
            PreparedStatement pt = con.prepareStatement(query);

            pt.setString(1, Modcode);    
             //Here we are retrieving all the information that we need from the 
             //database to store in the object attributes.
            ResultSet rs  = pt.executeQuery();
            if (rs.next()) {
                String[] s = new String[2];
                s[0] = rs.getString("MODULE_CODE");
                s[1] = rs.getString("MODULE_TITLE");
                return s;
            }
        }
        catch(SQLException e){
            System.err.println(e); 
            return null;
        }
    return null;
    }
    
    public int GetP(){
    //Return the number of coversheets stored in the database.
        return p;
    }
    
    
    public void EnterOriginalDataDB(String code, String Title){
        //Return the number of coversheets stored in the database.
        try{      
        String query = ("INSERT INTO APP.COVERSHEETS (ID,MODULE_CODE,MODULE_TITLE) VALUES (?,?,?)");
        PreparedStatement pt = con.prepareStatement(query);
        
        pt.setInt(1, p);
        pt.setString(2, code);
        pt.setString(3, Title);
        
        pt.executeUpdate();
        
        p++;
        
        }catch(SQLException e){
            System.err.println(e);
        }
    }
        
}
    

