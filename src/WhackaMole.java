
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.media.jfxmedia.AudioClip;

public class WhackaMole implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	private int molescore = 0;
	private AudioClip sound;
	private int molewhacked = 0;
	private int molemissed = 0;
	Date timeAtStart;
		
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
		
		
		
	}
	
	private void drawButtons(Random button){
		
		WhackaMole Wam = new WhackaMole();
		
	}
	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JButton buttonPressed = (JButton) e.getSource();
			
			if (molewhacked == 10) {
				endGame(timeAtStart,molewhacked);
			}
			
			
		if (buttonPressed.equals("Mole")) {
			
			molewhacked++;
			molescore++;
			frame.dispose();
			drawButtons();
			
			
			
		}
		else {
			
			speak("You missed!!!");
			molemissed--;
			frame.dispose();
			drawButtons();
		}		
			
			
			
		}

		private void drawButtons() {
			// TODO Auto-generated method stub
			
		}

		void speak(String words) {
		     try {
		          Runtime.getRuntime().exec("say " + words).waitFor();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}

		private void endGame(Date timeAtStart, int molesWhacked) {
		     Date timeAtEnd = new Date();
		     JOptionPane.showMessageDialog(null, "Your whack rate is "
		          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		          + " moles per second.");
		}

		private void playSound(String fileName) {
		     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		     sound.play();
		}
	
}
