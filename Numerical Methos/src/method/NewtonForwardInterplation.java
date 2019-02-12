package method;

import java.util.Scanner;

public class NewtonForwardInterplation {
	public static int i,n,t=0;
	public static double value,p,result= 0.0;
	
	public static double fact(int i2) {
		if(i2==1 || i2==0) return 1;
		return i2*fact(i2-1);
	}
	public static double findP(double p2, int i2) {
		if(i2<1)return 1.0;
		if(i2<2)return p2;
		return (p2+i2-1)*findP(p2,i2-1);
	}
	public static double[][] Dell(double[][] dell) {
		for(i=0;i<dell[t-1].length-1;i++)
			dell[t][i]=dell[t-i][i+1]-dell[t-1][i];
			t++;
			if(t<n) Dell(dell);
		return dell;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of point :");
		n =sc.nextInt();
		double x[] = new double[n];
		double y[] = new double[n];
		double dell[][] = new double[n][n];
		System.out.println("Enter the points :");
		for(i=0;i<n;i++) {
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();
			dell[t][i]=y[i];
			
		}
		t++;
		dell =Dell(dell);
		System.out.println("Enter The Value of x: ");
		value = sc.nextDouble();
		p=(value-dell[0][0])/(x[1]-x[0]);
		for(i=0;i<n;i++) {
			result = result + dell[i][0]*findP(p,i)/fact(i);
		}
		System.out.println("The Value of f(x) is: " + result);

	}

}
