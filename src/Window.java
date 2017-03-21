import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
	
	public Window() {
		this.setTitle("Interesting Window");
		this.setSize(300, 160);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		/* We have 8 colours to set up for our Mondrian.
		 * Each colour will have it's own panel and
		 * each panel will have the same dimensions
		 */
		JPanel colorPanel1 = new JPanel();
		colorPanel1.setBackground(Color.YELLOW);
		colorPanel1.setPreferredSize(new Dimension(60, 40));
		
		JPanel colorPanel2 = new JPanel();
		colorPanel2.setBackground(Color.RED);
		colorPanel2.setPreferredSize(new Dimension(60, 40));
		
		JPanel colorPanel3 = new JPanel();
		colorPanel3.setBackground(Color.GREEN);
		colorPanel3.setPreferredSize(new Dimension(60, 40));
		
		JPanel colorPanel4 = new JPanel();
		colorPanel4.setBackground(Color.BLACK);
		colorPanel4.setPreferredSize(new Dimension(60, 40));
		
		JPanel colorPanel5 = new JPanel();
		colorPanel5.setBackground(Color.CYAN);
		colorPanel5.setPreferredSize(new Dimension(60, 40));
		
		JPanel colorPanel6 = new JPanel();
		colorPanel6.setBackground(Color.BLUE);
		colorPanel6.setPreferredSize(new Dimension(60, 40));
		
		JPanel colorPanel7 = new JPanel();
		colorPanel7.setBackground(Color.ORANGE);
		colorPanel7.setPreferredSize(new Dimension(60, 40));
		
		JPanel colorPanel8 = new JPanel();
		colorPanel8.setBackground(Color.DARK_GRAY);
		colorPanel8.setPreferredSize(new Dimension(60, 40));
		
		// We create the mother panel that will receive the colour panels
		JPanel motherPane = new JPanel();
		motherPane.setBackground(Color.WHITE);
		motherPane.setPreferredSize(new Dimension(300, 120));
		
		/* We set the GridBagLayout for our mother panel
		 * and we create an instance of GridBagConstraints that will handle the colour panels
		 */
		motherPane.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		
		// LET'S CREATE OUR PIECE OF ART
		
		/* We specify to the gridBagConstraints where to start
		 * In our case, the upper left corner of our mother pane.
		 */
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		//We specify the width and height we want for our colour panel
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridheight = 1;
		
		/* Then we add the colour panel 
		 * - with it's gridBagConstraints containing all it's specifications - 
		 * to the mother panel
		 */
		motherPane.add(colorPanel1, gridBagConstraints);
		
		//---------------------------------------------
		
		/* For placing our second colour panel it is important to remember
		 * that our specifications - gridx, gridy, gridwidth and gridheight -
		 * are still stored. So we only need to change the specificity we need changing.
		 * In this case, we start 1 step to the right from our previous position,
		 * at the same level, with the same width and height as before. 
		 * Thus, only gridx has to change
		 */
		gridBagConstraints.gridx = 1;
		motherPane.add(colorPanel2, gridBagConstraints);
		
		//---------------------------------------------
		
		gridBagConstraints.gridx = 2;
		motherPane.add(colorPanel3, gridBagConstraints);
		
		//---------------------------------------------
		
		// We must here warn our gridBagConstraints that it has reached the end of the line
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.gridx = 3;
		motherPane.add(colorPanel4, gridBagConstraints);
		
		//---------------------------------------------
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridheight = 2;
		
		// We must here warn our gridBagConstraints that this one replicate itself vertically
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		motherPane.add(colorPanel5, gridBagConstraints);
		
		//---------------------------------------------
		
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridheight = 1;
		
		// We must here warn our gridBagConstraints that this one replicate itself horizontally
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		motherPane.add(colorPanel6, gridBagConstraints);
		
		//---------------------------------------------

		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		motherPane.add(colorPanel7, gridBagConstraints);
		
		//---------------------------------------------

		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		motherPane.add(colorPanel8, gridBagConstraints);

		//---------------------------------------------
		
		// We set the mother panel as the main panel of our window
		this.setContentPane(motherPane);
		
		/* We then display the true materialisation of Shock and Awe that is our creation
		 * for all the world to see
		 */
		this.setVisible(true);
	}
}
