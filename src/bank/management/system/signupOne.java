
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextfield,fnameTextfield,emailTextfield,addressTextfield,cityTextfield,stateTextfield,pincodeTextfield;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    
    signupOne(){
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO : " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setForeground(Color.WHITE);
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setForeground(Color.WHITE);
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setForeground(Color.WHITE);
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextfield = new JTextField();
        nameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextfield.setBounds(280,140,400,30);
        add(nameTextfield);
        
        JLabel fname = new JLabel("Father Name :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setForeground(Color.WHITE);
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextfield = new JTextField();
        fnameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextfield.setBounds(280,190,400,30);
        add(fnameTextfield);
        
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setForeground(Color.WHITE);
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(280,240,400,30);
        //dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setForeground(Color.WHITE);
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(280,290,60,30);
        male.setBackground(Color.BLACK);
        male.setForeground(Color.WHITE);
        male.setFocusable(false);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.BLACK);
        female.setForeground(Color.WHITE);
        female.setFocusable(false);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setForeground(Color.WHITE);
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextfield = new JTextField();
        emailTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextfield.setBounds(280,340,400,30);
        add(emailTextfield);
        
        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setForeground(Color.WHITE);
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(280,390,100,30);
        married.setBackground(Color.BLACK);
        married.setForeground(Color.WHITE);
        married.setFocusable(false);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.BLACK);
        unmarried.setForeground(Color.WHITE);
        unmarried.setFocusable(false);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(610,390,100,30);
        other.setBackground(Color.BLACK);
        other.setForeground(Color.WHITE);
        other.setFocusable(false);
        add(other);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
         JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setForeground(Color.WHITE);
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextfield = new JTextField();
        addressTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextfield.setBounds(280,440,400,30);
        add(addressTextfield);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setForeground(Color.WHITE);
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextfield = new JTextField();
        cityTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextfield.setBounds(280,490,400,30);
        add(cityTextfield);
        
        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setForeground(Color.WHITE);
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextfield = new JTextField();
        stateTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextfield.setBounds(280,540,400,30);
        add(stateTextfield);
        
        JLabel pincode = new JLabel("Pin Code :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setForeground(Color.WHITE);
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextfield = new JTextField();
        pincodeTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextfield.setBounds(280,590,400,30);
        add(pincodeTextfield);
        
        next = new JButton("Next");
        next.setBounds(600,640,80,30);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFocusable(false);
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.addActionListener(this);
        add(next);
         
        getContentPane().setBackground(Color.BLACK);
        
        setSize(850,800);
        setLayout(null);
        setLocation(350,10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
      
        String formno = "" + random;//formno is a long so we need to change it into string 
        String name = nameTextfield.getText(); // getText is used to get the data from the nameTextfield 
        String fname = fnameTextfield.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null; //to check which radiobutton is selected
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextfield.getText();
        String marital = null;
        if(married.isSelected()){
           marital = "Married";
        } else if(unmarried.isSelected()){
           marital = "Unmarried";
        } else if(other.isSelected()){
           marital = "Other";
        }
        
        String address = addressTextfield.getText();
        String city = cityTextfield.getText();
        String state = stateTextfield.getText();
        String pincode = pincodeTextfield.getText();
        
        
        try{
           if(name.equals("")){
             JOptionPane.showMessageDialog(null, "Name is required!");
           } else if(fname.equals("")){
             JOptionPane.showMessageDialog(null, "Father Name is required!");
           } else if(email.equals("")){
             JOptionPane.showMessageDialog(null, "Email is required!");
           } else if(gender.equals("")){
             JOptionPane.showMessageDialog(null, "Gender is required!");
           } else if(marital.equals("")){
             JOptionPane.showMessageDialog(null, "MArital status is required!");
           } else if(pincode.equals("")){
             JOptionPane.showMessageDialog(null, "PinCode is required!");
           } else if(city.equals("")){
             JOptionPane.showMessageDialog(null, "City Name is required!");
           } else if(state.equals("")){
             JOptionPane.showMessageDialog(null, "State Name is required!");
           } else if(address.equals("")){
             JOptionPane.showMessageDialog(null, "Address is required!");
           } else if(dob.equals("")){
             JOptionPane.showMessageDialog(null, "Date of Birth is required!");
           }   
           else{
               Conn c = new Conn();
               String query = "insert into signup values('"+formno+"' , '"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' ,'"+email+"' , '"+marital+"' , '"+address+"' , '"+city+"' , '"+state+"' , '"+pincode+"')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new SignupTwo(formno).setVisible(true);
           }
        } catch(Exception e){
           System.out.println(e);
        }
    }
    
    public static void main(String args[]){
    
        new signupOne();
    }
    
}


