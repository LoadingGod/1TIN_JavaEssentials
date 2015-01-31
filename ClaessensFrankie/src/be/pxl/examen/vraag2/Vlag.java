package be.pxl.examen.vraag2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Vlag extends JFrame {

	JPanel hoofdPaneel, linkerPaneel, rechterPaneel, linkerOnder;
	JLabel[][] vlag = new JLabel[3][3];
	JButton btnBelgie, btnDuitsland, btnItalie, btnNederland, btnExit;
	JRadioButton btnVet;
	JLabel lbStatus;

	public Vlag() {
		super("Vlaggen");
		hoofdPaneel = new JPanel(new BorderLayout());
		linkerPaneel = new JPanel(new BorderLayout());
		linkerOnder = new JPanel(new GridLayout(3, 3));
		rechterPaneel = new JPanel(new GridLayout(6, 1));
		btnVet = new JRadioButton("Vet");
		btnBelgie = new JButton("Belgie");
		btnDuitsland = new JButton("Duitsland");
		btnItalie = new JButton("Italie");
		btnNederland = new JButton("Nederland");
		btnExit = new JButton("Exit");
		rechterPaneel.add(btnVet);
		rechterPaneel.add(btnBelgie);
		rechterPaneel.add(btnDuitsland);
		rechterPaneel.add(btnItalie);
		rechterPaneel.add(btnNederland);
		rechterPaneel.add(btnExit);
		hoofdPaneel.add(linkerPaneel, BorderLayout.CENTER);
		hoofdPaneel.add(rechterPaneel, BorderLayout.EAST);
		lbStatus = new JLabel("Dit is de vlag van: ");
		linkerPaneel.add(lbStatus, BorderLayout.NORTH);
		linkerPaneel.add(linkerOnder, BorderLayout.CENTER);
		linkerOnder.setBackground(Color.DARK_GRAY);
		add(hoofdPaneel);
		for (int rij = 0; rij < vlag.length; rij++) {
			for (int kolom = 0; kolom < vlag[rij].length; kolom++) {
				vlag[rij][kolom] = new JLabel();
				linkerOnder.add(vlag[rij][kolom]);
				vlag[rij][kolom].setOpaque(true);
			}

		}
		setVisible(true);
		setLocation(100, 100);
		setSize(600, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		btnBelgie.addActionListener(new ClickHandler());
		btnDuitsland.addActionListener(new ClickHandler());
		btnItalie.addActionListener(new ClickHandler());
		btnNederland.addActionListener(new ClickHandler());
		btnExit.addActionListener(new ClickHandler());
		btnVet.addActionListener(new FontHandler());

	}

	public class ClickHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton temp = (JButton)e.getSource();
			if (temp.getText().equals("Belgie")) {
				lbStatus.setText("Dit is de vlag van: Belgie");
				kleurVerticaal(Color.BLACK, Color.YELLOW, Color.RED);
			} else if (temp.getText().equals("Italie")) {
				lbStatus.setText("Dit is de vlag van: Italie");
				kleurVerticaal(Color.GREEN, Color.WHITE, Color.RED);
			} else if (temp.getText().equals("Duitsland")) {
				lbStatus.setText("Dit is de vlag van: Duitsland");
				kleurHorizontaal(Color.BLACK, Color.RED, Color.YELLOW);
			} else if (temp.getText().equals("Nederland")) {
				lbStatus.setText("Dit is de vlag van: Nederland");
				kleurHorizontaal(Color.RED, Color.WHITE, Color.BLUE);
			} else if (temp.getText().equals("Exit")) {
				Vlag.this.dispose();
			}
			
		}

		private void kleurHorizontaal(Color kleur1, Color kleur2, Color kleur3) {
			for (int kolom = 0; kolom < vlag[0].length; kolom++) {
				for (int rij = 0; rij < vlag.length; rij++) {
					if (kolom == 0) {
						vlag[kolom][rij].setBackground(kleur1);
					} else if (kolom == 1) {
						vlag[kolom][rij].setBackground(kleur2);
					} else {
						vlag[kolom][rij].setBackground(kleur3);
					}
				}
			}

		}

		private void kleurVerticaal(Color kleur1, Color kleur2, Color kleur3) {
			for (int kolom = 0; kolom < vlag[0].length; kolom++) {
				for (int rij = 0; rij < vlag.length; rij++) {
					if (kolom == 0) {
						vlag[rij][kolom].setBackground(kleur1);
					} else if (kolom == 1) {
						vlag[rij][kolom].setBackground(kleur2);
					} else {
						vlag[rij][kolom].setBackground(kleur3);
					}
				}
			}

		}

	}

	public class FontHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton temp = (JRadioButton) e.getSource();

			if (temp.isSelected()) {
				lbStatus.setFont(lbStatus.getFont().deriveFont(Font.BOLD));
			} else {
				lbStatus.setFont(lbStatus.getFont().deriveFont(Font.PLAIN));
			}

		}

	}

	public static void main(String[] args) {
		new Vlag();
	}
}
