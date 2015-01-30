package extra01;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class oef extends JFrame {

	private JPanel basicFrame;
	private JPanel cPanel, nPanel;
	private JButton[] btnArray = new JButton[25];
	private JLabel[] labArray = new JLabel[5];
	private String[] slogan = { "Fast", "Hot", "New", "Trendy", "Easy" };
	private int random;

	public oef() {
		super("Java is...");
		basicFrame = new JPanel(new BorderLayout());
		nPanel = new JPanel(new GridLayout(1, 5));
		cPanel = new JPanel(new GridLayout(5, 5, 10, 10));
		for (JButton temp : btnArray) {
			random = (int) (1 + (5 - 1) * Math.random());
			temp = new JButton(slogan[random]);
			cPanel.add(temp);
		}
		for (int i = 0; i < labArray.length; i++) {
			labArray[i] = new JLabel(slogan[i]);
			nPanel.add(labArray[i]);
			nPanel.setAlignmentX(CENTER_ALIGNMENT);
		}
		add(basicFrame);
		basicFrame.add(cPanel, BorderLayout.CENTER);
		
		basicFrame.add(nPanel, BorderLayout.NORTH);
		
		setVisible(true);
		setSize(550, 500);
		setLocation(100, 100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new oef();
	}
}
