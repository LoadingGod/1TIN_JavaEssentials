package Voorbeelden;

import java.awt.*;
import javax.swing.*;

public class VbGridLayout extends JFrame {

	private JPanel inhoudsPaneel;
	private JButton btnOk, btnOpen, btnClose, btnWrite, btnCancel;

	public VbGridLayout() {
		super("GridLayout");

		inhoudsPaneel = new JPanel();
		inhoudsPaneel.setLayout(new GridLayout(2, 3, 4, 6));
		btnOk = new JButton("OK");
		btnOpen = new JButton("Open");
		btnClose = new JButton("Close");
		btnWrite = new JButton("Write");
		btnCancel = new JButton("Cancel");
		inhoudsPaneel.add(btnOk);
		inhoudsPaneel.add(btnOpen);
		inhoudsPaneel.add(btnClose);
		inhoudsPaneel.add(btnWrite);
		inhoudsPaneel.add(btnCancel);
	
		add(inhoudsPaneel);
		
		setSize(250, 150);
		setLocation(100, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		VbGridLayout voorb = new VbGridLayout();
	}
}