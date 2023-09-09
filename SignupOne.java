
package saraswat.bank;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fnameTextField,temail,add,citytextfield,statetextfield,pintextfield;
    JRadioButton male,female,other,married,unmarried,gother;
    JDateChooser DateChooser;
    JButton next,back;
    
    
    SignupOne(){
        setLayout(null);
        Random ran=new Random();
        random=Math.abs(ran.nextLong()%9000L+1000L);
        
        
        JLabel formno=new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,26));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details ");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,18));
        personalDetails.setBounds(210,70,400,30);
        add(personalDetails);
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,14));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(250,140,300,30);
        add(nameTextField);
        
        JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,14));
        fname.setBounds(100,180,400,30);
        add(fname);
        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(250,180,300,30);
        add(fnameTextField);
        
        JLabel dob=new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,14));
        dob.setBounds(100,220,400,30);
        add(dob);
        
        DateChooser=new JDateChooser();
        DateChooser.setBounds(250,220,300,30);
        DateChooser.setForeground(new Color(105,105,105));
        add(DateChooser);
        
        
        JLabel email=new JLabel("E-mail:");
        email.setFont(new Font("Raleway",Font.BOLD,14));
        email.setBounds(100,300,400,30);
        add(email);
        
        temail=new JTextField();
        temail.setFont(new Font("Raleway",Font.BOLD,14));
        temail.setBounds(250,300,300,30);
        add(temail);
        
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,14));
        gender.setBounds(100,340,400,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(250,340,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(350,340,70,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        gother=new JRadioButton("Other");
        gother.setBounds(450,340,90,30);
        gother.setBackground(Color.WHITE);
        add(gother);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(gother);
        
        
        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,14));
        marital.setBounds(100,260,400,30);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(250,260,70,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(350,260,90,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(450,260,90,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup marriedgroup=new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(unmarried);
        marriedgroup.add(other);
        
        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,14));
        address.setBounds(100,380,400,30);
        add(address);
        
        add=new JTextField();
        add.setFont(new Font("Raleway",Font.BOLD,14));
        add.setBounds(250,380,300,30);
        add(add);
        
        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,14));
        city.setBounds(100,420,400,30);
        add(city);
        
        citytextfield=new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
        citytextfield.setBounds(250,420,300,30);
        add(citytextfield);
        
        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,14));
        state.setBounds(100,460,400,30);
        add(state);
        
        statetextfield=new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        statetextfield.setBounds(250,460,300,30);
        add(statetextfield);
        
        JLabel pincode=new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,14));
        pincode.setBounds(100,500,400,30);
        add(pincode);
        
        pintextfield=new JTextField();
        pintextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pintextfield.setBounds(250,500,300,30);
        add(pintextfield);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(470, 550, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBounds(250, 550, 80, 30);
        back.addActionListener(this);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(650,650);
        setVisible(true);
        setLocation(300,30);
    }
    
     public void actionPerformed(ActionEvent ae){
         String formno=""+ random;
         String name=nameTextField.getText();
         String fname=fnameTextField.getText();
         String dob=((JTextField) DateChooser.getDateEditor().getUiComponent()).getText();
         String gender =null;
         if(male.isSelected()){
             gender="Male";
         }
         else if(female.isSelected()){
             gender="female";
         }
         
         String Email=temail.getText();
         String marital=null;
         if(married.isSelected()){
             marital="Married";
         }
         else if(unmarried.isSelected()){
             marital="Unmarried";
         }
         else if(other.isSelected()){
             marital="other";
         }
             
         
         
         
         
         String address=add.getText();
         String city=citytextfield.getText();
         String state=statetextfield.getText();
         String pin=pintextfield.getText();
         
         
         try{
             if(name.equals("")){
                 JOptionPane.showMessageDialog(null,"Name is Required");
             }
             
             
             else{
                Conn c=new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+Email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
                
               
             }
             
              if(ae.getSource()==back){
                  setVisible(false);
                  new Login().setVisible(true);
                     }   
              else if(ae.getSource()==next){
                  setVisible(false);
                  new SignupTwo(formno).setVisible(true);
                    }    
             
             
         }catch(Exception e){
            System.out.println(e);
            
         }
         
        
         
     }
     
    public static void main(String[] args){
        new SignupOne();
    }
}
