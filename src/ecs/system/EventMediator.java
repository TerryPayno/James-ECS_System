/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//@@@@@@@@@@ This is where all the events will but sent out to all the processors that are need to complete the event@@@@@@@@@// 

package ecs.system;
import java.sql.*;

/**
 *
 * @author jwepa
 */
public class EventMediator {
    Student_Processor StudPro = new Student_Processor();
    CoverSheet_processor CovshePro = new CoverSheet_processor();
    Retrieval_Processor RetrivePro = new Retrieval_Processor();
    
    public void addStudentInfo(String TempVar){
        StudPro.editInfo( 1, TempVar, "Filler");
    }
    
    public void Retrieval(){
        RetrivePro.GetData();
    }
    public void printInfo(){
        System.out.println((StudPro.getID()) + " " + (StudPro.getFName()) + " " + (StudPro.getLName()));
                try{ 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ECS_Coversheets_Database", "James", "Password");
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM APP.COVERSHEETS");
        
        while (rs.next()) {
        int n = rs.getInt("ID");
        String s = rs.getString("MODULE_CODE");
        String s2 = rs.getString("MODULE_TITLE");
        System.out.println(n + " " + s + " " + s2);
    }
        }catch(SQLException e){
            System.err.println(e);
        }                 
     
      }       
    }

