
package saraswat.bank;
import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            c =DriverManager.getConnection("jdbc:mysql:///saraswatbank","root","jatin9818452732#");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
