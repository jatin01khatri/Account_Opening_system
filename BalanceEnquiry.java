
package saraswat.bank;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        setLayout(null);
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("saraswat/bank/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(650,650,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0,0,650,650);
         add(image);
         
         back=new JButton("Back");
         back.setBounds(120, 364, 100, 25);
         back.addActionListener(this);
         image.add(back);
         
         Conn c=new Conn();
         int balance=0;
            try{
                ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                }catch(Exception e){
                        System.out.println(e);
                        }
            
            JLabel text=new JLabel("Your current Account balance is Rs "+balance);
            text.setForeground(Color.WHITE);
            text.setBounds(120,210,700,35);
            image.add(text);
         
         
        setSize(650,650);
        setLocation(300,30);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
    
    public static void main(String arg[]){
        new BalanceEnquiry("");
    }
}
