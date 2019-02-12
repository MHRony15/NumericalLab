package method;

public class Secant {
	public static double x00;
	public static double x0;
	public static double x;
	final static double TOLLARENCE = 0.001;
	
	public static double f(double x) {
		return x*x*x-2*x-5;
	}
	public static double xi(double a, double b) {
		return (a*f(b)-b*f(a))/(f(b)-f(a));
	}
	
	public static boolean comp(double a,double b) {
		if(f(a)*f(b)<0) return true;
		return false;
	}
	
	public static void main(String[] args) {
		while(true) {
			if(comp(x00,x0)) {
				break;
			}
			else if(comp(-x00,x0)) {
				x00=-x00;
				break;
			}
			else if(comp(-x00,-x0)) {
				x00=-x00;
				x0=-x0;
				break;
			}
			else {
				x0++;
				x0++;
			}
		}
		while(Math.abs(x00-x0)>=TOLLARENCE) {
			x=xi(x00,x0);
			x00=x0;
			x0=x;
		}
		
		System.out.printf("Approximation Root is: %.4f ",x);

	}

}
