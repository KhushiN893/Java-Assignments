import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class LoginFrame extends JFrame implements ActionListener {
 
    Container container=getContentPane();
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
 
 
    LoginFrame()
    {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
 
    }
   public void setLayoutManager()
   {
       container.setLayout(null);
   }
   public void setLocationAndSize()

   {
       //Setting location and Size of each components using setBounds() method.
       Color cc1=new Color(157,240,132);
       userLabel.setBounds(50,150,100,30);
       userLabel.setForeground(Color.WHITE);
       passwordLabel.setBounds(50,220,100,30);
        passwordLabel.setForeground(Color.WHITE);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       loginButton.setBounds(150,300,100,30);
         loginButton.setBackground(cc1);
        getContentPane().setBackground(Color.BLACK);        
      loginButton.addActionListener(this);
 
 
   }
   public void addComponentsToContainer()
   {
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(loginButton);
    }

    public void actionPerformed(ActionEvent e) {
        String username =  userTextField.getText();
        String password = new String(passwordField.getPassword());
if(username.equals("khushi")&&password.equals("123")){
        JOptionPane.showMessageDialog(this,username +"'s Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    else{
        JOptionPane.showMessageDialog(this,"Invalid Details", "Failed", JOptionPane.INFORMATION_MESSAGE);
 
    }
 
}
}
public class LoginForm {
    public static void main(String[] a){
        LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
 
    }
 
}


        //    int i = 0, j = 0;
        //    int temp=0;  
        //     while (i < n && j < n) {
        //         System.out.print(marr[i][j] + " ");
        //         if (temp==1) {
        //             if (i == 0 || j == n-1) {
        //                 temp=0;
        //                 if (j == n-1) {
        //                     i++;
        //                 } else {
        //                     j++;
        //                 }
        //             } else {
        //                 i--;
        //                 j++;
        //             }
        //         } else {
        //             if (j == 0 || i == n-1) {
        //                 temp=0;
        //                 if (i == n-1) {
        //                     j++;
        //                 } else {
        //                     i++;
        //                 }
        //             } else {
        //                 i++;
        //                 j--;
        //             }
        //         }
        //     }
        //     System.out.println();
