import javax.swing.*;

import java.awt.*;

public class Affinator {
	public static AffAbb abbildung;
	public static AffPanel panel;
	
	public static JTextField[] felder;
	
	public static void main (String[] args) {
		abbildung = new AffAbb(1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
		
		JFrame j = new JFrame(Spr.get("affinator"));
		j.setSize(800,620);
		
		felder = new JTextField[6];
		for (int i = 0; i < felder.length; i++)
			felder[i] = new JTextField(String.valueOf(i == 0 || i == 4 ? 1 : 0), 5);
			
		JPanel masterframe = new JPanel(new BorderLayout());
		panel = new AffPanel();
		masterframe.add(panel, BorderLayout.CENTER);
		
		JPanel controls = new JPanel(new GridLayout(3, 3));
		
		for (int i = 0; i < felder.length; i++)
			controls.add(felder[i]);
			
			
		controls.add(new MyButton());
		
			
		masterframe.add(controls, BorderLayout.EAST);
		
		j.add(masterframe);
		j.setVisible(true);
	}
}