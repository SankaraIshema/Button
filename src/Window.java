import java.awt.BorderLayout;

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
		
		this.setLayout(new BorderLayout());
		
		this.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);
		this.getContentPane().add(new JButton("WEST"), BorderLayout.WEST);
		this.getContentPane().add(new JButton("NORTH"), BorderLayout.NORTH);
		this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
		this.getContentPane().add(new JButton("CENTER"), BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
