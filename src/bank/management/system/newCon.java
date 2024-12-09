package bank.management.system;


import  java.sql.*;

public class newCon {
    Connection connection;
    Statement statement;



    public newCon(){

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root", "Hirun400#%");
            statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();

        }
    }
}