package bank.management.system;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class newCon {
    Connection connection;
    Statement statement;



    public newCon(){

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root", "Hirun500#%");

        }catch(Exception e){
            e.printStackTrace();

        }
    }
}