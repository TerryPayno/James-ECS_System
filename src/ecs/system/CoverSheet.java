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
    Db_Repo DbPro = new Db_Repo();
    int CoverSheetID;
    String ModCode;
    String ModTitle;
    int StudID;
    String StudName;
    String[] s = new String[3];


    
    public void CreateCoverSheet(String code, String Title){
        ModCode = code;
        ModTitle = Title;
        DbPro.EnterOriginalDataDB(ModCode,ModTitle);
    }
    public void UpdateCoversheet(String Code,String modTitle, int ID, String Name){
        //CoverSheetID = Integer.parseInt(s[0]);
        ModCode = Code;
        ModTitle = modTitle;
        StudID = ID;
        StudName = Name;
        System.out.print(CoverSheetID+" "+ModCode+" "+ModTitle+" "+StudID+" "+StudName);
        DbPro.UpdateDataDB(ModCode,ModTitle,StudID,StudName);
        
    }
    public boolean Restobj(String Modcode){
        String[] S;// = new String[2];
        S = DbPro.Restobj(Modcode);
        ModCode = S[0];
        ModTitle = S[1];
        return true;
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
}
