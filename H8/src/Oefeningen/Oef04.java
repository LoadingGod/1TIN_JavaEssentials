package Oefeningen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Oef04 extends JFrame{
	
	private JPanel hoofdPaneel, linkerPaneel, rechterPaneel;
	private JButton btnBewerk, btnBoven, btnMidden, btnOnder;
	private JTextField tekstVeld;
	private JButton btnActive;
	
	public Oef04() {
		super("Message App");
		hoofdPaneel = new JPanel(new GridLayout());
		add(hoofdPaneel);		
		linkerPaneel = new JPanel(new GridLayout(3,1));
		rechterPaneel = new JPanel(new BorderLayout());
		btnBewerk = new JButton("Bewerk");
		btnBoven = new JButton("Hey, vergeet je boodschappen niet?");
		btnMidden = new JButton("Kom je zaterdag ook?");
		btnOnder = new JButton("Karel vroeg je of nog tijd had dit weekend.");
		tekstVeld = new JTextField();
		hoofdPaneel.add(linkerPaneel);
		hoofdPaneel.add(rechterPaneel);
		linkerPaneel.add(btnBoven);
		linkerPaneel.add(btnMidden);
		linkerPaneel.add(btnOnder);
		rechterPaneel.add(tekstVeld, BorderLayout.CENTER);
		rechterPaneel.add(btnBewerk, BorderLayout.SOUTH);
		setSize(600,250);
		setLocation(100,100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		btnBewerk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnActive.setText(tekstVeld.getText());
				
			}
		});	
		btnBoven.addActionListener(new ClickHandler());
		btnMidden.addActionListener(new ClickHandler());
		btnOnder.addActionListener(new ClickHandler());
	}
	
	public class ClickHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			tekstVeld.setText(e.getActionCommand());
			btnActive = (JButton) e.getSource();
			
		}
	}
	
	public static void main(String[] args) {
		new Oef04();
	}

}
