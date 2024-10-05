package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
        JButton login,clear,signup;
        JTextField CardTextfield;
        JPasswordField PinTextfield;
    
        Login(){
             
            setSize(800, 480);
            setLayout(null);
            setTitle("AUTOMATED TELLER MACHINE");
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel label = new JLabel(i3);
            label.setBounds(70,10,100,100);
            add(label);
            
            JLabel text = new JLabel("Welcome To ATM");
            text.setFont(new Font("Osward",Font.BOLD, 38));
            text.setBounds(250,40,400,40);
            text.setForeground(Color.WHITE);
            add(text);
            
             JLabel cardno = new JLabel("Card No :");
            cardno.setFont(new Font("Raleway",Font.BOLD, 28));
            cardno.setBounds(120,150,150,30);
            cardno.setForeground(Color.WHITE);
            add(cardno);
            
            CardTextfield = new JTextField();
            CardTextfield.setBounds(270,150,250,30);
            CardTextfield.setFont(new Font("Arial",Font.BOLD,14));
            add(CardTextfield);
            
             JLabel pin = new JLabel("PIN :");
            pin.setFont(new Font("Raleway",Font.BOLD, 28));
            pin.setBounds(120,220,150,30);
            pin.setForeground(Color.WHITE);
            add(pin);
            
            PinTextfield = new JPasswordField();
            PinTextfield.setBounds(270,220,250,30);
            PinTextfield.setFont(new Font("Arial",Font.BOLD,14));
            add(PinTextfield);
            
            login = new JButton("SIGN IN");
            login.setBounds(270,280,100,30);
            login.setForeground(Color.BLACK);
            login.setBackground(Color.WHITE);
            login.addActionListener(this);
            login.setFocusable(false);
            add(login);
            
            clear = new JButton("CLEAR");
            clear.setBounds(420,280,100,30);
            clear.setForeground(Color.BLACK);
            clear.setBackground(Color.WHITE);
            clear.addActionListener(this);
            clear.setFocusable(false);
            add(clear);
            
            signup = new JButton("SIGN UP");
            signup.setBounds(270,340,250,30);
            signup.setForeground(Color.BLACK);
            signup.setBackground(Color.WHITE);
            signup.addActionListener(this);
            signup.setFocusable(false);
            add(signup);
            
            
            getContentPane().setBackground(Color.BLACK);
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setLocation(350, 130);
        }

        public void actionPerformed(ActionEvent ae){
        
            if(ae.getSource() == clear){
                 CardTextfield.setText("");
                 PinTextfield.setText("");
            }
            else if(ae.getSource() == login){
               Conn conn = new Conn();
               String cardnumber = CardTextfield.getText();
               String pinnumber = PinTextfield.getText();
               String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
               try {
                  ResultSet rs = conn.s.executeQuery(query); //It returns the result from the query
                  if(rs.next()){
                     setVisible(false);
                     new Transactions(pinnumber).setVisible(true);
                  } else{
                       JOptionPane.showMessageDialog(null, "Incorrect CardNumber or Pin");
                       
                  }
               } catch(Exception e){
                   System.out.println(e);
               }
            }
            else if(ae.getSource() == signup){
               setVisible(false);
               new signupOne().setVisible(true);
            }
        }
        
public static void main(String args[]){

          new Login();
   }
}