import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	
	
	JFrame jframe = new JFrame();
	JLabel jlabel = new JLabel();
	JPanel jpanel = new JPanel();
	
	
	SlotMachine() throws MalformedURLException{
		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(jlabel);
		jframe.add(jpanel);
		jframe.pack();
		
		jpanel.add(createLabelImage("cher.jpg"));
		jpanel.add(createLabelImage("lim.jpg"));
		jpanel.add(createLabelImage("oran.jpg"));
		jframe.setSize(1900, 600);
		
		Random random = new Random();
		
		for (int i = 0; i < 3; i++) {
			int ran = random.nextInt(2);
			
			if (ran == 0) {
				
				jpanel.add(createLabelImage("cher.jpg"));
				
			}
			
			else if (ran == 1) {
				
				jpanel.add(createLabelImage("lim.jpg"));
				
			}
			
			else if (ran == 2) {
				
				jpanel.add(createLabelImage("oran.jpg"));
				
			}
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		SlotMachine sm = new SlotMachine();
		
	}
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
	
	
}
}
