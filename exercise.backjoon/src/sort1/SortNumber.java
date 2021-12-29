package sort1;
import java.util.ArrayList;
import java.util.Scanner;

public class SortNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		
		while(n>0) {
			int a = sc.nextInt();
			int i = list.size();
			if(i==0) {
				list.add(a);
				n--;
				continue;
			}
			if(a>list.get(i-1)) {
				list.add(a);
			}else if(a<list.get(i-1)) {
				if(i-1==0) {
					list.add(0, a);
					n--;
					continue;
				}
				do {
					i--;
				} while (i-1>0 && a<list.get(i-1));
				if(a>list.get(i-1)) {
					list.add(i, a);
				}else if(i-1==0) {
					list.add(0, a);
				}
			}
			n--;	
		}
		
		for(int i : list) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
