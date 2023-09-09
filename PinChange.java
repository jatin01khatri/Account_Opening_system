
package saraswat.bank;

import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener{
    
    JButton back,change;
    JPasswordField pin,repin;
    String pinnumber;
    
    PinChange(String pinnumber){
        setLayout(null);
        this.pinnumber=pinnumber;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("saraswat/bank/atm.jpg"));
         Image i2=i1.getImage().getScaledInstance(650,650,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(0,0,650,650);
         add(image);
         
         JLabel text=new JLabel("Change your Pin");
         text.setForeground(Color.WHITE);
         text.setFont(new Font("System",Font.BOLD,16));
         text.setBounds(170,210,700,35);
         image.add(text);
         
         
         
         
         JLabel pintext=new JLabel("New PIN: ");
         pintext.setForeground(Color.WHITE);
         pintext.setFont(new Font("System",Font.BOLD,14));
         pintext.setBounds(115,250,180,35);
         image.add(pintext);
         
         pin=new JPasswordField();
         pin.setFont(new Font("Raleway",Font.BOLD,25));
         pin.setBounds(250,260,120,20);
         image.add(pin);
         
         JLabel repintext=new JLabel("Re-Enter New PIN: ");
         repintext.setForeground(Color.WHITE);
         repintext.setFont(new Font("System",Font.BOLD,14));
         repintext.setBounds(115,290,180,35);
         image.add(repintext);
         
         repin=new JPasswordField();
         repin.setFont(new Font("Raleway",Font.BOLD,25));
         repin.setBounds(250,295,120,20);
         image.add(repin);
         
         back=new JButton("Back");
         back.setBounds(120, 364, 100, 25);
         back.addActionListener(this);
         image.add(back);
         
         change=new JButton("Change");
         change.setBounds(265, 364, 100, 25);
         change.addActionListener(this);
         image.add(change);
         
         
        setSize(650,650);
        setLocation(300,30);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
        try{
            String npin=pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            if(npin.equals("")){
                 JOptionPane.showMessageDialog(null, "Please enter new PIN: ");
                 return;
            }
            
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please re-enter PIN: ");
                 return;
            }
            
            Conn conn=new Conn();
            String query1="update bank set pin='"+rpin+"' where pin='"+pinnumber+"'";
            String query2="update login set pin='"+rpin+"' where pin='"+pinnumber+"'";
            String query3="update SignupThree set pin='"+rpin+"' where pin='"+pinnumber+"'";
            
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null,"PIN changed successfully");
            setVisible(false);
            new Transactions(rpin).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
        }
        else{
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                }
    }
    
    public static void main(String args[]){
        new PinChange("").setVisible(true);
    }
    
}
