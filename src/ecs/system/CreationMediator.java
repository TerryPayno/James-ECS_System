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
    //Instantiate the coversheetCreation_processor and Db_repo.
    CoverSheetCreation_processor CovsheCre = new CoverSheetCreation_processor();
    Db_Repo DbPro = new Db_Repo();
    
    public void CreateCoverSheet(String code, String Title){
        //Call a method from within the CoverSheetCreation_processor to create a coversheet.
        CovsheCre.CreateCoverSheet(code, Title);
        //Display a message box to inform the user that there 
        //coversheet has been updated successfully.
        JOptionPane.showMessageDialog(null, "CoverSheet Created");
    }
}

