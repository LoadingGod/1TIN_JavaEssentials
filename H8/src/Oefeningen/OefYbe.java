package Oefeningen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class OefYbe extends JFrame implements ActionListener {
	
		private JPanel inhoudsPaneel, onderPaneel, bovenpaneel, knoppaneel,
			dobbelpaneel;
	private JRadioButton blauw, rood;
	private JButton gooiknop;
	public String aap;
	private JButton[] vakje = new JButton[6];
	private Color kleur;

	OefYbe() {
		super("Dobbelsteen");
		inhoudsPaneel = new JPanel(new BorderLayout());
		add(inhoudsPaneel);
		bovenpaneel = new JPanel(new FlowLayout());
		blauw = new JRadioButton("blauw");
		rood = new JRadioButton("rood");
		gooiknop = new JButton("GOOI");
		onderPaneel = new JPanel(new GridLayout(0, 2));
		knoppaneel = new JPanel(new GridLayout(0, 2));
		dobbelpaneel = new JPanel(new GridLayout(2, 3, 50, 60));
		bovenpaneel.add(blauw);
		bovenpaneel.add(rood);
		knoppaneel.add(gooiknop);
		inhoudsPaneel.add(bovenpaneel, BorderLayout.NORTH);
		inhoudsPaneel.add(onderPaneel, BorderLayout.CENTER);
		onderPaneel.add(knoppaneel);
		onderPaneel.add(dobbelpaneel);
		blauw.addActionListener(new Kleurhandler());
		rood.addActionListener(new Kleurhandler());
		gooiknop.addActionListener(new GooiHandler());

		for (int i = 0; i < vakje.length; i++) {
			vakje[i] = new JButton();
			dobbelpaneel.add(vakje[i]);
			vakje[i].setEnabled(false);
			vakje[i].setBackground(Color.LIGHT_GRAY);
		}


		setSize(480, 200);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public class Kleurhandler implements ActionListener{ 
		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton knop = (JRadioButton) e.getSource();
			
			if (knop.isSelected() && knop.getText().equals("rood")){
				rood.setSelected(true);
				blauw.setSelected(false);
				kleur = Color.BLUE;
			}
			if (knop.isSelected() && knop.getText().equals("blauw")){
				blauw.setSelected(true);
				rood.setSelected(false);
				kleur = Color.RED;
			}
		}
	}

	public class GooiHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int random = (int) (1 + (7 - 1) * Math.random());
			for (int i = 0; i < random; i++) {
				vakje[i].setBackground(kleur);
			}
			
			for (int i = 5; i < random; i--) {
					vakje[i].setBackground(Color.LIGHT_GRAY);

			}
		}
			
		}

	public static void main(String[] args) {
		new OefYbe();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}