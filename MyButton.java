import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class MyButton extends JButton implements ActionListener {
	public MyButton () {
		super(Spr.get("setzen"));
		
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		double a = Double.parseDouble(Affinator.felder[0].getText());
		double b = Double.parseDouble(Affinator.felder[1].getText());
		double c = Double.parseDouble(Affinator.felder[3].getText());
		double d = Double.parseDouble(Affinator.felder[4].getText());
		double e = Double.parseDouble(Affinator.felder[2].getText());
		double f = Double.parseDouble(Affinator.felder[5].getText());	
		
		Affinator.abbildung = new AffAbb(a, b, c, d, e, f);
		
		Affinator.panel.repaint();
	}
}