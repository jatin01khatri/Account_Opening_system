
package saraswat.bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener {
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;
    
    Withdrawl(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("saraswat/bank/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(650,650,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0,0,650,650);
         add(image);
        
        JLabel text=new JLabel("Enter the amount you want to withdraw");
         text.setBounds(135,210,700,35);
         text.setForeground(Color.WHITE);
         image.add(text);
         
         amount=new JTextField();
         amount.setFont(new Font("Raleway",Font.BOLD,20));
         amount.setBounds(135,250,220,25);
         image.add(amount);
         
         withdraw=new JButton("withdraw");
         withdraw.setBounds(260, 374, 100, 20);
         withdraw.addActionListener(this);
         image.add(withdraw);
         
         back=new JButton("Back");
         back.setBounds(120, 374, 100, 20);
         back.addActionListener(this);
         image.add(back);
         
         
        
        setSize(650,650);
        setLocation(300,30);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdraw){
            String number=amount.getText();
            Date date=new Date();
            
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
            }else{
                try{
                Conn conn=new Conn();
                String query="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+" Withdrawn Successfully");
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
        new Withdrawl("");
    }
}
