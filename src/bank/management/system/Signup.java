package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {

    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);






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
