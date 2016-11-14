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
    Db_Repo DbPro = new Db_Repo();
    CoverSheet cover  = new CoverSheet();
    
    public void CreateCompCoversheet(){
        cover.UpdateCoversheet(0, Name);
        
    }
    
    
    public void UpdateCoverSheet(){
        DbPro.UpdateDataDB();
    }
    
}
