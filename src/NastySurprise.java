import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{

	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JLabel jlabel = new JLabel();
	JButton jbutton = new JButton();
	JButton jjbutton = new JButton();
	
	
	
	NastySurprise(){
		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jpanel.add(jbutton);
		jbutton.addActionListener(this);
		jbutton.setText("Trick");
		
		jpanel.add(jjbutton);
		jjbutton.addActionListener(this);
		jjbutton.setText("Treat");
		
		jframe.add(jpanel);
		jframe.pack();
		
		
	}

	public static void main(String[] args) {
		
		NastySurprise ns = new NastySurprise();
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == jbutton) {
			
			showPictureFromTheInternet("https://media.istockphoto.com/photos/portrait-of-brown-puppy-with-bokeh-background-picture-id636475496?k=6&m=636475496&s=612x612&w=0&h=qzQblMJNpdeJsWd7DIB5mxOLq7Mm2F-VM82boyDukPA=");
			
		}
		
		else {
			
			showPictureFromTheInternet("https://i.ytimg.com/vi/a5xYjc_s0kI/maxresdefault.jpg");
			
		}
		
	}
	
}
