package Oefeningen;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Oef06 extends JFrame {

	private JPanel hoofdPaneel;
	private JPanel[][] panelen = new JPanel[5][5];
	private JCheckBox[][] checkboxes = new JCheckBox[5][5];
	private int chkName = 1;

	public Oef06() {
		super("Creëer een Patroon-tool");
		hoofdPaneel = new JPanel(new GridLayout(5, 5));
		add(hoofdPaneel);
		for (int rij = 0; rij < panelen.length; rij++) {
			for (int kolom = 0; kolom < panelen[rij].length; kolom++) {
				panelen[rij][kolom] = new JPanel();
				checkboxes[rij][kolom] = new JCheckBox("" + chkName++);
				panelen[rij][kolom].add(checkboxes[rij][kolom]);
				hoofdPaneel.add(panelen[rij][kolom]);
				checkboxes[rij][kolom].addActionListener(new ClickHandler());
				panelen[rij][kolom].setOpaque(true);
			}
		}
		setSize(500, 500);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public class ClickHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Color kleur;
			JCheckBox chkbx = (JCheckBox) e.getSource();
			for (int rij = 0; rij < panelen.length; rij++) {
				for (int kolom = 0; kolom < panelen[rij].length; kolom++) {
					if (checkboxes[rij][kolom].getText()
							.equals(chkbx.getText()) && chkbx.isSelected()) {
						kleur = Color.red;
						panelen[rij][kolom].setBackground(kleur);
					} else if (checkboxes[rij][kolom].getText()
							.equals(chkbx.getText()) && !chkbx.isSelected()){
						kleur = UIManager.getColor(hoofdPaneel);
						panelen[rij][kolom].setBackground(kleur);
					}

				}
			}

		}

	}

	public static void main(String[] args) {
		new Oef06();
	}

}
