package Voorbeelden;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui3 extends JFrame {
	private JCheckBox[] chkBoxes;
	private JButton btnPrint;
	private static final int aantalChkBoxes = 5;

	public Gui3() {
		setLayout(new GridLayout(2, 1));

		JPanel pnlBoven = new JPanel();

		pnlBoven.setLayout(new GridLayout(1, aantalChkBoxes));
		chkBoxes = new JCheckBox[aantalChkBoxes];
		for (int i = 0; i < aantalChkBoxes; i++) {
			chkBoxes[i] = new JCheckBox("" + (char) ('A' + i));
			pnlBoven.add(chkBoxes[i]);
		}
		add(pnlBoven);
		btnPrint = new JButton("print");
		btnPrint.addActionListener(new PrintHandler());
		add(btnPrint);

		pack();
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	class PrintHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = "";
			for (int i = 0; i < aantalChkBoxes; i++) {
				if (chkBoxes[i].isSelected()) {
					s += chkBoxes[i].getActionCommand();
				}
			}
			System.out.println(s);

		}
	}

	public static void main(String[] args) {
		new Gui3();
	}
}
