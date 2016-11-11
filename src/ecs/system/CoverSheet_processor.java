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
public class CoverSheet_processor {
    Db_Processor DbPro = new Db_Processor();
    public void inputDb(String code, String Title, int ID, String Name){
        DbPro.EnterDataDB(code, Title, ID, Name);
    }
    public void CreateCoverSheet(){
        
    }
}
