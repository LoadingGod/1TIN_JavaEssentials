package H8_Oef01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_KMMI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6304268686887218025L;
	private JPanel hoofdPaneel, linkerPaneel, rechterPaneel;
	private JButton btnConvert;
	private JLabel lbBoven, lbMidden, lbOnder, lbMiles;
	private JTextField tfKilometers;

	public GUI_KMMI() {
		super("Kilometer to miles conversion!");
		hoofdPaneel = new JPanel(new GridLayout(1, 2));
		linkerPaneel = new JPanel(new BorderLayout());
		rechterPaneel = new JPanel(new BorderLayout());
		lbBoven = new JLabel("Kilometer(s):");
		lbMidden = new JLabel("Mile(s):");
		lbOnder = new JLabel("Made by ");
		lbMiles = new JLabel("0");
		tfKilometers = new JTextField();
		btnConvert = new JButton("Convert");
		linkerPaneel.add(lbBoven, BorderLayout.NORTH);
		linkerPaneel.add(lbMidden, BorderLayout.CENTER);
		linkerPaneel.add(lbOnder, BorderLayout.SOUTH);
		rechterPaneel.add(tfKilometers, BorderLayout.NORTH);
		rechterPaneel.add(lbMiles, BorderLayout.CENTER);
		rechterPaneel.add(btnConvert, BorderLayout.SOUTH);
		add(hoofdPaneel);
		hoofdPaneel.add(linkerPaneel);
		hoofdPaneel.add(rechterPaneel);
		JFrame frame = new JFrame();
		Object result = JOptionPane.showInputDialog(hoofdPaneel,
				"Enter your name");
		lbOnder.setText("Made by " + result);
		setVisible(true);
		setSize(250, 100);
		setLocation(100, 100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		btnConvert.addActionListener(new ConversionHandler());
		tfKilometers.addActionListener(new ConversionHandler());
	}

	public class ConversionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			lbMiles.setText(((int)(Double.parseDouble(tfKilometers.getText()) * 0.62137 * 1000.0) / 1000.0) + "");
		}

	}

	public static void main(String[] args) {
		new GUI_KMMI();
	}

}
