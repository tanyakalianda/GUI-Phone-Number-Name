/**
 * @author Tanya Kalianda
 * Name and Phone Number
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PhoneNumber {

	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(300,300,500,400);
		myFrame.setLayout(null);
		
		JLabel labelName = new JLabel();
		labelName.setBounds(50,50,100,50);
		labelName.setText("Enter your name: ");
		myFrame.add(labelName);
		
		JTextField name = new JTextField();
		name.setBounds(150,50,100,50);
		myFrame.add(name);
		
		JLabel labelPhone = new JLabel();
		labelPhone.setBounds(50,150,200,50);
		labelPhone.setText("Enter your phone number: ");
		myFrame.add(labelPhone);
		
		JTextField phone = new JTextField();
		phone.setBounds(200,150,100,50);
		myFrame.add(phone);
		
		JLabel infoGiven = new JLabel();
		infoGiven.setBounds(200,200,300,100);
		myFrame.add(infoGiven);
		
		JButton command = new JButton();
		command.setBounds(10,10,50,50);
		command.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				infoGiven.setText("Name: " + name.getText() + "    Phone: " + phone.getText());
			}
		});
		myFrame.add(command);
		
		myFrame.setVisible(true); 
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
