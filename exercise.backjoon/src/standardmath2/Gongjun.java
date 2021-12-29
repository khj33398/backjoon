package standardmath2;

import java.util.ArrayList;
import java.util.Scanner;

public class Gongjun {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			int cnt=0;
			for(int i=n+1; i<2*n+1; i++) {
				int tmp = (int)Math.sqrt(i);
				int j=0;
				for(j=2; j<tmp+1; j++) {
					if(i%j==0) {
						break;
					}
				}
				if(i==j || j==tmp+1) {
					cnt++;
				}
			}
			list.add(cnt);
		}
		for(int i : list) {
			System.out.println(i);
		}
	}
}
