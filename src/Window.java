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
	
	// Our Layout
	CardLayout cardLayout = new CardLayout(); 
	
	// The panel that will receive all the other panels
	JPanel motherPane = new JPanel(); 
	
	/* List of all the daughter panels that will be receive by the mother-panel
	 * This list will be used by the second method of shifting through panels that we will try today*/
	String[] listDaughterPane = {"DAUGHTER_PANE_1", "DAUGHTER_PANE_2", "DAUGHTER_PANE_3"};
	
	// integer needed for our second method
	int i = 0; 
	
	public Window() {
		this.setTitle("Interesting Window");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		// The three panel we will use with their distinct background colour
		JPanel daughterPane1 = new JPanel();
		daughterPane1.setBackground(Color.BLUE);
		JPanel daughterPane2 = new JPanel();
		daughterPane2.setBackground(Color.YELLOW);
		JPanel daughterPane3 = new JPanel();
		daughterPane3.setBackground(Color.RED);	
		
		// First button with it's action listener ready to implements method 1
		JButton button1 = new JButton("Next Content");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(motherPane);
				
			}
		});
		
		// Second button with it's action listener ready to implements method 2
		JButton button2 = new JButton("Content by Indice");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(++i > 2) i = 0;
				cardLayout.show(motherPane, listDaughterPane[i]);
				
			}
		});
		
		// We collect our buttons into one panel
		JPanel buttonPane = new JPanel();
		buttonPane.add(button1);
		buttonPane.add(button2);
		
		/* We set the CardLayout into our main panel 
		 * and then we add the three daughter panels to the mother panel. */
		motherPane.setLayout(cardLayout);
		motherPane.add(daughterPane1, listDaughterPane[0]);
		motherPane.add(daughterPane2, listDaughterPane[1]);
		motherPane.add(daughterPane3, listDaughterPane[2]);
		
		/* We then ask our window to ask it's main panel to add our button panel
		 * into the upward region of the main panel */
		this.getContentPane().add(buttonPane, BorderLayout.NORTH);
		
		/* Then we ask our window to ask it's main panel to add our mother panel
		 * into the middle region of  the main panel */
		this.getContentPane().add(motherPane, BorderLayout.CENTER);
		
		/* And at last, we set the window visible so the people 
		 * may feast it's eyes on the marvel you've created */
		this.setVisible(true);
	}
}
