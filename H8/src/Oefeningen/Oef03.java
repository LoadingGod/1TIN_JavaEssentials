package Oefeningen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Oef03 extends JFrame {

	private JPanel hoofdPaneel, bovenPaneel, onderPaneel, btnPaneel;
	private JButton[] buttons = new JButton[6];
	private JButton btnGooi;
	private JRadioButton rBtnRood, rBtnBlauw;
	private int random;
	private Color rBtnKleur = Color.BLUE;

	public Oef03() {
		super("Dobbelsteen");
		hoofdPaneel = new JPanel(new GridLayout(2, 1));
		hoofdPaneel.setBackground(Color.LIGHT_GRAY);
		bovenPaneel = new JPanel(new FlowLayout());
		bovenPaneel.setBackground(Color.LIGHT_GRAY);
		onderPaneel = new JPanel(new GridLayout(1, 2));
		onderPaneel.setBackground(Color.LIGHT_GRAY);
		btnPaneel = new JPanel(new GridLayout(3, 2));
		btnPaneel.setBackground(Color.LIGHT_GRAY);
		btnGooi = new JButton("GOOI");
		rBtnRood = new JRadioButton("Rood");
		rBtnBlauw = new JRadioButton("Blauw");
		add(hoofdPaneel);
		hoofdPaneel.add(bovenPaneel);
		hoofdPaneel.add(onderPaneel);
		bovenPaneel.add(rBtnBlauw);
		bovenPaneel.add(rBtnRood);
		onderPaneel.add(btnGooi);
		onderPaneel.add(btnPaneel);
		rBtnRood.setSelected(false);
		rBtnBlauw.setSelected(true);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("");
			btnPaneel.add(buttons[i]);
			buttons[i].setBorder(null);
			buttons[i].setOpaque(true);
			buttons[i].setBackground(Color.LIGHT_GRAY);
		}
		setSize(500, 250);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		btnGooi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				random = (int) (1 + (7 - 1) * Math.random());
				System.out.println(random);
				for (int i = 0; i < random; i++) {
					buttons[i].setBackground(rBtnKleur);
				}
				for (int i = 5; i >= random; i--) {
					buttons[i].setBackground(Color.LIGHT_GRAY);
				}

			}
		});
		rBtnRood.addActionListener(new ClickHandler(Color.RED));
		rBtnBlauw.addActionListener(new ClickHandler(Color.BLUE));
	}

	public static void main(String[] args) {
		new Oef03();
	}

	public class ClickHandler implements ActionListener {

		private final Color kleur;

		public ClickHandler(Color kleur) {
			this.kleur = kleur;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			rBtnKleur = kleur;
			if (e.getActionCommand().equals("Rood")) {
				rBtnBlauw.setSelected(false);
				rBtnRood.setSelected(true);
				;
			} else {
				rBtnRood.setSelected(false);
				rBtnBlauw.setSelected(true);
				;
			}

		}
	}
}
