/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//@@@@@@@ This is where any info about the student will be added to  the coversheet.@@@@@@@//
package ecs.system;

/**
 *
 * @author jwepa
 */
public class Student_Processor {
    int studentID;
    String studentFName;
    String studentLName;
/*public Student_Processor(int ID, String fName,String lName){
    studentID = ID;
    studentFName = fName;
    studentLName = lName;
}*/
public void editInfo(int ID, String fName, String lName){
    //String sqlquery = "INSERT INTO APP.COVERSHEETS(ID, MODULE_CODE,MODULE_TITLE) VALUES(1,310CT,INTELL AGENTS)";
    studentID = ID;
    studentFName = fName;
    studentLName = lName;
     
}
public int getID(){
    return studentID;
}
public String getFName(){
    return studentFName;
 }
public String getLName(){
    return studentLName;
}


}

