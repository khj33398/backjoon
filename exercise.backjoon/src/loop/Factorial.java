package loop;

import java.util.Scanner;

public class Factorial {
//팩토리얼은 n이 0일 때 1이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int multi=1;
		for(int i=2; i<=n; i++) {
			multi *=i;
		}
		System.out.println(multi);
		sc.close();
	}

}
