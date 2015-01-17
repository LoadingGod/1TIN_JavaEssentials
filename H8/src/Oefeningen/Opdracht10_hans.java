package Oefeningen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Oefeningen.Opdracht07.FontHandler;

public class Opdracht10_hans extends JFrame {
	private JPanel hoofdPaneel, linkerPaneel;
	private JButton btnBlue, btnRed, btnGreen;
	private JLabel rechterPaneel;
	private String woord;

	public Opdracht10_hans() {
		super("ColorPanel");
		setSize(480, 360);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		hoofdPaneel = new JPanel(new GridLayout(1, 2));
		linkerPaneel = new JPanel(new GridLayout(3, 1));
		rechterPaneel = new JLabel("Begin");

		btnBlue = new JButton("Blue");
		btnGreen = new JButton("Green");
		btnRed = new JButton("Red");

		add(hoofdPaneel);
		hoofdPaneel.add(linkerPaneel);
		linkerPaneel.add(btnBlue);
		linkerPaneel.add(btnRed);
		linkerPaneel.add(btnGreen);
		hoofdPaneel.add(rechterPaneel);
		rechterPaneel.setVerticalAlignment(SwingConstants.CENTER);
		rechterPaneel.setHorizontalAlignment(SwingConstants.CENTER);

		btnRed.addActionListener(new FontHandler(Color.RED));
		btnGreen.addActionListener(new FontHandler(Color.GREEN));
		btnBlue.addActionListener(new FontHandler(Color.BLUE));

	}

	public class FontHandler implements ActionListener {

		private final Color Kleur;

		public FontHandler(Color Kleur) {
			this.Kleur = Kleur;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			woord = e.getActionCommand();
			rechterPaneel.setBackground(Kleur);
			rechterPaneel.setOpaque(true);
			rechterPaneel.setText(woord);

		}

	}

	public static void main(String[] args) {
		new Opdracht10_hans();

	}

}