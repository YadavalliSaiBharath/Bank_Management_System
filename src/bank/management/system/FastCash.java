
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    
    FastCash(String pinnumber){
        
        this.pinnumber = pinnumber;
        
        setLayout(null);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(220,230,700,40);  //235 , 300, 700, 35
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(170,324,150,23);
        deposit.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Rs 500");
        withdrawl.setBounds(350,324,150,23);
        withdrawl.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Rs 1000");
        fastcash.setBounds(170,350,150,23);
        fastcash.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Rs 2000");
        ministatement.setBounds(350,350,150,23);
        ministatement.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Rs 5000");
        pinchange.setBounds(170,376,150,23);
        pinchange.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Rs 10000");
        balanceenquiry.setBounds(350,376,150,23);
        balanceenquiry.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Back");
        exit.setBounds(255,402,150,23);
        exit.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900, 700);
        setLocation(300,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true); //Removes the top left over frame from the screen the sccreen where we can minimize and remove the frame
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else{
          String amount = ((JButton)ae.getSource()).getText().substring(3); //removes 3 starting characters from the string Rs 500
          Conn c = new Conn();
          try{
             ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
             int balance = 0;
             //rs.next() will loop all the rows present in the bank table  
             while(rs.next()){
                if(rs.getString("Type").equals("Deposit")){
                   balance += Integer.parseInt(rs.getString("Amount"));
                } else{
                  balance -= Integer.parseInt(rs.getString("Amount"));
                }
             }
             
             if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
               JOptionPane.showMessageDialog(null,"Insufficient Balance!");
               return;
             }
             
             Date date = new Date();
             String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Successfully");
             
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
             
          } catch(Exception e){
             System.out.println(e);
          }
        }
    }
    public static void main(String args[]){
       new FastCash("");
    }
}
