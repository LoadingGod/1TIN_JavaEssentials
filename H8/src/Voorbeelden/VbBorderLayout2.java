package Voorbeelden;

import java.awt.*;

import javax.swing.*;

public class VbBorderLayout2 extends JFrame {
	
	private JButton btnBoven, btnLinks, btnRechts, btnMidden, btnOnder; 
	
	public VbBorderLayout2() {
		super("BorderLayout ");	//standaard layoutmanager?
		btnBoven = new JButton("Boven");
		btnLinks = new JButton("Links");
		btnMidden = new JButton("Midden");
		btnRechts = new JButton("Rechts");
		btnOnder = new JButton("Onder");

		add(btnBoven, BorderLayout.NORTH);
		add(btnLinks, BorderLayout.WEST);
		add(btnMidden, BorderLayout.CENTER);
		add(btnRechts, BorderLayout.EAST);
		add(btnOnder, BorderLayout.SOUTH);

		setSize(250,150);
		setLocation(100,200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main (String [ ]args) {
		VbBorderLayout voorb= new VbBorderLayout();
	}
	
}
