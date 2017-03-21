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
		
		JPanel casePanel1 = new JPanel();
		casePanel1.setBackground(Color.YELLOW);
		casePanel1.setPreferredSize(new Dimension(60, 40));
		
		JPanel casePanel2 = new JPanel();
		casePanel2.setBackground(Color.RED);
		casePanel2.setPreferredSize(new Dimension(60, 40));
		
		JPanel casePanel3 = new JPanel();
		casePanel3.setBackground(Color.GREEN);
		casePanel3.setPreferredSize(new Dimension(60, 40));
		
		JPanel casePanel4 = new JPanel();
		casePanel4.setBackground(Color.BLACK);
		casePanel4.setPreferredSize(new Dimension(60, 40));
		
		JPanel casePanel5 = new JPanel();
		casePanel5.setBackground(Color.CYAN);
		casePanel5.setPreferredSize(new Dimension(60, 40));
		
		JPanel casePanel6 = new JPanel();
		casePanel6.setBackground(Color.BLUE);
		casePanel6.setPreferredSize(new Dimension(60, 40));
		
		JPanel casePanel7 = new JPanel();
		casePanel7.setBackground(Color.ORANGE);
		casePanel7.setPreferredSize(new Dimension(60, 40));
		
		JPanel casePanel8 = new JPanel();
		casePanel8.setBackground(Color.DARK_GRAY);
		casePanel8.setPreferredSize(new Dimension(60, 40));
		
		JPanel motherPane = new JPanel();
		motherPane.setBackground(Color.WHITE);
		motherPane.setPreferredSize(new Dimension(300, 120));
		
		motherPane.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridheight = 1;
		motherPane.add(casePanel1, gridBagConstraints);
		
		gridBagConstraints.gridx = 1;
		motherPane.add(casePanel2, gridBagConstraints);
		
		gridBagConstraints.gridx = 2;
		motherPane.add(casePanel3, gridBagConstraints);
		
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.gridx = 3;
		motherPane.add(casePanel4, gridBagConstraints);
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		motherPane.add(casePanel5, gridBagConstraints);
		
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridheight = 1;
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		motherPane.add(casePanel6, gridBagConstraints);
		
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		motherPane.add(casePanel7, gridBagConstraints);
		
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		motherPane.add(casePanel8, gridBagConstraints);

		this.setContentPane(motherPane);
		this.setVisible(true);
	}
}
