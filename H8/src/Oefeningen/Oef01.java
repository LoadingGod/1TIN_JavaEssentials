package Oefeningen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Oef01 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2590965337283021563L;
	private static final double KmMiFactor = 0.62137;
	private JPanel hoofdPaneel, linkerPaneel, rechterPaneel, naamPaneel;
	private JButton btnConvert, btnOK;
	private JTextField kilometer, naam;
	private JLabel linksBoven, linksMidden, linksOnder, miles, naamTxt;

	public Oef01() {
		super("KM To Miles Conversion Tool 1.0");
		naamPaneel = new JPanel(new GridLayout(3, 1));
		hoofdPaneel = new JPanel(new GridLayout(1, 2));
		linkerPaneel = new JPanel(new BorderLayout());
		rechterPaneel = new JPanel(new BorderLayout());
		add(hoofdPaneel);
		btnOK = new JButton("OK");
		naam = new JTextField("");
		naamTxt = new JLabel("Geef je naam in: ");
		naamPaneel.add(naamTxt);
		naamPaneel.add(naam);
		naamPaneel.add(btnOK);
		naamPaneel.setSize(400, 150);
		naamPaneel.setLocation(0,0);
		hoofdPaneel.add(linkerPaneel);
		linkerPaneel.setVisible(false);
		hoofdPaneel.add(rechterPaneel);
		rechterPaneel.setVisible(false);
		hoofdPaneel.add(naamPaneel, 1);
		linksBoven = new JLabel("Kilometer(s):");
		linksMidden = new JLabel("Mile(s):");
		linksOnder = new JLabel("");
		linkerPaneel.add(linksBoven, BorderLayout.NORTH);
		linkerPaneel.add(linksMidden, BorderLayout.CENTER);
		linkerPaneel.add(linksOnder, BorderLayout.SOUTH);
		kilometer = new JTextField("");
		miles = new JLabel("0.0");
		miles.getFont().deriveFont(Font.BOLD);
		btnConvert = new JButton("Convert");
		rechterPaneel.add(kilometer, BorderLayout.NORTH);
		rechterPaneel.add(miles, BorderLayout.CENTER);
		rechterPaneel.add(btnConvert, BorderLayout.SOUTH);
		setSize(400, 150);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		btnOK.addActionListener(new setNameHandler());
		naam.addActionListener(new setNameHandler());
		kilometer.addActionListener(new conversionHandler());
		btnConvert.addActionListener(new conversionHandler());
	}

	public static void main(String[] args) {
		new Oef01();
	}
	
	public class setNameHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			linksOnder.setText("Made by " + naam.getText());
			hoofdPaneel.remove(naamPaneel);
			linkerPaneel.setVisible(true);
			rechterPaneel.setVisible(true);
			
		}
		
	}
	
	public class conversionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			miles.setText("" + ((int) ((Double.parseDouble(kilometer.getText()) * KmMiFactor) * 1000.0)) / 1000.0);
		}

	}

}