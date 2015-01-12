package Voorbeelden;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KnopEvent2 extends JFrame { 
	
	private JLabel label;
	private JButton upper,lower;
	private JTextArea field;
	private JPanel panel, inhoudsPaneel;

	public KnopEvent2 () {
		super ("voorbeeld knoppenevents");
		inhoudsPaneel=new JPanel(new BorderLayout());
		add(inhoudsPaneel);
		setSize(250,150);
		setLocation(100,200);
		// componenten
		label=new JLabel("to Lower/Uppercase");
		field=new JTextArea(5,40);
		upper=new JButton("to uppercase");

		upper.addActionListener(new UpperHandler());

		lower=new JButton("to lowercase");

		lower.addActionListener(new LowerHandler());

		panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(upper);
		panel.add(lower);
		add(label, BorderLayout.NORTH);
		add(field, BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH); 

		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	// innerclass voor upper
	public class UpperHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			field.setText(field.getText().toUpperCase());
		}
	}	
	
	// innerclass voor lower
		public class LowerHandler implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				field.setText(field.getText().toLowerCase());
			}
		}	

	public static void main (String [] args) {
		KnopEvent2 start=new KnopEvent2();
	}
	
}
