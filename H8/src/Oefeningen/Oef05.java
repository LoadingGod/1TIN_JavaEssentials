package Oefeningen;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Oef05 extends JFrame{
	
	private JPanel hoofdPaneel, linkerPaneel, linkerBovenPaneel, linkerOnderPaneel, rechterPaneel;
	private JButton btnDruk;
	private JRadioButton rBtnMan, rBtnVrouw;
	private JTextField naam;
	private Choice klas;
	private JLabel naamLabel, klasLabel, geslachtLabel;
	private String[] klassen = {"1TIN", "2TIN", "3TIN"};
	private String geslachtText;
	
	public Oef05() {
		
		hoofdPaneel = new JPanel(new BorderLayout());
		linkerPaneel = new JPanel(new BorderLayout());
		linkerBovenPaneel = new JPanel(new GridLayout(2,3));
		linkerOnderPaneel = new JPanel(new FlowLayout());
		rechterPaneel = new JPanel(new GridLayout(1,1));
		btnDruk = new JButton("Druk");
		rBtnMan = new JRadioButton("M");
		rBtnMan.setSelected(true);
		rBtnVrouw = new JRadioButton("V");
		naam = new JTextField();
		klas = new Choice();
		for (String temp : klassen) {
			klas.add(temp);
		}
		naamLabel = new JLabel("Naam");
		klasLabel = new JLabel("Klas");
		geslachtLabel = new JLabel("Geslacht");
		add(hoofdPaneel);
		hoofdPaneel.add(linkerPaneel, BorderLayout.CENTER);
		hoofdPaneel.add(rechterPaneel, BorderLayout.EAST);
		linkerPaneel.add(linkerBovenPaneel, BorderLayout.CENTER);
		linkerPaneel.add(linkerOnderPaneel, BorderLayout.SOUTH);
		rechterPaneel.add(btnDruk);
		linkerBovenPaneel.add(naamLabel, BorderLayout.NORTH);
		linkerBovenPaneel.add(naam, BorderLayout.NORTH);
		linkerBovenPaneel.add(klasLabel, BorderLayout.CENTER);
		linkerBovenPaneel.add(klas, BorderLayout.CENTER);
		linkerOnderPaneel.add(geslachtLabel);
		linkerOnderPaneel.add(rBtnMan);
		linkerOnderPaneel.add(rBtnVrouw);
		setSize(250,200);
		setLocation(100,100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		rBtnMan.addActionListener(new ClickHandler());
		rBtnVrouw.addActionListener(new ClickHandler());
		btnDruk.addActionListener(new ClickHandler());
	}
	
	public class ClickHandler implements ActionListener{
		

		@Override
		public void actionPerformed(ActionEvent e) {
		String knop = e.getActionCommand();
		
		if (knop.equals("M")) {
			rBtnVrouw.setSelected(false);
			rBtnMan.setSelected(true);
			geslachtText = "Man";
		} else if (knop.equals("V")) {
			rBtnMan.setSelected(false);
			rBtnVrouw.setSelected(true);
			geslachtText = "Vrouw";
		} else if (knop.equals("Druk") && !naam.getText().equals("")) {
			System.out.println(naam.getText() + "\n" + geslachtText + "\n" + klas.getSelectedItem());
			naam.setText("");
			klas.select(0);
			rBtnMan.setSelected(true);
			rBtnVrouw.setSelected(false);
		}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Oef05();
	}

}