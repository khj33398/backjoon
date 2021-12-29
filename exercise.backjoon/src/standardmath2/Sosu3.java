package standardmath2;

import java.util.Scanner;

public class Sosu3 {
//소수 제출용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=m; i<n+1; i++) {
			if(i==1) {
				continue;
			}
			int j=0;
			for(j=2; j<=(int)Math.sqrt(i)+1; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j || j==(int)Math.sqrt(i)+2) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
