package standardmath2;

import java.util.ArrayList;
import java.util.Scanner;

public class Terat {
//https://st-lab.tistory.com/90
//거리를 원으로 보고 사고하도록,,
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			if(x1==x2 && y1==y2 && r1==r2) {
				list.add(-1);
			}else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))>r1+r2) {
				list.add(0);
			}else if((r1-r2)*(r1-r2)>(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)) {
				list.add(0);
			}else if((r1-r2)*(r1-r2)==(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)) {
				list.add(1);
			}else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))==r1+r2) {
				list.add(1);
			}else {
				list.add(2);
			}
		}
		
		for(int i : list) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
