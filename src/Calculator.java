import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField Number1 = new JTextField(20);
	JTextField Number2 = new JTextField(20);
	JButton ButtonA = new JButton();
	JButton ButtonS = new JButton();
	JButton ButtonM = new JButton();
	JButton ButtonD = new JButton();
	private int answer = 0;
	
	
	Calculator() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(ButtonA);
		ButtonA.addActionListener(this);
		ButtonA.setText("Add");
		
		panel.add(ButtonS);
		ButtonS.addActionListener(this);
		ButtonS.setText("Subtract");
		
		panel.add(ButtonM);
		ButtonM.addActionListener(this);
		ButtonM.setText("Muiltply");
		
		panel.add(ButtonD);
		ButtonD.addActionListener(this);
		ButtonD.setText("Divide");
		
		
		panel.add(Number1);
		panel.add(Number2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	int Add(int x, int y){
		
		return x + y;
	
		
	}
	
	int Sub(int x, int y){
		
		return x - y;
	
		
	}
	
	int Mul(int x, int y){
		
		return x * y;
	
		
	}
	
	int Div(int x, int y){
		
		return x / y;
	
		
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		int rt = Integer.parseInt(Number1.getText());
		
		int wt = Integer.parseInt(Number2.getText());
	
		
		
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == ButtonA) {
			int we = Add(rt, wt);
			JOptionPane.showMessageDialog(null, we);
			
		}
			if (buttonPressed == ButtonS) {
				int ne = Sub(rt,wt);
				JOptionPane.showMessageDialog(null, ne);
			}
			
			if (buttonPressed == ButtonM) {
				int me = Mul(rt,wt);
				JOptionPane.showMessageDialog(null, me);
			}
			
			if (buttonPressed == ButtonD) {
				int de = Div(rt,wt);
				JOptionPane.showMessageDialog(null, de);
			}
	}	
}
