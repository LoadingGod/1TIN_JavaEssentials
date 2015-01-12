package Voorbeelden;

import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Frame;

public class VbFlowLayout extends Frame {
	
	private Button button1, button2, button3;
	
	public VbFlowLayout() {
		super("FlowLayout");
		//met welke me;thod kan je de titel van het frame ook nog instellen?
		setLayout(new FlowLayout(FlowLayout.LEFT,15,30));	
		//Wat is de betekenis van 15 en 30?
		button1 = new Button("OK");
		button2 = new Button("Open");
		button3 = new Button("Close");
		add(button1);
		add(button3);
		add(button2);
		//In welke volgorde worden de buttons toegevoegd?
		setSize(450,150);  
		setLocation(10,20);
		setVisible(true);
		//setDefaultCloseOperation(DISPOSE_ON_CLOSE); waarom kan dit niet?
	}
	
	public static void main (String [ ] args){
		VbFlowLayout voorb= new VbFlowLayout();
	}
	
}
