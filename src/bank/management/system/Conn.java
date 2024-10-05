
package bank.management.system;

import java.sql.*;

public class Conn {
 
    //Creating a connection
    Connection c;
    //Creating a statement
    Statement s;
    
     
    //We have to handle the exception as mysql is an enternal entity so there will be runtime errors
    
    public Conn(){
    
        try {
        
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Lucky05MySQL");
            s = c.createStatement();
            
        } catch(Exception e){
            
            System.out.println(e);
        }
    }
    
}
