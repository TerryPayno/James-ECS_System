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
public class CoverSheetCreation_processor {
CoverSheet cover  = new CoverSheet();
Db_Repo DbPro = new Db_Repo();
public void CreateCoverSheet(String code, String Title){
    
    cover.CreateCoverSheet(code, Title);
    
}
public void EnterCoverSheet(){

    
    DbPro.EnterOriginalDataDB(cover.GetModCode(),cover.GetModTitle() );
   
}
}

    


