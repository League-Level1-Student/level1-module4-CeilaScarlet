
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
		
	WhackaMole() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Random Random = new Random(); 
		
		int ran = Random.nextInt(24);
		
		
		
		for (int i = 0; i < 24; i++) {
			
		if (i == ran) {
			JButton button = new JButton("Mole");	
			panel.add(button);	
			button.addActionListener(this);
		}	
		
		else {
		JButton button = new JButton();	
		panel.add(button);	
		button.addActionListener(this);
		}
		
		
		}
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
		
	}
		
	public static void main(String[] args) {
		
		WhackaMole Wam = new WhackaMole();
		
	}
	
	private void drawButtons(Random button){
		

		
	}
	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JButton buttonPressed = (JButton) e.getSource();
			
		
				
			
			
			
		}

	
	
	
}
