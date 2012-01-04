import javax.swing.*;
import java.awt.*;

public class AffPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		Point vxs, vxe, vys, vye;

		vxs = new Point((int)(Affinator.abbildung.getXfor(0, 0) * 100 + 300), (int)(-Affinator.abbildung.getYfor(0, 0) * 100 + 300));
		vxe = new Point((int)(Affinator.abbildung.getXfor(1, 0) * 100 + 300), (int)(-Affinator.abbildung.getYfor(1, 0) * 100 + 300));

		vye = new Point((int)(Affinator.abbildung.getXfor(0, 1) * 100 + 300), (int)(-Affinator.abbildung.getYfor(0, 1) * 100 + 300));



		g.setColor(new Color(230, 230, 230));
		g.fillRect(0, 0, getWidth(), getHeight());




		g.setColor(Color.BLACK);
		g.drawLine(0, 300, 600, 300);
		g.drawLine(300, 0, 300, 600);


		for (int i = 0; i < 7; i++) {
			g.drawLine(i * 100, 290, i * 100, 310);
			g.drawLine(290, i * 100, 310, i * 100);
		}


		g.setColor(new Color(204, 0, 0));
		g.drawLine(vxs.x, vxs.y, vxe.x, vxe.y);

		g.fillRect(vxe.x - 2, vxe.y - 2, 5, 5);

		g.setColor(new Color(0, 0, 153));
		g.drawLine(vxs.x, vxs.y, vye.x, vye.y);

		g.fillRect(vye.x - 2, vye.y - 2, 5, 5);
	}
}