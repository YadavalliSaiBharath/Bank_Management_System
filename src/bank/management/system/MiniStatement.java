
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;


public class MiniStatement extends JFrame{
    
    //String pinnumber;
    
    MiniStatement(String pinnumber){
        
       // this.pinnumber = pinnumber;
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        mini.setForeground(Color.WHITE);
        add(mini);
        
        JLabel bank = new JLabel("INDIAN BANK");
        bank.setBounds(150,20,100,25);
        bank.setForeground(Color.WHITE);
        add(bank);
        
        JLabel card = new JLabel();
        card.setForeground(Color.WHITE);
        card.setBounds(20,80,300,20);
        add(card);
        
        JLabel balance = new JLabel();
        balance.setForeground(Color.WHITE);
        balance.setBounds(20,400,300,20);
        add(balance);
        
        try {
             Conn conn = new Conn();
             ResultSet rs = conn.s.executeQuery("select * from login where Pin = '"+pinnumber+"'");
             while(rs.next()){
                  card.setText("Card Number : " + rs.getString("CardNumber").substring(0,4) + "XXXXXXXX" + rs.getString("CardNumber").substring(12));
             }
        } catch(Exception e){
            System.out.println(e);
        }
        
        try {
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("select * from bank where Pin = '"+pinnumber+"'");
            while(rs.next()){
               mini.setText(mini.getText() + "<html>" + rs.getString("Date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("Type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("Amount") + "<br><br><html>");
               if(rs.getString("Type").equals("Deposit")){
                  bal += Integer.parseInt(rs.getString("Amount"));
                } else{
                  bal -= Integer.parseInt(rs.getString("Amount"));
                }
            }
            
            balance.setText("Your Current Account Balance is Rs " + bal);
            
        } catch(Exception e){
             System.out.println(e);
        }
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.BLACK);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }
    
    public static void main(String args[]){
     
        new MiniStatement("");
    }
    
}
