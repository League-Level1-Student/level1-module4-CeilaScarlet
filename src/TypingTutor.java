import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	
	char currentLetter;
	
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JLabel jlabel = new JLabel();

	TypingTutor() {

		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		jframe.setSize(300, 150);
		jframe.setTitle("Type or Die");
		

		currentLetter = generateRandomLetter();

		jlabel.setFont(jlabel.getFont().deriveFont(28.0f));
		jlabel.setHorizontalAlignment(JLabel.CENTER);
		jpanel.add(jlabel);
		jframe.add(jpanel);
		jframe.addKeyListener(this);
		jlabel.setText("" + currentLetter);

	}

	public static void main(String[] args) {

		TypingTutor tp = new TypingTutor();

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		char keyPressed = (char) e.getKeyChar();

		System.out.println("You typed : " + keyPressed);
		
		if (keyPressed == currentLetter) {
			
		System.out.println("CORRECT!!!");
			
		jpanel.setBackground(Color.GREEN);	
		
		}
		
		else {
			
		jpanel.setBackground(Color.red);
		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		TypingTutor tp = new TypingTutor();
		
		jlabel.updateUI();
		
	}

}
