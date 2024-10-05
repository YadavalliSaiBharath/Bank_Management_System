
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pin, repin;
    JButton change,back;
    String pinnumber;
    
    PinChange(String pinnumber){
    
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(257,230,700,35);
        image.add(text);
        
        JLabel pintext = new JLabel("NEW PIN :");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(172,270,380,25);
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(344,270,170,20);
        image.add(pin);
        
        JLabel repintext = new JLabel("RE-ENTER NEW PIN :");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(172,300,380,25);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,20));
        repin.setBounds(344,300,170,20);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(350,376,150,23);
        change.setFocusable(false);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(350,404,150,23);
        back.setFocusable(false);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,700);
        setLocation(300,0);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
      
        if(ae.getSource() == change){
            try {
                String npin = pin.getText();
                String rpin = repin.getText();
            
                if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"Entered PIN Doesn't Match!!!");
                return;
            }
                
                if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter New PIN!!");
                return;
                 }
                
                if(rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please Re-Enter New PIN!!");
                return;
                }
                
                Conn conn = new Conn();
                String query1 = "update bank set Pin = '"+rpin+"' where Pin = '"+pinnumber+"'";
                String query2 = "update login set Pin = '"+rpin+"' where Pin = '"+pinnumber+"'";
                String query3 = "update signupthree set Pin = '"+rpin+"' where Pin = '"+pinnumber+"'";
                
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null,"PIN Changed successfully!!");
                
                setVisible(false);
                new Transactions(rpin).setVisible(true);
                

              } catch(Exception e){
                System.out.println(e);
            }
            
      } else {
          setVisible(false);
          new Transactions(pinnumber).setVisible(true);
        }
        
    }
    
    public static void main(String args[]){
     
        new PinChange("").setVisible(true);
        
    }
    
}
