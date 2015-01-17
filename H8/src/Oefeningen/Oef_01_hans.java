package Oefeningen;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Oefeningen.Opdracht07.FontHandler;

public class Oef_01_hans extends JFrame {

	private JPanel hoofdPaneel, beginPaneel;
	private JLabel kiloMeters, miles, naam, omzetting, madeBy;
	private JTextField KmTekst, begin;
	private JButton btnConvert, btnOK;
	private final double KmMiFactor=0.62137;

	public Oef_01_hans() {
		super("KM to Miles conversion 1.0");
		beginPaneel = new JPanel(new GridLayout(3,1));
		hoofdPaneel = new JPanel(new GridLayout(3, 2));
		kiloMeters = new JLabel("Kilometer(s):");
		miles = new JLabel("Mile(s):");
		naam = new JLabel("Naam");
		madeBy = new JLabel("Made By <naam>");
		KmTekst = new JTextField("Geef een waarde in.");
		btnConvert = new JButton("Convert");
		omzetting = new JLabel("0.0");
		begin = new JTextField("Geef je naam in.");
		btnOK = new JButton("OK");
		
		
		add(beginPaneel);
		
				
		beginPaneel.add(naam);
		beginPaneel.add(begin);
		beginPaneel.add(btnOK);
		kiloMeters.setVisible(false);
		setLocation(100, 100);
		setSize(350, 150);
		setVisible(true);
		
		btnOK.addActionListener(new tweedePaneel());
		add(hoofdPaneel);		
		hoofdPaneel.add(kiloMeters);
		hoofdPaneel.add(KmTekst);
		hoofdPaneel.add(miles);
		hoofdPaneel.add(omzetting);
		hoofdPaneel.add(madeBy);
		hoofdPaneel.add(btnConvert);


		setLocation(100, 100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(350, 150);

		KmTekst.addActionListener(new omzetting());
		btnConvert.addActionListener(new omzetting());

	}
	public class omzetting implements ActionListener {



		@Override
		public void actionPerformed(ActionEvent e) {
			omzetting.setText("" + (int)(Double.parseDouble(KmTekst.getText()) * KmMiFactor * 1000.0) / 1000.0);


		}
		
	

	}
	
	public class tweedePaneel implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			madeBy.setText("Made By <" + begin.getText() + ">");
			hoofdPaneel.remove(beginPaneel);
			beginPaneel.setVisible(false);
			hoofdPaneel.setVisible(true);
			
			
		}
		
	}

	public static void main(String[] args) {
		new Oef_01_hans();

	}

}