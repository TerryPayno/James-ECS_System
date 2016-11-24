/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs.system;

/**
 *
 * @author jwepa
 */
public class CoverSheetUpdate_Processor {
    //instantiation of coversheet object.
    CoverSheet cover  = new CoverSheet();
    
    public void CreateCompCoversheet(String Modcode, String Title, int ID, String Name){
        //Calling a method from within coversheets to update the cover sheet object.
        cover.UpdateCoversheet(Modcode,Title,ID,Name);
        
    }
    public String[] getDataFromobj(String Modcode){
        //Calling method from within coversheet to retrieve 
        //the coversheet attributes module code and module title. 
        cover.Restobj(Modcode);
        String[] S = new String[2];
        S[0] = cover.GetModCode();
        S[1] = cover.GetModTitle();
        return S;
    }

    
}
