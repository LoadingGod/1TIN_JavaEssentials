package Oefeningen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Opdracht10 extends JFrame {
	
	JPanel hoofdPaneel, linkerPaneel;
	JButton btnRed, btnGreen, btnBlue;
	JLabel tekst;
	
	public Opdracht10() {
		super("Colorpanel");
		hoofdPaneel = new JPanel(new GridLayout(1,1));
		linkerPaneel = new JPanel(new GridLayout(3,1));
		tekst = new JLabel("Begin");
		btnRed = new JButton("Red");
		btnGreen = new JButton("Green");
		btnBlue = new JButton("Blue");
		add(hoofdPaneel);
		hoofdPaneel.add(linkerPaneel);
		hoofdPaneel.add(tekst);
		linkerPaneel.add(btnRed);
		linkerPaneel.add(btnGreen);
		linkerPaneel.add(btnBlue);		
		tekst.setHorizontalAlignment(SwingConstants.CENTER);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(600,400);
		setLocation(100,100);
		setVisible(true);
		btnRed.addActionListener(new ColorHandler(Color.RED));
		btnGreen.addActionListener(new ColorHandler(Color.GREEN));
		btnBlue.addActionListener(new ColorHandler(Color.BLUE));
	}
	
	public static void main(String[] args) {
		new Opdracht10();
	}
	
	public class ColorHandler implements ActionListener {
		
		private final Color Kleur;
		
		public ColorHandler(Color Kleur) {
			this.Kleur = Kleur;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String strColor = e.getActionCommand();
			tekst.setOpaque(true);
			tekst.setText(strColor);
			tekst.setBackground(Kleur);			
		}
		
	}

}
 