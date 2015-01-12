package Voorbeelden;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VbFlowLayoutSwing extends JFrame {
	
	private JButton button1, button2, button3;
	
	public VbFlowLayoutSwing() {
		super("FlowLayoutSwing");
		setLayout(new FlowLayout(FlowLayout.LEFT,15,30));	
		button1 = new JButton("OK");
		button2 = new JButton("Open");
		button3 = new JButton("Close");
		add(button1);
		add(button2);
		add(button3);
		setSize(450,150);  
		setLocation(10,20);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main (String [ ] args){
		VbFlowLayoutSwing voorb= new VbFlowLayoutSwing();
	}
	
}
