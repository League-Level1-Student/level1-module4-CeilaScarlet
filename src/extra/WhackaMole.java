package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
		
	WhackaMole() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < 24; i++) {
			
		JButton button = new JButton();	
		panel.add(button);	
		button.addActionListener(this);
		
		}
				
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(300, 300);
		
	}
		
	public static void main(String[] args) {
		
		WhackaMole Wam = new WhackaMole();
		
	}
	
	private void drawButtons(){
		
		
		Random Random = new Random(); 
		
		
		
	}
	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		}

	
	
	
}
