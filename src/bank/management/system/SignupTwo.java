
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton yess,nno,other,eyess,enno;
    JComboBox religion,category,income,education,occupation;
    String formno;
    
    SignupTwo(String formno){
        
        this.formno = formno;
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setForeground(Color.WHITE);
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setForeground(Color.WHITE);
        name.setBounds(100,140,100,30);
        add(name);
        
        String religions[] = {"Hindu","Muslim","Christian","Sikh","Other"}; 
        religion = new JComboBox(religions);
        religion.setBounds(280,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setForeground(Color.WHITE);
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String Categories[] ={"General","OBC","SC","ST","Other"}; 
        category = new JComboBox(Categories);
        category.setBounds(280,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel incomee = new JLabel("Income :");
        incomee.setFont(new Font("Raleway",Font.BOLD,20));
        incomee.setForeground(Color.WHITE);
        incomee.setBounds(100,240,200,30);
        add(incomee);
        
        String incomeCategory[] ={"NULL","< 1,00,000","< 2,00,000","< 5,00,000","UPTO 10,00,000"}; 
        income = new JComboBox(incomeCategory);
        income.setBounds(280,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);     
        
        JLabel edu = new JLabel("Educational");
        edu.setFont(new Font("Raleway",Font.BOLD,20));
        edu.setForeground(Color.WHITE);
        edu.setBounds(100,290,200,30);
        add(edu);       
        
        
        JLabel quali = new JLabel("Qualification :");
        quali.setFont(new Font("Raleway",Font.BOLD,20));
        quali.setForeground(Color.WHITE);
        quali.setBounds(100,315,200,30);
        add(quali);
        
        String educationstatus[] ={"Non Graduate","Graduate","Post Graduation","Doctrate","Other"}; 
        education = new JComboBox(educationstatus);
        education.setBounds(280,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel occup = new JLabel("Occupation :");
        occup.setFont(new Font("Raleway",Font.BOLD,20));
        occup.setForeground(Color.WHITE);
        occup.setBounds(100,390,200,30);
        add(occup);
        
        String occupationstatus[] ={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"}; 
        occupation = new JComboBox(occupationstatus);
        occupation.setBounds(280,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);      
        
        JLabel panno = new JLabel("PAN Number :");
        panno.setFont(new Font("Raleway",Font.BOLD,20));
        panno.setForeground(Color.WHITE);
        panno.setBounds(100,440,200,30);
        add(panno);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(280,440,400,30);
        add(pan);
        
        JLabel adno = new JLabel("Aadhar Number :");
        adno.setFont(new Font("Raleway",Font.BOLD,20));
        adno.setForeground(Color.WHITE);
        adno.setBounds(100,490,200,30);
        add(adno);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(280,490,400,30);
        add(aadhar);
        
        JLabel seniorcitizen = new JLabel("Senior Citizen :");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcitizen.setForeground(Color.WHITE);
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);
        
        yess = new JRadioButton("Yes");
        yess.setBounds(280,540,100,30);
        yess.setBackground(Color.BLACK);
        yess.setForeground(Color.WHITE);
        yess.setFocusable(false);
        add(yess);
        
        nno = new JRadioButton("No");
        nno.setBounds(450,540,100,30);
        nno.setBackground(Color.BLACK);
        nno.setForeground(Color.WHITE);
        nno.setFocusable(false);
        add(nno);
 
        ButtonGroup citizen = new ButtonGroup();
        citizen.add(yess);
        citizen.add(nno);
     
        JLabel existingaccount = new JLabel("Existing Account :");   //590
        existingaccount.setFont(new Font("Raleway",Font.BOLD,20));
        existingaccount.setForeground(Color.WHITE);
        existingaccount.setBounds(100,590,200,30);
        add(existingaccount);
        
        eyess = new JRadioButton("Yes");
        eyess.setBounds(280,590,100,30);
        eyess.setBackground(Color.BLACK);
        eyess.setForeground(Color.WHITE);
        eyess.setFocusable(false);
        add(eyess);
        
        enno = new JRadioButton("No");
        enno.setBounds(450,590,100,30);
        enno.setBackground(Color.BLACK);
        enno.setForeground(Color.WHITE);
        enno.setFocusable(false);
        add(enno);
 
        ButtonGroup eaccount = new ButtonGroup();
        eaccount.add(eyess);
        eaccount.add(enno);
        
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
      
        String sreligion = (String) religion.getSelectedItem(); // getSelectedItem method returns an object so we have typecast it to a string 
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        String seniorcitizen = null; //to check which radiobutton is selected
        if(yess.isSelected()){
            seniorcitizen = "Yes";
        } else if(nno.isSelected()){
            seniorcitizen = "No";
        }
        
       
        String existingaccount = null;
        if(eyess.isSelected()){
           existingaccount = "Yes";
        } else if(enno.isSelected()){
           existingaccount = "No";
        } 
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
           
               Conn c = new Conn();
               String query = "insert into signuptwo values('"+formno+"' , '"+sreligion+"' , '"+scategory+"' , '"+sincome+"' , '"+seducation+"' ,'"+soccupation+"' , '"+span+"' , '"+saadhar+"' , '"+seniorcitizen+"' , '"+existingaccount+"')";
               c.s.executeUpdate(query);
           
               //signupThree object
               setVisible(false);
               new SignupThree(formno).setVisible(true);
        } catch(Exception e){
           System.out.println(e);
        }
    }
    
    public static void main(String args[]){
    
        new SignupTwo("");
    }
    
}
