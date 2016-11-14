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
    Statement stmt;
    Connection con;
    int p;
    
    public Db_Repo(){
        p = 0;
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            }catch(ClassNotFoundException e){
                System.out.println(e);
            }        
            try{
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/ECS_Coversheets_Database", "James", "Password");
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM APP.COVERSHEETS");
                while (rs.next()) {
                    rs.getInt("ID");
                    p++;               
                }
        }catch(SQLException e){
            System.err.println(e);
        }
    }
   /* public void ConnectToDb(){
                        try{ 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        try{
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/ECS_Coversheets_Database", "James", "Password");
        stmt = con.createStatement();
        
        
        
 
        }catch(SQLException e){
            System.err.println(e);
        }
    }*/
  
    
    
    public String[] getDataDB(String Modcode){
        try{
            System.out.println(Modcode);
        
        String query = "SELECT ID, MODULE_CODE, MODULE_TITLE FROM APP.COVERSHEETS WHERE MODULE_CODE = ?";
        PreparedStatement pt = con.prepareStatement(query);
        
        pt.setString(1, Modcode);    
        //pt.executeUpdate();
        
        ResultSet rs  = pt.executeQuery();
        if (rs.next()) {
        //SELECT * FROM APP.COVERSHEETS 
        //WHERE MODULE_CODE = '310CT';
        int n = rs.getInt("ID");
        String[] s = new String[2];
        s[0] = rs.getString("MODULE_CODE");
        s[1] = rs.getString("MODULE_TITLE");
        return s;
        //System.out.println(n + " " + s + " " + s2);
        }
        }
        catch(SQLException e){
                     System.err.println(e); 

                     return null;
                       }
       return null;
       
    } 
    public int GetP(){
        return p;
    }
    
    
    public void EnterOriginalDataDB(String code, String Title){
        
        try{
        
        //String sql = ("INSERT INTO APP.COMPCOVERSHEETS (ID,MODULE_CODE,MODULE_TITLE,STUD_ID,STUD_NAME) VALUES (" + p + "','" + code + "','" + Title  + "','" + ID + "','" + Name + "')'");
        //stmt.executeUpdate(sql);
        
        String query = ("INSERT INTO APP.COVERSHEETS (ID,MODULE_CODE,MODULE_TITLE) VALUES (?,?,?)");
        PreparedStatement pt = con.prepareStatement(query);
        
        pt.setInt(1, p);
        pt.setString(2, code);
        pt.setString(3, Title);
        //pt.setInt(4, ID);
        //pt.setString(5, Name);
        //pt.executeUpdate();
        
        pt.executeUpdate();
        
        p++;
        
        }catch(SQLException e){
            System.err.println(e);
        }
        }
    }
    

