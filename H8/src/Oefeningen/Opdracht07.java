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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

public class Opdracht07 extends JFrame {

	private JPanel hoofdPaneel, linkerPaneel, middenPaneel, taalKnoppen,
			functieKnoppen;
	private JButton btnBold, btnItalic, btnPlain, btnExit, btnNederlands,
			btnFrans, btnItaliaans, btnEngels;
	private JTextField txtSouth;
	private JLabel groteLabel;

	public Opdracht07() {
		super("Mini Travel Program");
		hoofdPaneel = new JPanel(new BorderLayout());
		linkerPaneel = new JPanel(new BorderLayout());
		middenPaneel = new JPanel(new BorderLayout());
		taalKnoppen = new JPanel(new GridLayout(2, 2));
		functieKnoppen = new JPanel(new BorderLayout());
		txtSouth = new JTextField("Dit is een tekstveld...");
		add(hoofdPaneel);
		hoofdPaneel.add(linkerPaneel, BorderLayout.WEST);
		hoofdPaneel.add(middenPaneel, BorderLayout.CENTER);
		hoofdPaneel.add(txtSouth, BorderLayout.SOUTH);
		linkerPaneel.setBackground(Color.BLACK);
		linkerPaneel.setOpaque(true);
		functieKnoppen.setBackground(Color.BLACK);
		functieKnoppen.setOpaque(true);
		middenPaneel.setBackground(Color.BLACK);
		middenPaneel.setOpaque(true);
		taalKnoppen.setBackground(Color.BLACK);
		taalKnoppen.setOpaque(true);
		txtSouth.setBackground(Color.BLACK);
		txtSouth.setForeground(Color.PINK);
		groteLabel = new JLabel("Goede morgen!");
		groteLabel.setVerticalAlignment(SwingConstants.CENTER);
		groteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		groteLabel.setBackground(Color.BLACK);
		groteLabel.setForeground(Color.PINK);
		groteLabel.setOpaque(true);
		btnBold = new JButton("Bold");
		btnItalic = new JButton("Italic");
		btnPlain = new JButton("Plain");
		btnNederlands = new JButton("Nederlands");
		btnFrans = new JButton("Frans");
		btnItaliaans = new JButton("Italiaans");
		btnEngels = new JButton("Engels");
		btnExit = new JButton("Exit");
		taalKnoppen.add(btnNederlands);
		taalKnoppen.add(btnFrans);
		taalKnoppen.add(btnItaliaans);
		taalKnoppen.add(btnEngels);
		middenPaneel.add(groteLabel, BorderLayout.CENTER);
		middenPaneel.add(taalKnoppen, BorderLayout.SOUTH);
		linkerPaneel.add(functieKnoppen, BorderLayout.NORTH);
		functieKnoppen.add(btnBold, BorderLayout.NORTH);
		functieKnoppen.add(btnItalic, BorderLayout.CENTER);
		functieKnoppen.add(btnPlain, BorderLayout.SOUTH);
		linkerPaneel.add(btnExit, BorderLayout.SOUTH);
		setSize(480, 360);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		btnBold.addActionListener(new FontHandler(Font.BOLD));
		btnItalic.addActionListener(new FontHandler(Font.ITALIC));
		btnPlain.addActionListener(new FontHandler(Font.PLAIN));
		btnNederlands.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				groteLabel.setText("Goede morgen!");
			}
		});
		
		btnFrans.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				groteLabel.setText("Bonjour!");
				
			}
		});
		
		btnItaliaans.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				groteLabel.setText("Bongiorno!");
				
			}
		});
		
		btnEngels.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				groteLabel.setText("Good morning!");
				
			}
		});
		
		btnExit.addActionListener(new ExitHandler());
	}

	public static void main(String[] args) {
		new Opdracht07();
	}

	public class FontHandler implements ActionListener {

		private final int STIJL;

		public FontHandler(int stijl) {
			this.STIJL = stijl;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			groteLabel.setFont(groteLabel.getFont().deriveFont(STIJL));

		}

	}
	
	public class ExitHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Opdracht07.this.dispose();
			
		}
		
	}

}
