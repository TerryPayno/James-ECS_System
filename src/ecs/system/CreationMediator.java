/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//@@@@@@@@@@ This is where all the events will but sent out to all the processors that are need to complete the event@@@@@@@@@// 

package ecs.system;
import javax.swing.JOptionPane;
//import java.sql.*;

/**
 *
 * @author jwepa
 */
public class CreationMediator {
    CoverSheetCreation_processor CovsheCre = new CoverSheetCreation_processor();

    Db_Repo DbPro = new Db_Repo();
     
    /*public void initConnectToDb(){
    DbPro.ConnectToDb();
    }*/
    

    public void CreateCoverSheet(String code, String Title){
        CovsheCre.CreateCoverSheet(code, Title);
        JOptionPane.showMessageDialog(null, "CoverSheet Created");
    }

    }

