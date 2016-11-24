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
//instantiation of coversheet object.
CoverSheet cover  = new CoverSheet();


public void CreateCoverSheet(String code, String Title){
//calling a method from within coversheets.   
    cover.CreateCoverSheet(code, Title);
    
}


    
    
   

}

    


