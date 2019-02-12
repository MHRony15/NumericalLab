package method;

import java.util.Scanner;

public class NewtonRaphson {
	final static double TOLLARANCE = 0.001;
	public  double  f(double x) {
		return x*x*x - 2*x -5; 
	}
	public double fd(double x) {
		return 3*(x*x)-2;
	}
	public void newtonRaphson(double x) {
		double h;
		h = f(x)/fd(x);
		while(Math.abs(h)>=TOLLARANCE) {
			h = f(x)/fd(x);
			x=x-h;
		}
		System.out.printf("The value of ROOT is %.4f",x);
	}

	public static void main(String[] args) {
		NewtonRaphson nr = new NewtonRaphson();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first assumed value :");
		double x0=sc.nextDouble();
		nr.newtonRaphson(x0);
		

	}

}
