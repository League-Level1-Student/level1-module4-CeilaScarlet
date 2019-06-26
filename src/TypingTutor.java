import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{

	
	
	public static void main(String[] args) {
		
	TypingTutor tp = new TypingTutor();
	
	JFrame jframe = new JFrame();
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setVisible(true);
	JPanel jpanel = new JPanel();	
	jframe.setSize(300, 150);
	jframe.setTitle("Type or Die");
	JLabel jlabel = new JLabel();

	char currentLetter;

	currentLetter = tp.generateRandomLetter();

	jlabel.add(currentLetter);
	jlabel.setFont(jlabel.getFont().deriveFont(28.0f));
	jlabel.setHorizontalAlignment(JLabel.CENTER);
	jpanel.add(jlabel);
	jframe.add(jpanel);
	
	
	
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

		char keyPressed = (char) e.getSource();
		
		if ( keyPressed == keyPressed) {
			
			System.out.println(keyPressed);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
