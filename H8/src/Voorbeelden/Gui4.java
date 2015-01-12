package Voorbeelden;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui4 extends JFrame {
	private JComboBox comboSelectie;
	private static final String [] opschriften={"links","rechts","boven","onder"};
	public Gui4() {
		

		comboSelectie = new JComboBox(opschriften);
		comboSelectie.addActionListener(new PrintHandler());
		
		add(comboSelectie);

		pack();
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	class PrintHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {	
			System.out.println(comboSelectie.getSelectedIndex() + 
					"\t" + opschriften[comboSelectie.getSelectedIndex()]);
		}
	}

	public static void main(String[] args) {
		new Gui4();
	}
}


