package standardmath2;

import java.util.ArrayList;
import java.util.Scanner;
//쓰지마랏,,, 시간 초과
public class Sosu4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int cnt=0;
		
		for(int i = m; i<n+1; i++) {
			if(i==2) {
				result.add(i);
			}else if(i>2 && i%2!=0) {
				list.add(i);
			}
		}
		for(int i=3; i<n/2+1; i++) {
			if(i%2==0) {i++;}
			for(int j=0; j<list.size(); j++) {
				int tmp = list.get(j);
				if(tmp==i) {
					result.add(i);
				}else if(tmp%i!=0) {
					list2.add(tmp);
				}
			}
			list = new ArrayList<Integer>(list2);
			list2.clear();
		}
		result.addAll(list);
		list.clear();
		
		for(int i : result) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
