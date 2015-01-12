package Voorbeelden;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui2 extends JFrame{
	private JTextArea txtInvoer;
	private JButton btnPrint;
	private JRadioButton rdbUpper, rdbLower;
	
	
	public Gui2() {
		setLayout(new BorderLayout());
		txtInvoer=new JTextArea(5,20);
		add(txtInvoer,BorderLayout.CENTER);
		btnPrint=new JButton("print");
		btnPrint.addActionListener(new PrintHandler());
		add(btnPrint, BorderLayout.EAST);
		
		JPanel pnlRadioButtons=new JPanel();
		pnlRadioButtons.setLayout(new GridLayout(1,2));
		ButtonGroup bg=new ButtonGroup();
		rdbUpper=new JRadioButton("uppercase");
		rdbUpper.setSelected(true);
		bg.add(rdbUpper);
		pnlRadioButtons.add(rdbUpper);
		rdbLower=new JRadioButton("lowercase");
		bg.add(rdbLower);
		pnlRadioButtons.add(rdbLower);
		
		add(pnlRadioButtons, BorderLayout.SOUTH);
		
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	class PrintHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(rdbLower.isSelected())
				System.out.println(txtInvoer.getText().toLowerCase());
			else
				System.out.println(txtInvoer.getText().toUpperCase());
		}
		
		
	}
	
	public static void main(String[] args) {
		new Gui2();
	}
}
