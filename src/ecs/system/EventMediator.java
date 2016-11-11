/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//@@@@@@@@@@ This is where all the events will but sent out to all the processors that are need to complete the event@@@@@@@@@// 

package ecs.system;
//import java.sql.*;

/**
 *
 * @author jwepa
 */
public class EventMediator {
    Student_Processor StudPro = new Student_Processor();
    CoverSheet_processor CovshePro = new CoverSheet_processor();
    Retrieval_Processor RetrivePro = new Retrieval_Processor();
    Db_Processor DbPro = new Db_Processor();
    
    public void addStudentInfo(String TempVar){
        StudPro.editInfo( 1, TempVar, "Filler");
    }
    
    public void Retrieval(){
        RetrivePro.GetData();
    }
    /*public void initConnectToDb(){
    DbPro.ConnectToDb();
    }*/
    public String[] getDataFromDB(String Modcode){
    String[] s = new String[2];
    s = DbPro.getDataDB(Modcode);
    //System.out.println(DbPro.getDataDB(Modcode));
    System.out.println("lit" + s[0] + s[1]);
    return (s);
    }
    public void printInfo(){
        System.out.println((StudPro.getID()) + " " + (StudPro.getFName()) + " " + (StudPro.getLName()));
    }
    
    }

