
package saraswat.bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
    JTextField amount;
    JButton Deposit,back;
    String pinnumber;
    
    Deposit(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("saraswat/bank/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(650,650,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0,0,650,650);
         add(image);
        
        JLabel text=new JLabel("Enter the amount you want to deposit");
         text.setBounds(135,210,700,35);
         text.setForeground(Color.WHITE);
         image.add(text);
         
         amount=new JTextField();
         amount.setFont(new Font("Raleway",Font.BOLD,20));
         amount.setBounds(135,250,220,25);
         image.add(amount);
         
         Deposit=new JButton("Deposit");
         Deposit.setBounds(260, 374, 100, 20);
         Deposit.addActionListener(this);
         image.add(Deposit);
         
         back=new JButton("Back");
         back.setBounds(120, 374, 100, 20);
         back.addActionListener(this);
         image.add(back);
         
         
        
        setSize(650,650);
        setLocation(300,30);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Deposit){
            String number=amount.getText();
            Date date=new Date();
            
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
            }else{
                try{
                Conn conn=new Conn();
                String query="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+ " Deposited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
            }
            
        }else if(ae.getSource()== back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Deposit("");
    }
}
