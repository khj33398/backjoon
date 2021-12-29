package standardmath2;

import java.util.Scanner;
//알고리즘 기억 -> 택시 기하학에서 원의 넓이는 2r^2 (2x^2 = (2r)^2)
public class Taxi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		double uc = r*r*Math.PI;
		double tx = 2*r*r;
		
		System.out.printf("%1.6f\n",uc);
		System.out.printf("%1.6f",tx);
		sc.close();
	}

}
