package Oefeningen;

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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Opdracht07 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8272723305599352045L;
	private JPanel hoofdPaneel, linkerPaneel, middenPaneel, taalKnoppen,
			functieKnoppen;
	private JButton btnBold, btnItalic, btnPlain, btnExit, btnNederlands,
			btnFrans, btnItaliaans, btnEngels;
	private JTextField txtSouth;
	private JLabel groteLabel;
	private String taal, opmaakTekst;

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
		linkerPaneel.setBackground(Color.GRAY);
		linkerPaneel.setOpaque(true);
		functieKnoppen.setBackground(Color.GRAY);
		functieKnoppen.setOpaque(true);
		middenPaneel.setBackground(Color.GRAY);
		middenPaneel.setOpaque(true);
		taalKnoppen.setBackground(Color.GRAY);
		taalKnoppen.setOpaque(true);
		txtSouth.setBackground(Color.GRAY);
		txtSouth.setForeground(Color.BLACK);
		groteLabel = new JLabel("Goede morgen!");
		taal = "Nederlands";
		opmaakTekst = "BOLD";
		groteLabel.setVerticalAlignment(SwingConstants.CENTER);
		groteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		groteLabel.setBackground(Color.DARK_GRAY);
		groteLabel.setForeground(Color.WHITE);
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
				taal = e.getActionCommand();
				updateTextVeld();
			}
		});
		
		btnFrans.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				groteLabel.setText("Bonjour!");
				taal = e.getActionCommand();
				updateTextVeld();
			}
		});
		
		btnItaliaans.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				groteLabel.setText("Bongiorno!");
				taal = e.getActionCommand();
				updateTextVeld();
			}
		});
		
		btnEngels.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				groteLabel.setText("Good morning!");
				taal = e.getActionCommand();
				updateTextVeld();
			}
		});
		
		btnExit.addActionListener(new ExitHandler());
	}

	public static void main(String[] args) {
		new Opdracht07();
	}
	
	private void updateTextVeld() {
		txtSouth.setText(taal + " "+ opmaakTekst);
	}

	public class FontHandler implements ActionListener {

		private final int STIJL;

		public FontHandler(int stijl) {
			this.STIJL = stijl;
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			groteLabel.setFont(groteLabel.getFont().deriveFont(STIJL));
            opmaakTekst = e.getActionCommand();
            updateTextVeld();
		}

	}
	
	public class ExitHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Opdracht07.this.dispose();
			
		}
		
	}

}
