
package saraswat.bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceenquiry,exit;
    String pinnumber;
     Transactions(String pinnumber){
         
         this.pinnumber=pinnumber;
         
         
         setLayout(null);
         
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("saraswat/bank/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(650,650,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0,0,650,650);
         add(image);
         
         JLabel text=new JLabel("Please select your Transaction");
         text.setBounds(155,210,700,35);
         text.setForeground(Color.WHITE);
         image.add(text);
         
         deposit=new JButton("Deposit");
         deposit.setBounds(120, 302, 100, 20);
         deposit.addActionListener(this);
         image.add(deposit);
         
         withdrawl=new JButton("Cash Withdrawl");
         withdrawl.setBounds(230, 302, 130, 20);
         withdrawl.addActionListener(this);
         image.add(withdrawl);
         
         fastcash=new JButton("Fast Cash");
         fastcash.setBounds(120, 326, 100, 20);
         fastcash.addActionListener(this);
         image.add(fastcash);
         
         ministatement=new JButton("Mini Statement");
         ministatement.setBounds(230, 326, 130, 20);
         ministatement.addActionListener(this);
         image.add(ministatement);
         
         pinchange=new JButton("PinChange");
         pinchange.setBounds(120, 350, 100, 20);
         pinchange.addActionListener(this);
         image.add(pinchange);
         
         balanceenquiry=new JButton("Balance Enquiry");
         balanceenquiry.setBounds(230, 350, 130, 20);
         balanceenquiry.addActionListener(this);
         image.add(balanceenquiry);
         
         exit=new JButton("Exit");
         exit.setBounds(120, 374, 100, 20);
         exit.addActionListener(this);
         image.add(exit);
         
        setSize(650,650);
        setLocation(300,30);
        setUndecorated(true);
        setVisible(true);
    }
     
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==exit){
             System.exit(0);
         }else if(ae.getSource()==deposit){
             setVisible(false);
             new Deposit(pinnumber).setVisible(true);
         }else if(ae.getSource()==withdrawl){
             setVisible(false);
             new Withdrawl(pinnumber).setVisible(true);
         }else if(ae.getSource()==fastcash){
             setVisible(false);
             new FastCash(pinnumber).setVisible(true);
         }else if(ae.getSource()==pinchange){
             setVisible(false);
             new PinChange(pinnumber).setVisible(true);
     }else if(ae.getSource()==balanceenquiry){
             setVisible(false);
             new BalanceEnquiry(pinnumber).setVisible(true);
     }else if(ae.getSource()==ministatement){
             setVisible(false);
             new MiniStatement(pinnumber).setVisible(true);
     }
     }
    public static void main(String args[]){
        new Transactions("");
       
    }
}
