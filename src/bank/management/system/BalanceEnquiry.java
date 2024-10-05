
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber;
    
    BalanceEnquiry(String pinnumber){
    
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);
        
        back = new JButton("BACK");
        back.setBounds(350,404,150,23);
        back.setFocusable(false);
        back.addActionListener(this);
        image.add(back);
        
        Conn c = new Conn();
        int balance = 0;
          try {
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
             //rs.next() will loop all the rows present in the bank table  
            while(rs.next()){
                if(rs.getString("Type").equals("Deposit")){
                   balance += Integer.parseInt(rs.getString("Amount"));
                } else{
                  balance -= Integer.parseInt(rs.getString("Amount"));
                }
             } 
          } catch(Exception e){
                System.out.println(e);
          }
          
          JLabel text = new JLabel("Your Current Account Balance is Rs "+ balance);
          text.setForeground(Color.WHITE);
          text.setBounds(215,230,700,90); //257
          image.add(text);
        
        setSize(900,700);
        setLocation(300,0);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        //if(ae.getSource() == back){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
        //}
    }
    
    public static void main(String args[]){
       new BalanceEnquiry("");
    }
}
