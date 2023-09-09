
package saraswat.bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceenquiry,exit;
    String pinnumber;
     FastCash(String pinnumber){
         
         this.pinnumber=pinnumber;
         
         
         setLayout(null);
         
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("saraswat/bank/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(650,650,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0,0,650,650);
         add(image);
         
         JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
         text.setBounds(155,210,700,35);
         text.setForeground(Color.WHITE);
         image.add(text);
         
         deposit=new JButton("Rs 100");
         deposit.setBounds(120, 302, 100, 20);
         deposit.addActionListener(this);
         image.add(deposit);
         
         withdrawl=new JButton("Rs 500");
         withdrawl.setBounds(230, 302, 130, 20);
         withdrawl.addActionListener(this);
         image.add(withdrawl);
         
         fastcash=new JButton("Rs 1000");
         fastcash.setBounds(120, 326, 100, 20);
         fastcash.addActionListener(this);
         image.add(fastcash);
         
         ministatement=new JButton("Rs 2000");
         ministatement.setBounds(230, 326, 130, 20);
         ministatement.addActionListener(this);
         image.add(ministatement);
         
         pinchange=new JButton("Rs 5000");
         pinchange.setBounds(120, 350, 100, 20);
         pinchange.addActionListener(this);
         image.add(pinchange);
         
         balanceenquiry=new JButton("Rs 10000");
         balanceenquiry.setBounds(230, 350, 130, 20);
         balanceenquiry.addActionListener(this);
         image.add(balanceenquiry);
         
         exit=new JButton("BACK");
         exit.setBounds(230, 374, 130, 20);
         exit.addActionListener(this);
         image.add(exit);
         
        setSize(650,650);
        setLocation(300,30);
        setUndecorated(true);
        setVisible(true);
    }
     
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==exit){
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
         }else {
            String amount=((JButton)ae.getSource()).getText().substring(3);
            Conn c=new Conn();
            try{
                ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(ae.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                Date date=new Date();
                String query="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+" Debited successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
         }
     }
    public static void main(String args[]){
        new FastCash("");
       
    }
}
