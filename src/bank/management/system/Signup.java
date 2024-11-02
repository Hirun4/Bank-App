package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {

    Signup(){
        super("APPLICATION FORM");
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    public static void main(String[] args) {
new Signup();
    }
}
