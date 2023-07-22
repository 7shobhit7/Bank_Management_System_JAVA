package bank.management.system;


import static bank.management.system.Login.enforceMinimumFrameSize;
import static bank.management.system.Login.myCustom;
import static bank.management.system.Login.myCustom2;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;

import javax.swing.SwingUtilities;

import com.toedter.calendar.JDateChooser;





public class SignUpOne {
    
    JLabel formNumber,personalDetails,Name,FName,DOB,Gender,EAddress,MStatus,Address,City,State,Pin;
    JTextField  EAddress_Input,Name_Input,FName_Input,Address_Input,CAddress_Input,State_Input,Pin_Input;
    JDateChooser DOB_Chooser;
    JRadioButton Male,Female,Married,UnMarried,Other;
    ButtonGroup buttonGroup,M_status;
    SignUpOne()
    {
        
        
        
        
        
        
        
        
        
        
        
        JFrame frame = new JFrame("SUPER ANY TIME MACINE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Login.ImagePanel(new ImageIcon(getClass().getResource("/icons/meramann.png")).getImage()));
        frame.setLayout(null);
        frame.setSize(700, 850);
       enforceMinimumFrameSize(frame,700,850);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
        
        
        //HEADING APPLICATION FORM
        Random randomNumber=new Random();
        long rand=Math.abs((randomNumber.nextLong()%9000L)+1000L);
        formNumber=new JLabel("APPLICATION FORM : "+rand);
        formNumber.setFont(new Font("Osward",Font.BOLD,40));
        formNumber.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom(frame,formNumber,20);
        frame.add(formNumber);
        frame.setResizable(true);
        
        
        //Personal details
        personalDetails=new JLabel("PAGE 1: PERSONAL DETAILS");
        personalDetails.setFont(new Font("Osward",Font.BOLD,30));
        personalDetails.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,personalDetails,0,80);
        frame.add(personalDetails);
        
        
        //NAME
        Name=new JLabel("NAME :");
        Name.setFont(new Font("Osward",Font.BOLD,20));
        Name.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,Name,120,150);
        frame.add(Name);
        //NAME INPUT
        Name_Input=new JTextField();
        myCustom2_Input(frame,Name_Input,145,250,30);
        Name_Input.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        frame.add(Name_Input);
       
        


