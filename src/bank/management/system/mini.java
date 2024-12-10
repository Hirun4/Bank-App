package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class mini extends JFrame {

    mini(){

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1= new JLabel();
        label1.setBounds(20,140,400,20);





        setVisible(true);

    }

    public static void main(String[] args){
        new mini();
    }

}
