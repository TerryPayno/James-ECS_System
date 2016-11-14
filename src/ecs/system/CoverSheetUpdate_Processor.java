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
    CoverSheet cover  = new CoverSheet();
    
    public void CreateCompCoversheet(String Modcode, String Title, int ID, String Name){
        cover.UpdateCoversheet(Modcode,Title,ID,Name);
        
    }
    public String[] getDataFromobj(String Modcode){
        cover.Restobj(Modcode);
        String[] S = new String[2];
        S[0] = cover.GetModCode();
        S[1] = cover.GetModTitle();
        return S;
    }
    public void CreateCoverSheet(String code, String Title){
        cover.CreateCoverSheet(code,Title);
    }
    
    public void UpdateCoverSheetDb(){
        
    }
    
}
