
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        
        this.pinnumber = pinnumber;
        
        setLayout(null);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(220,230,700,40);  //235 , 300, 700, 35
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,324,150,23);
        deposit.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(350,324,150,23);
        withdrawl.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,350,150,23);
        fastcash.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(350,350,150,23);
        ministatement.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170,376,150,23);
        pinchange.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(350,376,150,23);
        balanceenquiry.setFocusable(false);
        //deposit.setBackground(Color.WHITE);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
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
             System.exit(0);
        } else if(ae.getSource() == deposit){
          setVisible(false);
          new Deposit(pinnumber).setVisible(true);
        } else if(ae.getSource() == withdrawl){
           setVisible(false);
           new Withdrawl(pinnumber).setVisible(true);
        } else if(ae.getSource() == fastcash){
           setVisible(false);
           new FastCash(pinnumber).setVisible(true);
        } else if(ae.getSource() == pinchange){
           setVisible(false);
           new PinChange(pinnumber).setVisible(true);
        } else if(ae.getSource() == balanceenquiry){
           setVisible(false);
           new BalanceEnquiry(pinnumber).setVisible(true);
        } else if(ae.getSource() == ministatement){
            //setVisible(false);
           new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]){
       new Transactions("");
    }
}
