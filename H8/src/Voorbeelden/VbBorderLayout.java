package Voorbeelden;

import java.awt.*;
import javax.swing.*;

public class VbBorderLayout extends JFrame {

	private JPanel inhoudsPaneel;
	private JButton btnBoven, btnLinks, btnRechts, btnMidden, btnOnder;

	public VbBorderLayout() {
		super("BorderLayout");
		inhoudsPaneel = new JPanel(new BorderLayout());
		btnBoven = new JButton("Boven");
		btnLinks = new JButton("Links");
		btnMidden = new JButton("Midden");
		btnRechts = new JButton("Rechts");
		btnOnder = new JButton("Onder");
		inhoudsPaneel.add(btnBoven, BorderLayout.NORTH);
		inhoudsPaneel.add(btnLinks, BorderLayout.WEST);
		inhoudsPaneel.add(btnMidden, BorderLayout.CENTER);
		inhoudsPaneel.add(btnRechts, BorderLayout.EAST);
		inhoudsPaneel.add(btnOnder, BorderLayout.SOUTH);
		add(inhoudsPaneel);
		setSize(250, 150);
		setLocation(100, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		VbBorderLayout voorb = new VbBorderLayout();
	}
}
