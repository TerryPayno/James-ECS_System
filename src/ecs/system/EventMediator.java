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
    CoverSheetCreation_processor CovshePro = new CoverSheetCreation_processor();
    CoverSheetUpdate_Processor CovsheUp = new CoverSheetUpdate_Processor();
    Db_Repo DbPro = new Db_Repo();
     
    /*public void initConnectToDb(){
    DbPro.ConnectToDb();
    }*/
    public String[] getDataFromDB(String Modcode){ //// WTF WAS I DOING ???????????? DATABASE LINKED TO MEDIATOR WHERE IS PROCESSOR???????
    String[] s = new String[2];
    s = DbPro.getDataDB(Modcode);
    //System.out.println(DbPro.getDataDB(Modcode));
    System.out.println("lit" + s[0] + s[1]);
    return (s);
    }
    public void CreateCoverSheet(String code, String Title){
        CovshePro.CreateCoverSheet(code,Title);
        CovshePro.EnterCoverSheet();
    }
    public void UpdateCover(){
        CovsheUp.CreateCompCoversheet();
    }
    }

