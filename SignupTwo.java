
package saraswat.bank;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField pantextfield,aadhartextfield;
    JRadioButton Yes,No,Yes1,No1;
    JButton next,back;
    JComboBox religion,category,income,val,occ;
    String formno;
    
    SignupTwo(String formno){
        setLayout(null);
        this.formno=formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel AdditionalDetails=new JLabel("Page 2: Additional Details ");
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,18));
        AdditionalDetails.setBounds(210,70,400,30);
        add(AdditionalDetails);
        
        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,14));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(250,140,300,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,14));
        fname.setBounds(100,180,400,30);
        add(fname);
        
        String valcategory[]={"General","OBC","SC","ST","other"};
        category=new JComboBox(valcategory);
        category.setBounds(250,180,300,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        
        JLabel dob=new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,14));
        dob.setBounds(100,220,400,30);
        add(dob);
        
        String incomecategory[]={"NULL","<1,50,000","<2,50,000","<5,00,000","<7,50,000","upto 10 lacs"};
        income=new JComboBox(incomecategory);
        income.setBounds(250,220,300,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel email=new JLabel("Education:");
        email.setFont(new Font("Raleway",Font.BOLD,14));
        email.setBounds(100,300,400,30);
        add(email);
        
        String eduval[]={"Non-graduate","Graduate","post-graduate","doctrate","others"};
        val=new JComboBox(eduval);
        val.setBounds(250,300,300,30);
        val.setBackground(Color.WHITE);
        add(val);
      
        
        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,14));
        marital.setBounds(100,260,400,30);
        add(marital);
        
        String occvalues[]={"Salaried","Self-employed","Business","Student","Retired","others"};
        occ=new JComboBox(occvalues);
        occ.setBounds(250,260,300,30);
        occ.setBackground(Color.WHITE);
        add(occ);
        
       
        JLabel pan=new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(100,340,400,30);
        add(pan);
        
        pantextfield=new JTextField();
        pantextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pantextfield.setBounds(250,340,300,30);
        add(pantextfield);
        
        JLabel aadhar=new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(100,380,400,30);
        add(aadhar);
        
        aadhartextfield=new JTextField();
        aadhartextfield.setFont(new Font("Raleway",Font.BOLD,14));
        aadhartextfield.setBounds(250,380,300,30);
        add(aadhartextfield);
        
        JLabel senior=new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway",Font.BOLD,14));
        senior.setBounds(100,420,400,30);
        add(senior);
        
        Yes1=new JRadioButton("Yes");
        Yes1.setBounds(250,420,70,30);
        Yes1.setBackground(Color.WHITE);
        add(Yes1);
        
        No1=new JRadioButton("No");
        No1.setBounds(350,420,90,30);
        No1.setBackground(Color.WHITE);
        add(No1);
        
        ButtonGroup marriedgroup1=new ButtonGroup();
        marriedgroup1.add(Yes1);
        marriedgroup1.add(No1);
        
        JLabel pincode=new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,14));
        pincode.setBounds(100,460,400,30);
        add(pincode);
        
        Yes=new JRadioButton("Yes");
        Yes.setBounds(250,460,70,30);
        Yes.setBackground(Color.WHITE);
        add(Yes);
        
        No=new JRadioButton("No");
        No.setBounds(350,460,90,30);
        No.setBackground(Color.WHITE);
        add(No);
        
        ButtonGroup marriedgroup=new ButtonGroup();
        marriedgroup.add(Yes);
        marriedgroup.add(No);
        
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
        back.setBounds(150, 550, 80, 30);
        back.addActionListener(this);
        add(back); 
        
        getContentPane().setBackground(Color.WHITE);
        setSize(650,650);
        setVisible(true);
        setLocation(300,30);
    }
    
     public void actionPerformed(ActionEvent ae){
         
         String sreligion=(String)religion.getSelectedItem();
         String scategory=(String)category.getSelectedItem();
         String sincome=(String)income.getSelectedItem();
         String seducation=(String) val.getSelectedItem();
         String soccupation=(String)occ.getSelectedItem();
         String span=pantextfield.getText();
         String saadhar=aadhartextfield.getText();
         
         
         String senior=null;
         
         
        
        
         if(Yes.isSelected()){
             senior="Yes";
         }
         else if(No.isSelected()){
             senior="No";
         }
         
         
         String existingaccount=null;
         if(Yes.isSelected()){
             existingaccount="Yes";
         }
         else if(No.isSelected()){
             existingaccount="No";
         }
         
         
         
         
        
         
         
         try{ 
                if(span.equals("")){
                 JOptionPane.showMessageDialog(null,"PAN number is Required");
             }
             
             
             else{
                Conn c=new Conn();
                 String query = "insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+senior+"','"+existingaccount+"')";                c.s.executeUpdate(query);
                
               
             }
             
              if(ae.getSource()==back){
                  setVisible(false);
                  new SignupOne().setVisible(true);
                     }   
              else if(ae.getSource()==next){
                  setVisible(false);
                  new SignupThree(formno).setVisible(true);
                    }   
              
         }catch(Exception e){
            System.out.println(e);
            
         }
         
        
         
     }
     
    public static void main(String[] args){
        new SignupTwo("");
    }
}
