public class AffAbb {
	private double a, b, c, d, e, f;

	public AffAbb(double g, double h, double i, double j, double k, double l) {
		a = g;
		b = h;
		c = i;
		d = j;
		e = k;
		f = l;
	}

	public double getXfor(double x, double y) {
		return a * x + b * y + e;
	}

	public double getYfor(double x, double y) {
		return c * x + d * y + f;
	}
}