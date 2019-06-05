
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.media.jfxmedia.AudioClip;

public class WhackaMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	private int molescore = 0;
	private AudioClip sound;
	private int molewhacked = 0;
	private int molemissed = 0;
	Date timeAtStart;
	Date timeAtEnd;

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton buttonPressed = (JButton) e.getSource();

		if (molewhacked == 10) {

			endGame(timeAtStart, molewhacked);
			JOptionPane.showMessageDialog(null, "Your whack rate is "
					+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molescore) + " moles per second.");

		}

		if (buttonPressed.getText().equals("Mole")) {

			molewhacked++;
			molescore++;
			frame.dispose();
			drawButtons();

		}  else {
			if (molemissed == 5) {
				frame.dispose();
				endGame(timeAtStart, molewhacked);
				JOptionPane.showMessageDialog(null, "Your whack rate is "
						+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molescore) + " moles per second.");
			}else if (molemissed <= 2) {
				
				speak("You missed!!!");
				
			} else if (molemissed >= 3) {
				
				speak("Try Harder!!!");
				
			}
		}
	   
		
		System.out.println(molemissed);
		System.out.println(molewhacked);
		frame.dispose();
		drawButtons();
		molemissed++;
		
		

	}

	

	private void drawButtons() {
		// TODO Auto-generated method stub

		Random Random = new Random();

		timeAtStart = new Date();
		
		int ran = Random.nextInt(24);
		frame.remove(panel);
panel = new JPanel();

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
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	private void playSound(String fileName) {
		AudioClip sound = (AudioClip) JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
