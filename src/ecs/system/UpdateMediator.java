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
        CoverSheetUpdate_Processor CovsheUp = new CoverSheetUpdate_Processor();
        public void UpdateCover(String Modcode, String Title, int ID, String Name){
        
        CovsheUp.CreateCompCoversheet(Modcode,Title,ID,Name);
        JOptionPane.showMessageDialog(null, "CoverSheet Uploaded");
    }
    public String[] getDataFromobj(String Modcode){
        String[] R = new String[2];
        R = CovsheUp.getDataFromobj(Modcode);
        return R;
    }
}
