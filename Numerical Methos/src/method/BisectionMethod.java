package method;

public class BisectionMethod {
	final static double TOLLARANCE = 0.001;
	
	public  double  f(double x) {
		return x*x*x - 2*x -5; 
	}
	public boolean comp(double a,double b) {
		if(f(a)*f(b)<0) return true;
		return false;
	}
	
	 public void Bisection() {
		 double a = 0;
		 double b = 0;
		 while(true) {
				if(comp(a,b)) break;
				else if (comp(-a,b)) {
					a = -a;
					break;
				}
				/*else if (comp(a,-b)) {
					b=-b;
					break;
				}*/
				else if (comp(-a,-b)) {
					a = -a;
					b = -b;
					break;
				}
				else {
					a++;
					b++;
				}
			}
		 
		System.out.printf("a : %.4f b: %.4f ",a,b);
		double c =a;
		while((Math.abs(b-a))>=TOLLARANCE) {
			c = (a+b)/2;
			if(f(c)== 0.0) {
				break;
			}
			else if(f(c)*f(a)<0) {
				b = c;
			}
			else {
				a=c;
			}
		}
		System.out.printf("The value of Root is : %.4f",c);
	}

	public static void main(String[] args) {
		
		
		BisectionMethod bm = new BisectionMethod();
		bm.Bisection();

	}

}
