
package saraswat.bank;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno=formno;
        setLayout(null);
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(210, 40, 400, 40);
        add(l1);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,20));
        type.setBounds(100, 100, 200, 30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,12));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 150, 120, 20);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,12));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 150, 170, 20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,12));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 180, 120, 20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,12));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 180, 200, 20);
        add(r4);
        
        ButtonGroup groupaccount= new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,18));
        card.setBounds(100, 220, 200, 30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,18));
        number.setBounds(330, 220, 300, 30);
        add(number);
        
        JLabel carddetails=new JLabel("Your 16 digit Card Number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100, 240, 300, 30);
        add(carddetails);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,18));
        pin.setBounds(100, 280, 200, 30);
        add(pin);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,18));
        pnumber.setBounds(330, 280, 300, 30);
        add(pnumber);
        
        JLabel pindetails=new JLabel("Your 4 digit Password");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100, 300, 300, 30);
        add(pindetails);
        
        JLabel services=new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,18));
        services.setBounds(100, 340, 400, 30);
        add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,12));
        c1.setBounds(100,380,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,12));
        c2.setBounds(350,380,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,12));
        c3.setBounds(100,420,200,30);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,12));
        c4.setBounds(350,420,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,12));
        c5.setBounds(100,460,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,12));
        c6.setBounds(350,460,200,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,10));
        c7.setBounds(80,520,500,30);
        add(c7);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(160,560,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(380,560,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(650,650);
        setVisible(true);
        setLocation(300,30);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            
            String accountType="";
            
            if(r1.isSelected()){
                accountType="Saving Account";
            }else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType="Current Account";
            }else if(r4.isSelected()){
                accountType="Recurring Deposit Account";
            }
            Random random=new Random();
            
            String cardnumber=""+Math.abs((random.nextLong()%90000000L)+504936000000000L);
            String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
            String facility="";
            
            if(c1.isSelected()){
                facility=facility+"ATM CARD";
            }else if(c2.isSelected()){
                facility=facility+"Internet Banking";
            }else if(c3.isSelected()){
                facility=facility+"Mobile Banking";
            }else if(c4.isSelected()){
                facility=facility+"EMAIL & SMS Alerts";
            }else if(c5.isSelected()){
                facility=facility+"Cheque Book";
            }else if(c6.isSelected()){
                facility=facility+"E-Statement";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account type is Required");
                }
                else{
                    Conn conn=new Conn();
                    String query1="insert into SignupThree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                   
                    conn.s.executeUpdate(query1);
                    
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null,"cardnumber: "+cardnumber+"\n pin: "+pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }
}
