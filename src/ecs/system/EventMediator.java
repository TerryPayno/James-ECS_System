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
    CoverSheetCreation_processor CovsheCre = new CoverSheetCreation_processor();
    CoverSheetUpdate_Processor CovsheUp = new CoverSheetUpdate_Processor();
    Db_Repo DbPro = new Db_Repo();
     
    /*public void initConnectToDb(){
    DbPro.ConnectToDb();
    }*/
    public String[] getDataFromobj(String Modcode){
        String[] R = new String[2];
        R = CovsheUp.getDataFromobj(Modcode);
        return R;
    }
    public void CreateCoverSheet(String code, String Title){
        CovsheCre.CreateCoverSheet(code, Title);
    }
    public void UpdateCover(String Modcode, String Title, int ID, String Name){
        
        CovsheUp.CreateCompCoversheet(Modcode,Title,ID,Name);
    }
    }