        //FATHER NAME
        FName=new JLabel("FATHER's NAME :");
        FName.setFont(new Font("Osward",Font.BOLD,20));
        FName.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,FName,170,210);
         frame.add(FName);
         //FATHER NAME
         FName_Input=new JTextField();
        myCustom2_Input(frame,FName_Input,205,250,30);
        FName_Input.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        frame.add(FName_Input);
        
        
         //DOB 
        DOB=new JLabel("DATE OF YEAR  :");
        DOB.setFont(new Font("Osward",Font.BOLD,20));
        DOB.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,DOB,170,270);
        frame.add(DOB);
        //DOB Chooser
        DOB_Chooser=new JDateChooser();
        myCustom3_DOB(frame,DOB_Chooser,265,250,30);
        frame.setForeground(new Color(105,105,105));
        DOB_Chooser.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        frame.add(DOB_Chooser);
        
        
        
    
        
         //Gender
        Gender=new JLabel("GENDER :");
        Gender.setFont(new Font("Osward",Font.BOLD,20));
        Gender.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,Gender,135,330);
        frame.add(Gender);
        
        
        
        //RADIO BUTTON
        Male =new JRadioButton("MALE");
        myCustom4_Radio(frame,Male,335,20,20,35);
        frame.add(Male);
        Female =new JRadioButton();
        myCustom4_Radio(frame,Female,335,20,20,120);
        frame.add(Female);
        buttonGroup=new ButtonGroup();
        buttonGroup.add(Male);
        buttonGroup.add(Female);
        

    
        




        
        
        
         //EMAIL ADDRESS
        EAddress=new JLabel("EMAIL ADDRESS :");
        EAddress.setFont(new Font("Osward",Font.BOLD,20));
        EAddress.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,EAddress,180,390);
        frame.add(EAddress);
        //EMAIL INPUT
        EAddress_Input=new JTextField();
        myCustom2_Input(frame,EAddress_Input,385,250,30);
        EAddress_Input.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        frame.add(EAddress_Input);
       
        
        
         //MARITAL STATUS
        MStatus=new JLabel("MARITAL STATUS :");
        MStatus.setFont(new Font("Osward",Font.BOLD,20));
        MStatus.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,MStatus,180,450);
        frame.add(MStatus);
        //RardioButton for M_status
        Married =new JRadioButton();
        myCustom4_Radio(frame,Married,455,20,20,30);
        frame.add(Married);
        UnMarried =new JRadioButton();
        myCustom4_Radio(frame,UnMarried,455,20,20,120);
        frame.add(UnMarried);
        Other =new JRadioButton();
        myCustom4_Radio(frame,Other,455,20,20,210);
        frame.add(Other);
        M_status=new ButtonGroup();
        M_status.add(Married);
        M_status.add(UnMarried);
        M_status.add(Other);
        
        
         //ADDRESS
        Address=new JLabel("ADDRESS :");
        Address.setFont(new Font("Osward",Font.BOLD,20));
        Address.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,Address,180,510);
        frame.add(Address);
        //ADDRESS INPUT
        Address_Input=new JTextField();
        myCustom2_Input(frame,Address_Input,505,250,30);
        Address_Input.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        frame.add(Address_Input);
        
        
        //CITY
        City=new JLabel("CITY :");
        City.setFont(new Font("Osward",Font.BOLD,20));
        City.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,City,180,570);
        frame.add(City);
        //CITY ADDRESS
        CAddress_Input=new JTextField();
        myCustom2_Input(frame,CAddress_Input,565,250,30);
        CAddress_Input.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        frame.add(CAddress_Input);
        
        //STATE
        State=new JLabel("STATE :");
        State.setFont(new Font("Osward",Font.BOLD,20));
        State.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,State,180,630);
        frame.add(State);
        //STATE INPUT
        State_Input=new JTextField();
        myCustom2_Input(frame,State_Input,625,250,30);
        State_Input.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        frame.add(State_Input);
        
        //PIN CODE
        Pin=new JLabel("PIN :");
        Pin.setFont(new Font("Osward",Font.BOLD,20));
        Pin.setForeground(new Color(250, 249, 246));//24,30,33
        myCustom2(frame,Pin,180,690);
        frame.add(Pin);
        //PinINput
        Pin_Input=new JTextField();
        myCustom2_Input(frame,Pin_Input,685,250,30);
        Pin_Input.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        frame.add(Pin_Input);
    }
    
    
    
    
    
    
    
    
     
     
     
    


     //CUSTOM INPUT
      public static void  myCustom2_Input(JFrame frame,JTextField Field,int CustomX,int CustomY,int CustomZ)
    {
        frame.addComponentListener(new ComponentAdapter(){
             @Override
             public void componentResized(ComponentEvent e)
             {
                 Dimension labelSize=Field.getPreferredSize();
                 int labelX=(frame.getWidth()-labelSize.width)/2;
                 Field.setBounds(labelX, CustomX, CustomY, CustomZ);   
             }
         });
    }
      //CUSTOM DOB
    public static void  myCustom3_DOB(JFrame frame,JDateChooser Field,int CustomX,int CustomY,int CustomZ)
    {
        frame.addComponentListener(new ComponentAdapter(){
             @Override
             public void componentResized(ComponentEvent e)
             {
                 Dimension labelSize=Field.getPreferredSize();
                 int labelX=(frame.getWidth()-labelSize.width)/2;
                 Field.setBounds(labelX+35, CustomX, CustomY, CustomZ);   
              
             }
         });
    }
  


    //RADIO BUTTON
public static void myCustom4_Radio(JFrame frame, JRadioButton radioButton, int CustomX, int CustomY, int CustomZ, int x) {
    int radius_size=10;
       radioButton.setOpaque(false); // Set the radio button background to transparent
    radioButton.setBorderPainted(false); // Hide the border

    frame.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            int size = radius_size * 2;
            radioButton.setBounds((frame.getWidth() - size) / 2 + x, CustomX, size, size);
        }
    });
}






//Custom Border for InputText


 



     
    
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(SignUpOne::new);
    }
}
