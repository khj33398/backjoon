package loop;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonachi_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println(0);
		}else if(n==1) {
			System.out.println(1);
		}else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(0);
			list.add(1);
			for(int i=2; i<n+1;i++) {
				int tmp = list.get(i-2)+list.get(i-1);
				list.add(tmp);
			}
			System.out.println(list.get(list.size()-1));
		}
		
		sc.close();
	}

}
