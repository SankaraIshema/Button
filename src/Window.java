import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
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
		
		Box box1 = Box.createHorizontalBox();
		box1.add(new JButton("Button1"));
		
		Box box2 = Box.createHorizontalBox();
		box2.add(new JButton("Button2"));
		box2.add(new JButton("Button3"));
		
		Box box3 = Box.createHorizontalBox();
		box3.add(new JButton("Button4"));
		box3.add(new JButton("Button5"));
		box3.add(new JButton("Button6"));
		
		Box box4 = Box.createVerticalBox();
		box4.add(box1);
		box4.add(box2);
		box4.add(box3);
		
		this.getContentPane().add(box4);
		this.setVisible(true);
	}
}
