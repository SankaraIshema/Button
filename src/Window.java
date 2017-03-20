import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
	
	
	public Window() {
		this.setTitle("Interesting Window");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel boxPanel1 = new JPanel();
		boxPanel1.setLayout(new BoxLayout(boxPanel1, BoxLayout.LINE_AXIS));
		boxPanel1.add(new JButton("1"));
		
		JPanel boxPanel2 = new JPanel();
		boxPanel2.setLayout(new BoxLayout(boxPanel2, BoxLayout.LINE_AXIS));
		boxPanel2.add(new JButton("2"));
		boxPanel2.add(new JButton("3"));
		
		JPanel boxPanel3 = new JPanel();
		boxPanel3.setLayout(new BoxLayout(boxPanel3, BoxLayout.LINE_AXIS));
		boxPanel3.add(new JButton("4"));
		boxPanel3.add(new JButton("5"));
		boxPanel3.add(new JButton("6"));
		
		JPanel boxPanel4 = new JPanel();
		boxPanel4.setLayout(new BoxLayout(boxPanel4, BoxLayout.PAGE_AXIS));
		boxPanel4.add(boxPanel1);
		boxPanel4.add(boxPanel2);
		boxPanel4.add(boxPanel3);
		
		this.getContentPane().add(boxPanel4);
		this.setVisible(true);
	}
}
