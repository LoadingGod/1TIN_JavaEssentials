package Voorbeelden;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Gui6 extends JFrame {

	public Gui6() {

		addWindowListener(new SchermHandler());
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class SchermHandler implements WindowListener {
		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("windowopened");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowclosing");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("windowclosed");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("windowiconified");

		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("windowdeiconified");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("windowactivated");

		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowdeactivated");

		}

	}

	public static void main(String[] args) {
		new Gui6();
	}
}
