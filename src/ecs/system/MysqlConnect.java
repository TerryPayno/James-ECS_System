/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

/**
 *
 * @author Sabhi
 */
import java.sql.*;
import javax.swing.*;
public class MysqlConnect {
    Connection conn =null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Connection conn=DriverManager.getConnection("jdbc:mysql://31.170.160.95:3306/a5371835_test","a5371835_sabhi","9023242590");
            Connection conn=DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/logindatabase","sabhisohal","9023242590");
           JOptionPane.showMessageDialog(null,"connected to database");
           return conn;
    }
        
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
    //jdbc:jtds:sqlserver:
    //jdbc:mysql:
    //jdbc:sqlserver:
}
}
}

