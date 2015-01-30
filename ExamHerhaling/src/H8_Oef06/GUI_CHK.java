package H8_Oef06;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_CHK extends JFrame {
	
	JPanel hoofdPaneel;
	JPanel[][] panelen = new JPanel[5][5];
	JCheckBox[][] checkboxes = new JCheckBox[5][5];
	int naamTeller = 1;
	
	public GUI_CHK() {
		hoofdPaneel = new JPanel(new GridLayout(5,5));
		for (int rij = 0; rij < panelen.length; rij++) {
			for (int kolom = 0; kolom < panelen[rij].length; kolom++) {
				checkboxes[rij][kolom] = new JCheckBox(naamTeller + "");
				++naamTeller;
				panelen[rij][kolom] = new JPanel();
				panelen[rij][kolom].add(checkboxes[rij][kolom]);
				hoofdPaneel.add(panelen[rij][kolom]);
				checkboxes[rij][kolom].addActionListener(new ClickHandler());
			}
		}
		add(hoofdPaneel);
		setVisible(true);
		setSize(500,500);
		setLocation(100,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public class ClickHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for (int rij = 0; rij < panelen.length; rij++) {
				for (int kolom = 0; kolom < panelen[rij].length; kolom++) {
					if (checkboxes[rij][kolom].isSelected()) {
						panelen[rij][kolom].setBackground(Color.red);	
					} else {
						panelen[rij][kolom].setBackground(hoofdPaneel.getBackground());
					}
					
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
	new GUI_CHK();
	}
	
}


