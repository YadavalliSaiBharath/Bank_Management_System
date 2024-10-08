
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno = formno;
        setLayout(null);
     
        JLabel l1 = new JLabel("Page 3 : Account Details :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        l1.setForeground(Color.WHITE);
        add(l1);
        
        JLabel type = new JLabel("Account Type :");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,100,200,30);
        type.setForeground(Color.WHITE);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,150,200,20);
        //r1.setForeground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(400,150,200,20);
        //r1.setForeground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,190,200,20);
        //r1.setForeground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(400,190,200,20);
        //r1.setForeground(Color.WHITE);
        add(r4);
        
        ButtonGroup groupaccounts = new ButtonGroup();
        groupaccounts.add(r1);
        groupaccounts.add(r2);
        groupaccounts.add(r3);
        groupaccounts.add(r4);
        
        JLabel card = new JLabel("Card Number :");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,230,200,30);
        card.setForeground(Color.WHITE);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-0581");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,230,300,30);
        number.setForeground(Color.WHITE);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,260,300,20);  //330
        carddetail.setForeground(Color.WHITE);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,300,200,30); //370
        pin.setForeground(Color.WHITE);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,300,300,30);
        pnumber.setForeground(Color.WHITE);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit PIN Number");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,330,300,20); //400
        pindetail.setForeground(Color.WHITE);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required :");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,370,200,30); // 450
        services.setForeground(Color.WHITE);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBounds(100,420,200,30); //500
        c1.setFocusable(false);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBounds(350,420,200,30); //500
        c2.setFocusable(false);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBounds(100,470,200,30); //550
        c3.setFocusable(false);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBounds(350,470,200,30); //550
        c4.setFocusable(false);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBounds(100,520,200,30); //600
        c5.setFocusable(false);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBounds(350,520,200,30); //600
        c6.setFocusable(false);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,13));
        c7.setBounds(100,570,600,30); //650
        c7.setFocusable(false);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setBackground(Color.WHITE);
        submit.setBounds(250,630,100,30);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setFocusable(false);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setBackground(Color.WHITE);
        cancel.setBounds(420,630,100,30);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setFocusable(false);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.BLACK);
        setSize(850,820);
        setLocation(350,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //setBackground(Color.BLACK);
    }
    
    public void actionPerformed(ActionEvent ae){
    
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
               accountType = "Saving Account";
            } else if(r2.isSelected()){
               accountType = "Fixed Deposit Account";
            } else if(r3.isSelected()){
                accountType = "Current Account";
            } else if(r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5081102300000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility + " ATM Card";
            } else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }  else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }  else if(c4.isSelected()){
                facility = facility + " Email & SMS Alerts";
            }  else if(c5.isSelected()){
                facility = facility + " Cheque Book";
            }  else if(c6.isSelected()){
                facility = facility + " E-Statement";
            } 
            
            try {
                if(accountType.equals("")){
                   JOptionPane.showMessageDialog(null,"Account Type is required!");
                } else {
                  Conn conn = new Conn();
                  String query1 = "insert into signupthree values('"+formno+"' , '"+accountType+"' , '"+cardnumber+"' , '"+pinnumber+"' , '"+facility+"')";
                  String query2 = "insert into login values('"+formno+"' , '"+cardnumber+"' , '"+pinnumber+"')";
                  
                  conn.s.executeUpdate(query1);
                  conn.s.executeUpdate(query2);
                  
                  JOptionPane.showMessageDialog(null, "Card Number : " + cardnumber +"\n Pin : " + pinnumber);
                  
                  setVisible(false);
                  new Deposit(pinnumber).setVisible(false);
                }
                
            } catch(Exception e){
                System.out.println(e);
            }
            
        } else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
    
        new SignupThree("");
    }
    
}

