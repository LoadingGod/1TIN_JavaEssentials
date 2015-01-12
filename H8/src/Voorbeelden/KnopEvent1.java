package Voorbeelden;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

class KnopEvent1 extends JFrame implements ActionListener {

	private JLabel label;
	private JButton upper, lower;
	private JTextArea field;
	private JPanel panel, inhoudsPaneel;

	public KnopEvent1() {
		super("voorbeeld knoppenevents");
		inhoudsPaneel = new JPanel(new BorderLayout());
		add(inhoudsPaneel);
		setLocation(100, 200);
		// componenten
		label = new JLabel("to Lower/Uppercase");
		field = new JTextArea(5, 40);
		upper = new JButton("to uppercase");

		upper.addActionListener(this);

		lower = new JButton("to lowercase");

		lower.addActionListener(this);

		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(upper);
		panel.add(lower);
		add(label, BorderLayout.NORTH);
		add(field, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pack();
		setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	// methods bij de ActionListener
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == upper) {
			field.setText(field.getText().toUpperCase());
		} else {
			if (e.getSource() == lower) {
				field.setText(field.getText().toLowerCase());
			}
		}
	}

	public static void main(String[] args) {
		KnopEvent1 start = new KnopEvent1();
		
	}

}
