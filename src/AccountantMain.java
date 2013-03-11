import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

class AccountantMain extends JFrame 
	
{
	private		JTabbedPane tabbedPane;
	private		JPanel		panel1;
	private		JPanel		panel2;
	private		JPanel		panel3;
	private		JPanel		panel4;
	private		JPanel		panel5;
	private		JPanel		panel6;
    private     JButton     add;
                
  ArrayList<AccountantMain>list=new ArrayList<AccountantMain>();
   FileInputStream ob;
   ObjectInputStream readob;
   FileOutputStream writefile;
   ObjectOutputStream writeob;  
   	
   public static void main( String args[] ) throws IOException
	{
		// Create an instance of the test application
		AccountantMain mainFrame	= new AccountantMain();
	    mainFrame.Userdetails();
		mainFrame.setVisible( true );
		mainFrame.setResizable(false);
	}
public AccountantMain()
	{
		JPanel topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Creation the tab pages
		Userdetails();
		createPage2();
		//createPage3();

		// Creation a tabbed pane
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab( "Add Customer", panel1 );
		tabbedPane.addTab( "Remove Customer", panel2 );
		tabbedPane.addTab( "Credit To Account", panel3 );
		tabbedPane.addTab("Debit From Account", panel4);
		tabbedPane.addTab("View Details", panel5);
		topPanel.add( tabbedPane, BorderLayout.CENTER );
		setTitle( "Accountant" );
		setSize( 800, 600 );
		setVisible(true);
	}
	  
         
 	
	public void Userdetails()
	{
	    //setVisible(true);	
		
	    panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.setVisible(true);
		
		JLabel label1 = new JLabel( "Name:-" );
		label1.setBounds( 10, 15, 150, 20 );
		panel1.add( label1 );
		
				
		JTextField nametxt = new JTextField();
		nametxt.setBounds( 10, 35, 150, 20 );
		panel1.add( nametxt );
		
		JLabel label2 = new JLabel( "Address:-" );
		label2.setBounds( 10, 55, 150, 20 );
		panel1.add( label2 );
		
		JTextField fieldPass = new JTextField();
		fieldPass.setBounds( 10, 75, 150, 20 );
		panel1.add( fieldPass );
		
		JLabel label3 = new JLabel( "City" );
		label3.setBounds( 10, 95, 150, 20 );
		panel1.add( label3 );

		JTextField fieldPass1 = new JTextField();
		fieldPass1.setBounds( 10, 115, 150, 20 );
		panel1.add( fieldPass1 );
		
		JLabel label4 = new JLabel( "State" );
		label4.setBounds( 10, 135, 150, 20 );
		panel1.add( label4 );

		JTextField fieldPass2 = new JTextField();
		fieldPass2.setBounds( 10, 155, 150, 20 );
		panel1.add( fieldPass2 );
		
		JLabel label5 = new JLabel( "Country" );
		label5.setBounds( 10, 175, 150, 20 );
		panel1.add( label5 );

		JTextField fieldPass3 = new JTextField();
		fieldPass3.setBounds( 10, 195, 150, 20 );
		panel1.add( fieldPass3 );
		
		JLabel label6 = new JLabel( "Username" );
		label6.setBounds( 10, 215, 150, 20 );
		panel1.add( label6 );

		JTextField fieldPass4 = new JTextField();
		fieldPass4.setBounds( 10, 235, 150, 20 );
		panel1.add( fieldPass4 );
		
		JLabel label7 = new JLabel( "Password" );
		label7.setBounds( 10, 255, 150, 20 );
		panel1.add( label7 );

		JTextField fieldPass5 = new JTextField();
		fieldPass5.setBounds( 10, 275, 150, 20 );
		panel1.add( fieldPass5 );
		
		JLabel label8 = new JLabel( "Pin Code:-" );
		label8.setBounds( 10, 295, 150, 20 );
		panel1.add( label8 );

		JTextField fieldPass6 = new JTextField();
		fieldPass6.setBounds( 10, 315, 150, 20 );
		panel1.add( fieldPass6 );
	    
		JLabel label9 = new JLabel( "Contact No:-" );
		label9.setBounds( 10, 335, 150, 20 );
		panel1.add( label9 );

		JTextField fieldPass7 = new JTextField();
		fieldPass7.setBounds( 10, 355, 150, 20 );
		panel1.add( fieldPass7 );
		
		add=new JButton();
		panel1.add(new JButton("Add"),BorderLayout.PAGE_END);
		
		
		final ArrayList<AccountantMain>list=new ArrayList<AccountantMain>();
		add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
                AccountantMain array = new AccountantMain();
                String nametxt = (nametxt.getText());
                String fieldPass = (fieldPass.getText());
                String fieldPass1 = (fieldPass1.getText());
                String fieldPass2 = (fieldPass2.getText());
                list.add(array);
            }
		});
		
		
		/*try{
			  ob=new FileInputStream ("Customers.txt");
			  readob=new ObjectInputStream(ob);
			  list=(ArrayList<AccountantMain>) readob.readObject();
			}catch(Exception e){
				e.printStackTrace();
				
			}
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	public void actionPerformed(ActionEvent ob)
	{
		if(ob.getSource()==add)
		{
			String a=(nametxt.getText());
			String b=(fieldPass.getText());
		}
	}*/
	}
	
	
	public void createPage2()
	{
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		setVisible(true);
		
		JLabel usr = new JLabel( "Enter the Account no.:-" );
		usr.setBounds( 10, 15, 150, 20 );
		panel2.add( usr );
		
				
		JTextField usrtxt = new JTextField();
		usrtxt.setBounds( 10, 35, 150, 20 );
		panel2.add( usrtxt );
		
		
	}

	public void createPage3()
	{
		panel3 = new JPanel();
		panel3.setLayout( new GridLayout( 3, 2 ) );

		panel3.add( new JLabel( "Field 1:" ) );
		panel3.add( new TextArea() );
		panel3.add( new JLabel( "Field 2:" ) );
		panel3.add( new TextArea() );
		panel3.add( new JLabel( "Field 3:" ) );
		panel3.add( new TextArea() );
	}

    
	
}



	




