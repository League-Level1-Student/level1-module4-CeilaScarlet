import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField Tweet = new JTextField(20);
	JButton Search = new JButton();
		
	
		GetLatestTweet() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(Tweet);
		panel.add(Search);
		Search.addActionListener(this);
		Search.setText("Search the Twitterverse");
		
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}
		
		
		public static void main(String[] args) {
			
			GetLatestTweet glt = new GetLatestTweet();
			
		}

		
		private String getLatestTweet(String searchingFor) {

		      Twitter twitter = new TwitterFactory().getInstance();

		      AccessToken accessToken = new AccessToken(
		            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
		            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

		      twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
		            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

		      twitter.setOAuthAccessToken(accessToken);

		      Query query = new Query(searchingFor);
		      try {
		            QueryResult result = twitter.search(query);
		            return result.getTweets().get(0).getText();
		      } catch (Exception e) {
		            System.err.print(e.getMessage());
		            return "What the heck is that?";
		      }
		}

		
	@Override
	public void actionPerformed(ActionEvent e) {
	
		

		
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == Search) {
			
		JOptionPane.showMessageDialog(null,getLatestTweet(Tweet.getText()) ); 
			
		}
		
	}
	
}
