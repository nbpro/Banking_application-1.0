import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginPage extends JFrame implements ActionListener{

	      JLabel username;
          JLabel password;                  
          JTextField usernametxt;
          JPasswordField passwordtxt;
          String name="admin";
		  String pass="admin1";
          
                    
  private JButton login;
          
           
              
  public LoginPage()
          {
	       super("Welcome to ABS Bank....LOGIN PAGE FOR ACCOUNTANT ONLY");
	          
	  		        	  
  			setVisible(true);
  			setLayout(new FlowLayout());
  			
  			username=new JLabel("Enter Username");
  			password=new JLabel("Enter Password");
  			
  			usernametxt=new JTextField("",20);
  			passwordtxt=new JPasswordField("",20);
  			
  			add(username);
  			add(usernametxt);
  			add(password);
  			add(passwordtxt);
  			login=new JButton("Login");
  			add(login);
  			
  			login.addActionListener(this);
  			setSize(800,600);
  			setVisible(true);
  			setResizable(false);
          }
  			public void actionPerformed(ActionEvent ob)
  			{
  				if(ob.getSource()==login)
  				{
  				
				String a=usernametxt.getText();
  				String b=(String)passwordtxt.getText();
  			 
  				 if((a.equals(name)&&(b.equals(pass))))
  				 {
  					new AccountantMain();
  	  				
  				 }
  				 else
  				 {
  					 JDialog diag=new JDialog();
 					 diag.setVisible(true);
 					 diag.setSize(270, 300);
 					 diag.setResizable(false);
 					 diag.add(new JLabel("USERNAME & PASSWORD ARE NOT MATCHED"));
  			     }
  				}
  			}

  			public static void main(String args[])
  			{
  				new LoginPage();
  			}
  			}
  			
  			
  			
          
  		
	