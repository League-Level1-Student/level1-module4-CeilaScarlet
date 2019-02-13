import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	
	public static void main(String[] args) {
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		
		Random Random = new Random(); 
		
		int random = Random.nextInt(4);
		
	// 3. Print out this variable
		
		System.out.println(random);

	// 4. Get the user to enter a question for the 8 ball
		
		String question = JOptionPane.showInputDialog(" Ask a yes or no question... ");

	// 5. If the random number is 0
		
		if (random == 0) {
			
			JOptionPane.showMessageDialog(null, "Yes", null, 0);
			
		}
		
		else if (random == 1) {
			
			JOptionPane.showMessageDialog(null, "No", null, 0);
			
		}
		
		else if (random == 2) {
			
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?", null, 0);
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "I don't care", null, 0);
			
		}

	// -- tell the user "Yes"

	// 6. If the random number is 1
		
		

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
	
	
	}
	

}
