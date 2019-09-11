import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle implements ActionListener {
	
	JFrame jframe = new JFrame();
	JButton obutton = new JButton();
	JButton tbutton = new JButton();
	JTextField aple = new JTextField(20);
	JPanel jpanel = new JPanel();
	String Answer = "g";
	
	//Write a program that displays a JFrame to the user. 
	//The JFrame will have a JLabel, two JButtons, and a JTextField. The JLabel will provide a riddle to the user.
	//The user will type his answer in the JTextField and click the submit button. 
	//When the submit button is clicked, let the user know if the answer they typed in the JTextField is correct or not. 
	//The other JButton will be a hint button. 
	//Display a clue to the riddle when this button is clicked.
	
	
	Riddle(){
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JOptionPane.showMessageDialog(null, "What always ends everything?");
	
	obutton.addActionListener(this);
	tbutton.addActionListener(this);

	obutton.setText("Hint");
	tbutton.setText("Submit");
	jpanel.add(aple);
	jpanel.add(obutton);
	jpanel.add(tbutton);	
	jframe.add(jpanel);
	jframe.pack();	
	
	}
	
	
	
	
public static void main(String[] args) {
	
	Riddle ri = new Riddle();
	
	
}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	JButton buttonPressed = (JButton) e.getSource();
	
	if (buttonPressed == obutton) {
		
		JOptionPane.showMessageDialog(null, "ENDS EVERYTHING");
		
	}
	
	if (buttonPressed == tbutton) {
		
		if (aple.equals(Answer)) {
			
			JOptionPane.showMessageDialog(null, "Correct! The answer was " + Answer + "!!!");
			
			
			
		}
		else {
				JOptionPane.showMessageDialog(null, "Sorry but you're incorrect! The answer was " + Answer + "!!!");
			}
		
		
	}
}
}
