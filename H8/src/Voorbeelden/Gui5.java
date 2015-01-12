package Voorbeelden;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Gui5 extends JFrame {
	private JComboBox comboSelectie;
	private static final String[] opschriften = { "links", "rechts", "boven",
			"onder" };

	public Gui5() {

		comboSelectie = new JComboBox(opschriften);
		comboSelectie.addItemListener(new PrintHandler());

		add(comboSelectie);

		pack();
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	class PrintHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == e.SELECTED) {
				System.out.println("SELECTED "
						+ opschriften[comboSelectie.getSelectedIndex()]);
			} else if (e.getStateChange() == e.DESELECTED) {
				System.out.println("DESELECTED "
						+ opschriften[comboSelectie.getSelectedIndex()]);
			}
		}
	}

	public static void main(String[] args) {
		new Gui5();
	}
}
