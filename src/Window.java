import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
	
	private JButton button = new JButton("My Button");
	
	public Window() {
		this.setTitle("Interesting Window");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new GridLayout(3,2));
		
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		this.getContentPane().add(new JButton("6"));
		
		this.setVisible(true);
	}
}
