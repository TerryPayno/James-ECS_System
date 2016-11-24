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
    //The global variables and coversheet object attributes are being defined. 
    Db_Repo DbPro = new Db_Repo();
    int CoverSheetID;
    String ModCode;
    String ModTitle;
    int StudID;
    String StudName;
    String[] s = new String[3];


    
    public void CreateCoverSheet(String code, String Title){
        //Taking the information from the GUI and storing them in attributes of the object.
        //And adding call a db_repo method to add to the database  
        ModCode = code;
        ModTitle = Title;
        DbPro.EnterOriginalDataDB(ModCode,ModTitle);
    }
    public void UpdateCoversheet(String Code,String modTitle, int ID, String Name){
        //Doing the same as the above method 
        //just with some extra information about the student added.
        ModCode = Code;
        ModTitle = modTitle;
        StudID = ID;
        StudName = Name;
        System.out.print(CoverSheetID+" "+ModCode+" "+ModTitle+" "+StudID+" "+StudName);
        DbPro.UpdateDataDB(ModCode,ModTitle,StudID,StudName);
        
    }
    public boolean Restobj(String Modcode){
        //call a method in db_repo and updating so of the coversheet 
        //attributes with information retrieved to be used later if needed. 
        String[] S;// = new String[2];
        S = DbPro.Restobj(Modcode);
        ModCode = S[0];
        ModTitle = S[1];
        return true;
    }
    
    
    //Getting all the cover sheet attributes 
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
