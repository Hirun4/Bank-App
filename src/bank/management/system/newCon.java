package bank.management.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class newCon {
    Connection connection;
    Statement statement;



    public newCon(){

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root", "12345678");
            statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();

        }
    }
}