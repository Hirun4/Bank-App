package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class mini extends JFrame {

    String pin;

    mini(){

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1= new JLabel();
        label1.setBounds(20,140,400,20);
        add(label1);

        JLabel label2 = new JLabel("Dev Boys");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3= new JLabel();
        label1.setBounds(20,80,300,20);
        add(label3);

        JLabel label4= new JLabel();
        label1.setBounds(20,400,300,20);
        add(label4);


        try {
            newCon c =new newCon();
            ResultSet resultSet= c.statement.executeQuery("select * from login where pin= '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+ resultSet.getString("cardno").substring(0,4) + "XXXXXXXX" + resultSet.getString("cardno").substring(12));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        try {

        }catch (Exception e){
            e.printStackTrace();
        }





        setVisible(true);

    }

    public static void main(String[] args){
        new mini();
    }

}
