import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.regex.*;

	public class LoginPageC extends JFrame{

		      JLabel username;
	          JLabel password;                  
	          JTextField usernametxt;
	          JPasswordField passwordtxt;
	  private JButton login;
	  //public static String usernamearr [ ];
	  
	     public LoginPageC()
	          {
		       super("Welcome to ABS Bank.... LOGIN PAGE FOR CUSTOMER ONLY");
		       
	            //usernamearr = new String[1];      
	                   	  
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
	  			
	  			//login.addActionListener(this);
	  			setSize(800,600);
	  			setVisible(true);
	  			setResizable(false);
	          }
	  			/*public void actionPerformed(ActionEvent ob)
	  			{
	  				if(ob.getSource()==login)
	  				{
	  				int i;
					String a=usernametxt.getText();
	  				String b=(String)passwordtxt.getText();
	  				
	  				String pattern="^D\\D\\D\\D\\D\\D\\D\\D*";
	  				String matched = null;
	  				for(i=0;i<a;i++)
	  				{
	  				matched=a.findInLine(pattern);*/
	  				//if(matched==null)
	  					
	  					//else
	  						//System.out.println(arr[i]+" is valid");
	  				//}
	  			//}
	
	  			public static void main(String args[])
	  			{
	  				
	  				new LoginPageC();
	  			}
	  			}
	  				  			
		
	          
	  			
		