/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs.system;
import javax.swing.JOptionPane;

/**
 *
 * @author jwepa
 */
public class UpdateMediator {
        //Instanctiate CoverSheetUpdate_Processor.
        CoverSheetUpdate_Processor CovsheUp = new CoverSheetUpdate_Processor();
    
        public void UpdateCover(String Modcode, String Title, int ID, String Name){
        //Call a method from within the CoverSheetUpdate_Processor to create the updated coversheet and 
        //display a message box to inform the user that it was successful.
        CovsheUp.CreateCompCoversheet(Modcode,Title,ID,Name);
        JOptionPane.showMessageDialog(null, "CoverSheet Uploaded");
    }
        public String[] getDataFromobj(String Modcode){
        //Retrieving information about the cover sheet to display on the GUI.
        String[] R;
        R = CovsheUp.getDataFromobj(Modcode);
        return R;
    }
}
