import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
	public static void main(String[] args) {
		
		ChuckleClicker cc = new ChuckleClicker();
		
		cc.makeButtons();
		
	}
	
 void makeButtons(){

		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.setText("JOKE");
		button1.addActionListener(this);
		button2.setText("PUNCHLINE");
		button2.addActionListener(this);
		jpanel.add(button1);
		jpanel.add(button2);
		jframe.add(jpanel);
		jframe.pack();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed.equals(button1)) {
			
			JOptionPane.showMessageDialog(null, "What happens to a frog's car when it breaks down?\n" + "It gets toad away.");
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "To be frank, I’d have to change my name.");
			
		}
		
	}
	
}
	
