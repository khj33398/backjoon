package standardmath2;

import java.util.Scanner;

public class Soinsu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int is=2;
		while(n!=1) {
			if(n%is==0) {
				System.out.println(is);
				n /= is;
			}else {
				is++;
			}
		}
		sc.close();
	}
}
