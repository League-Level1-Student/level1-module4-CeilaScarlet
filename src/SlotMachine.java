import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	
	
	JFrame jframe = new JFrame();
	JLabel jlabel = new JLabel();
	JPanel jpanel = new JPanel();
	JButton jbutton = new JButton();
	JLabel cherry = new JLabel();
	JLabel lime = new JLabel();
	JLabel orange = new JLabel();
	
	SlotMachine() throws MalformedURLException{
		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbutton.setText("SPIN");
		jbutton.addActionListener(this);
		jpanel.add(jbutton);
		jframe.add(jlabel);
		jframe.add(jpanel);
		jframe.pack();
		cherry = createLabelImage("cher.jpg");
		lime = createLabelImage("lim.jpg");
		orange = createLabelImage("oran.jpg");
		
		jpanel.add(cherry);
		jpanel.add(lime);
		jpanel.add(orange);
		jframe.setSize(1900, 600);
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		SlotMachine sm = new SlotMachine();
		
	}
	
	
	private JLabel createLabelImage(String fileName){
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
	
	
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == jbutton) {
			
	
			
			jpanel.removeAll();
			jpanel.add(jbutton);
			
			
			for (int i = 0; i < 3; i++) {
				
				int ran = random.nextInt(3);
				
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
	
		
		jframe.pack();
		
	}
}
