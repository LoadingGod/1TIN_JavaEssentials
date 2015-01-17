package Oefeningen;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExtraOefening extends JFrame {

	private JPanel hoofdPaneel, bovenPaneel, onderPaneel;
	private JButton[] dagen = new JButton[31];
	private JLabel huidigeDatum;

	public ExtraOefening() {
		hoofdPaneel = new JPanel(new BorderLayout());
		bovenPaneel = new JPanel(new FlowLayout());
		onderPaneel = new JPanel(new GridLayout(6, 6));
		Calendar kalender = Calendar.getInstance();
		int aantalDagen = kalender.getActualMaximum(Calendar.DAY_OF_MONTH);
		int maand = kalender.get(Calendar.MONTH);
		int jaar = kalender.get(Calendar.YEAR);
		huidigeDatum = new JLabel(maand + 1 + "/" + jaar);
		bovenPaneel.add(huidigeDatum);
		hoofdPaneel.add(bovenPaneel, BorderLayout.NORTH);
		hoofdPaneel.add(onderPaneel, BorderLayout.CENTER);
		add(hoofdPaneel);
		for (int i = 0; i < aantalDagen; i++) {
			int dag = i + 1;
			dagen[i] = new JButton("" + dag);
			onderPaneel.add(dagen[i]);
		}
		setSize(300, 200);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
	}

	public static void main(String[] args) {
		new ExtraOefening();
	}

}