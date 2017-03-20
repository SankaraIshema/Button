import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
	
	CardLayout cardLayout = new CardLayout();
	JPanel motherPane = new JPanel();
	String[] listDaughterPane = {"DAUGHTER_PANE_1", "DAUGHTER_PANE_2", "DAUGHTER_PANE_3"};
	int i = 0;
	
	public Window() {
		this.setTitle("Interesting Window");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel daughterPane1 = new JPanel();
		daughterPane1.setBackground(Color.BLUE);
		JPanel daughterPane2 = new JPanel();
		daughterPane2.setBackground(Color.YELLOW);
		JPanel daughterPane3 = new JPanel();
		daughterPane3.setBackground(Color.RED);	
		
		JButton button1 = new JButton("Next Content");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(motherPane);
				
			}
		});
		
		JButton button2 = new JButton("Content by Indice");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(++i > 2) i = 0;
				cardLayout.show(motherPane, listDaughterPane[i]);
				
			}
		});
		
		JPanel buttonPane = new JPanel();
		buttonPane.add(button1);
		buttonPane.add(button2);
		
		motherPane.setLayout(cardLayout);
		motherPane.add(daughterPane1, listDaughterPane[0]);
		motherPane.add(daughterPane2, listDaughterPane[1]);
		motherPane.add(daughterPane3, listDaughterPane[2]);
		
		this.getContentPane().add(buttonPane, BorderLayout.NORTH);
		this.getContentPane().add(motherPane, BorderLayout.CENTER);
		this.setVisible(true);
	}
}
