package Voorbeelden;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Gui {
	private JFrame frameToepassing;
	private JButton btnToon;
	private JTextField txtInput;

	public Gui() {
		frameToepassing = new JFrame("Voorbeeld2");
		frameToepassing.setLayout(new BorderLayout());
		btnToon = new JButton("Toon");
		btnToon.addActionListener(new ButtonHandler());
		frameToepassing.add(btnToon, BorderLayout.WEST);
		txtInput = new JTextField(20);
		frameToepassing.add(txtInput, BorderLayout.CENTER);

		frameToepassing.pack();
		frameToepassing.setVisible(true);
		frameToepassing.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(txtInput.getText());

		}

	}

	public static void main(String[] args) {
		new Gui();
	}
}
