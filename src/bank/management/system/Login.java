package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.text.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.BorderFactory;


public class Login extends JFrame implements ActionListener
{
    
    
    //GLOBAL VARIABLES
    JFrame frame;
    JButton login,clear,signUp,reset;
    JTextField cardInput;
    JPasswordField pinInput;
    public Login() 
    {
        frame = new JFrame("SUPER ANY TIME MACINE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //This will make this image as background 
        frame.setContentPane(new ImagePanel(new ImageIcon(getClass().getResource("/icons/itachi2.jpg")).getImage()));
        frame.setLayout(null);
        
        //WELCOME TO NETBEANS
        JLabel label = new JLabel("WELCOME TO NETBEANS");
        label.setFont(new Font("Osward",Font.BOLD,40));
        label.setForeground(new Color(250, 249, 246));//24,30,33
        int CustomY=20;
        myCustom(frame,label,CustomY);
        frame.add(label);
        
        
        //CardNumber
        JLabel cardno=new JLabel("CARD NUMBER :");
        cardno.setFont(new Font("Osward",Font.BOLD,30));
         cardno.setForeground(new Color(250, 249, 246));
        frame.add(cardno);
        int Custom2X=145;
        int Custom2Y=140;
        myCustom2(frame,cardno,Custom2X,Custom2Y);
        //CardInput
        cardInput=new JTextField();
        int Custom2X_cardInput=150;
        int Custom2Y_cardInput=250;
        int Custom2Z_cardInput=10;
        myCustom2_Input(frame,cardInput,Custom2X_cardInput,Custom2Y_cardInput,Custom2Z_cardInput);
        addNumericInputConstraint(cardInput);
        addNumericInputConstraint_message(cardInput);
        addNumericInputConstraint_BOLD(cardInput);
       
        frame.add(cardInput);
        
        //PIN number
        JLabel pinNumber=new JLabel("ENTER YOUR PIN HERE  :");
        pinNumber.setFont(new Font("Osward",Font.BOLD,30));
        pinNumber.setForeground(new Color(250, 249, 246));
        frame.add(pinNumber);
        myCustom3(frame,pinNumber);
        //CardInput
        pinInput=new JPasswordField();
        myCustom3_input(frame,pinInput);
        addNumericInputConstraint(pinInput);
        addNumericInputConstraint_message(pinInput);
        addNumericInputConstraint_BOLD(pinInput);
        frame.add(pinInput);
       
        
        //Login Button
         login=new JButton("LOGIN");
        myCustom4(frame,login,150, 20 ,150, 30);
         login.addActionListener(this);
        frame.add(login);
        
        //Clear Button
        clear=new JButton("CLEAR");
        myCustom5(frame,clear);
        clear.addActionListener(this);
        frame.add(clear);
        
        //SignUP Button
        signUp=new JButton("SIGN UP");
        myCustom6(frame,signUp);
         signUp.addActionListener(this);
        frame.add(signUp);
        
        //RESET Button
        reset=new JButton("RESET");
        myCustom7(frame,reset,50,150,30,0);
        addClearButtonFunctionality(frame,reset,1);
        frame.add(reset);
        
        
        int x=800;
        int y=600;
        frame.setSize(x, y);
        enforceMinimumFrameSize(frame,x,y);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    
    
    
    //myCustom made heading
    public static void myCustom(JFrame frame,JLabel label,int CustomY)
    {
        frame.addComponentListener(new ComponentAdapter(){
             @Override
             public void componentResized(ComponentEvent e)
             {
                 Dimension labelSize=label.getPreferredSize();
                 int labelX=(frame.getWidth()-labelSize.width)/2;
                 label.setBounds(labelX, CustomY, labelSize.width, labelSize.height);       
             }
         });
    }
    
    
    
    
        //myCustom for cardno
        public static void myCustom2(JFrame frame,JLabel cardno,int Custom2X,int Custom2Y)
         {
        frame.addComponentListener(new ComponentAdapter(){
             @Override
             public void componentResized(ComponentEvent e)
             {
                 Dimension labelSize=cardno.getPreferredSize();
                 int labelX=(frame.getWidth()-labelSize.width)/2;
                 cardno.setBounds(labelX-Custom2X, Custom2Y, labelSize.width, labelSize.height);    
             }
         });
      }
         //Mycustom2 for cardInput
        public static void myCustom2_Input(JFrame frame,JTextField cardInput,int Custom2X_cardInput,int Custom2Y_cardInput,int Custom2Z_cardInput)
        {
        frame.addComponentListener(new ComponentAdapter(){
             @Override
             public void componentResized(ComponentEvent e)
             {
                 Dimension labelSize=cardInput.getPreferredSize();
                 int labelX=(frame.getWidth()-labelSize.width)/2;
                 cardInput.setBounds(labelX, Custom2X_cardInput, labelSize.width+Custom2Y_cardInput, labelSize.height+Custom2Z_cardInput);//150 250 10
                 
             }
         });
    }
    
        
        
        
        
        
        
     //MyCustom for pinNumber 
    public static void myCustom3(JFrame frame,JLabel pinNumber)
         {
        frame.addComponentListener(new ComponentAdapter(){
             @Override
             public void componentResized(ComponentEvent e)
             {
                 Dimension labelSize=pinNumber.getPreferredSize();
                 int labelX=(frame.getWidth()-labelSize.width)/2;
                 pinNumber.setBounds(labelX-210, 200, labelSize.width, labelSize.height);    
             }
         });
      }
    //Mycustom for pinInput
    public static void myCustom3_input(JFrame frame,JTextField pinInput)
     {
        frame.addComponentListener(new ComponentAdapter(){
             @Override
             public void componentResized(ComponentEvent e)
             {
                 Dimension labelSize=pinInput.getPreferredSize();
                 int labelX=(frame.getWidth()-labelSize.width)/2;
                 pinInput.setBounds(labelX, 205, labelSize.width+250, labelSize.height+10);
             
                 
                 
             }
         });
      }
    
    
    
    
    //LOGIN BUTTON Custom
    public static void myCustom4(JFrame frame, JButton login,int X,int Y,int Z,int Height) 
    {
    frame.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            int frameWidth = frame.getWidth();
            int frameHeight = frame.getHeight();
            int buttonWidth = login.getWidth();
            int buttonHeight = login.getHeight();
            int x = (frameWidth - buttonWidth) / 2;
            int y = (frameHeight - buttonHeight) / 2;
            int xOffset = 0; // Specify the desired horizontal offset from the center
            int yOffset = 10; // Specify the desired vertical offset from the center
            login.setBounds(x + xOffset-X, y + yOffset+Y,Z,Height);//150 20 150 30
            login.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        }
    });
}
      public static void myCustom5(JFrame frame, JButton clear) 
      {
    frame.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            int frameWidth = frame.getWidth();
            int frameHeight = frame.getHeight();
            int buttonWidth = clear.getWidth();
            int buttonHeight = clear.getHeight();
            int x = (frameWidth - buttonWidth) / 2;
            int y = (frameHeight - buttonHeight) / 2;
            int xOffset = 0; // Specify the desired horizontal offset from the center
            int yOffset = 10; // Specify the desired vertical offset from the center
            clear.setBounds(x + xOffset+150, y + yOffset+20,150,30);//-150 20 150 30
            clear.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        }
    });
}
      //SIGNUP BUTTON Custom
      public static void myCustom6(JFrame frame, JButton signUp) 
      {
    frame.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            int frameWidth = frame.getWidth();
            int frameHeight = frame.getHeight();
            int buttonWidth = signUp.getWidth();
            int buttonHeight = signUp.getHeight();
            int x = (frameWidth - buttonWidth) / 2;
            int y = (frameHeight - buttonHeight) / 2;
            int xOffset = 0; // Specify the desired horizontal offset from the center
            int yOffset = 10; // Specify the desired vertical offset from the center
            signUp.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
            signUp.setBounds(x + xOffset, y + yOffset-10,150,30);
        }
    });
}
      //RESET BUTTON custom
       public static void myCustom7(JFrame frame, JButton reset,int X,int Y, int Z,int side)
       {
    frame.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            int frameWidth = frame.getWidth();
            int frameHeight = frame.getHeight();
            int buttonWidth = reset.getWidth();
            int buttonHeight = reset.getHeight();
            int x = (frameWidth - buttonWidth) / 2;
            int y = (frameHeight - buttonHeight) / 2;
            int xOffset = 0; // Specify the desired horizontal offset from the center
            int yOffset = 10; // Specify the desired vertical offset from the center
            reset.setBounds(x + xOffset-side, y + yOffset+X,Y,Z);
            reset.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        }
    });
}
    
    
      
      
      //ADDED Constraints to add only numbers
      public static void addNumericInputConstraint(JTextField textField)
      {
    ((PlainDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            if (text.matches("\\d+")) {
                super.insertString(fb, offset, text, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text.matches("\\d+")) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    });
}
      //GIVE MESSAGE TO TYPE ONLY NUMBER
        public static void addNumericInputConstraint_message(JTextField textField) 
        {
    ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            if (text.matches("\\d+")) {
                super.insertString(fb, offset, text, attr);
            } else {
                showErrorMessage();
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text.matches("\\d+")) {
                super.replace(fb, offset, length, text, attrs);
            } else {
                showErrorMessage();
            }
        }

        private void showErrorMessage() {
            JOptionPane.showMessageDialog(null, "Please type Numeric value");
        }
    });
}
        //MAKE NUMERS BOLD
        public static void addNumericInputConstraint_BOLD(JTextField textField) 
        {
    Font originalFont = textField.getFont();
    Font boldFont = new Font(originalFont.getFontName(), Font.BOLD, originalFont.getSize());

    textField.getDocument().addDocumentListener(new DocumentListener() {
        private void setBoldFont() {
            SwingUtilities.invokeLater(() -> {
                String text = textField.getText();
                Font font = text.matches("\\d+") ? boldFont : originalFont;
                textField.setFont(font);
            });
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            setBoldFont();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            setBoldFont();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // Not used for plain text documents
        }
    });
}
        //Make screen refresh/reset/clear
        public static void addClearButtonFunctionality(JFrame frame, JButton clear,int X) 
        {
    clear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose(); // Close the current frame
            if(X==1)
            {
                new Login();
            }
            else if(X==2)
            {
                new SignUpOne();
            }
        }
    });
}
        //User can not minimize my screen less then 800 by 600
       public static void enforceMinimumFrameSize(JFrame frame, int minWidth, int minHeight)
       {
    frame.setMinimumSize(new Dimension(minWidth, minHeight));
}





        










        


      
      
     
      
      
    // Custom JPanel class to draw the background image
    static class ImagePanel extends JPanel 
    {
        private final Image backgroundImage;

        public ImagePanel(Image image) {
            backgroundImage = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==login)
        {
            
        }
        else if(ae.getSource()==signUp)
        {
            frame.setVisible(false);
            
            new SignUpOne().setVisible(true);
        }
        else if(ae.getSource()==clear)
        {
            DocumentFilter documentFilter = ((AbstractDocument) cardInput.getDocument()).getDocumentFilter();
        ((AbstractDocument) cardInput.getDocument()).setDocumentFilter(null);
        cardInput.setText("");
        ((AbstractDocument) cardInput.getDocument()).setDocumentFilter(documentFilter);

        documentFilter = ((AbstractDocument) pinInput.getDocument()).getDocumentFilter();
        ((AbstractDocument) pinInput.getDocument()).setDocumentFilter(null);
        pinInput.setText("");
        cardInput.setText("");
        ((AbstractDocument) pinInput.getDocument()).setDocumentFilter(documentFilter);
        }
            
        
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}
