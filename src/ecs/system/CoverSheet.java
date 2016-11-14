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
public class CoverSheet {
    int CoverSheetID;
    String ModCode;
    String ModTitle;
    int StudID;
    String StudName;


    
    public void CreateCoverSheet(String code, String Title){
        ModCode = code;
        ModTitle = Title;
    }
    public void UpdateCoversheet(int ID, String Name){
        StudID = ID;
        StudName = Name;
    }
    
    
    //// Getting all the cover sheet atts
    public int GetCoverID(){
        return CoverSheetID;
    }
    public String GetModCode(){
        return ModCode;
    }
    public String GetModTitle(){
        return ModTitle;
    }
    public int GetStudID(){
        return StudID;
    }
    public String GetStudName(){
        return StudName;
    }
//    public void inputDb(String code, String Title, int ID, String Name){
//        DbPro.EnterDataDB(CoverSheetID,ModCode, ModTitle, StudID, StudName);
//    }
}
