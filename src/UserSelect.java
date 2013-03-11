import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.Serializable;

import javax.swing.*;

public class UserSelect extends JFrame implements ActionListener,Serializable {
	
	private JButton add_btn;
	private JButton add_btn1;
	public  UserSelect(){
	super("Welcome to ABS BANK");
	add_btn=new JButton("Accountant Login");
	add_btn1=new JButton("Customer Login");
	Container cont=getContentPane();
	cont.setLayout(new FlowLayout(FlowLayout.CENTER));
	cont.add(add_btn);
	cont.add(add_btn1);
	setSize(800,600);
	setVisible(true);
	add_btn.addActionListener(this);
	add_btn1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ob)
	{
		if(ob.getSource()==add_btn)
		{
			new LoginPage();
		}
		if(ob.getSource()==add_btn1)
		{
			new LoginPageC();
		}
	}
	public static void main(String[] args) {
		new  UserSelect();
		
	}

}


