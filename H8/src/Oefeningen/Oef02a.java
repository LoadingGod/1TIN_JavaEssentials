package Oefeningen;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Oef02a extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6073372069261168892L;
	private JPanel hoofdPaneel, nummerPaneel, callPaneel;
	private JTextField nummer;
	private JLabel callTxt;
	private JButton btnCall, btnCallOK;
	private JButton field1, field2, field3, field4, field5, field6, field7,
			field8, field9, field10, field11, field12;
	private JButton[] velden = { field1, field2, field3, field4, field5,
			field6, field7, field8, field9, field10, field11, field12 };
	private String[] tekens = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
			"*", "0", "#" };

	public Oef02a() {
		super("Telefoonkiezer");
		hoofdPaneel = new JPanel(new BorderLayout());
		nummerPaneel = new JPanel(new GridLayout(4, 3));
		callPaneel = new JPanel(new BorderLayout());
		callTxt = new JLabel("");
		callTxt.setHorizontalAlignment(SwingConstants.CENTER);
		btnCallOK = new JButton("OK");
		callPaneel.add(callTxt, BorderLayout.CENTER);
		callPaneel.add(btnCallOK, BorderLayout.SOUTH);
		add(hoofdPaneel);
		nummer = new JTextField("");
		btnCall = new JButton("Kies het gekozen nummer");
		hoofdPaneel.add(nummer, BorderLayout.NORTH);
		hoofdPaneel.add(nummerPaneel, BorderLayout.CENTER);
		hoofdPaneel.add(btnCall, BorderLayout.SOUTH);

		for (int i = 0; i < velden.length; i++) {
			velden[i] = new JButton(tekens[i]);
			nummerPaneel.add(velden[i]);
			velden[i].addActionListener(new ClickHandler());
		}

		btnCall.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nummerPaneel.setVisible(false);
				callTxt.setText("Het gekozen nummer " + nummer.getText()
						+ " wordt gebeld!");
				hoofdPaneel.add(callPaneel, BorderLayout.CENTER);

			}
		});
		
		btnCallOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				hoofdPaneel.remove(callPaneel);
				nummerPaneel.setVisible(true);

			}
		});
		setSize(350, 500);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Oef02a();
	}

	public class ClickHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String temp = ((JButton) e.getSource()).getText();
			if (temp.equals("*")) {
				nummer.setText(nummer.getText().substring(0,
						nummer.getText().length() - 1));
			} else if (temp.equals("#")) {
				nummer.setText("");
			} else {
				nummer.setText(nummer.getText() + temp);
			}

		}

	}

}