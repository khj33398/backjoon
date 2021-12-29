package sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortForAge {
	public static class Join{
		int joinorder;
		int age;
		String name =null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList <Join> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			Join join = new Join();
			String [] str = sc.nextLine().split(" ");
			join.joinorder=i+1;
			join.age=Integer.parseInt(str[0]);
			join.name = str[1];
			list.add(join);
		}
		
		Collections.sort(list, new Comparator<Join>() {
			@Override
			public int compare(Join o1, Join o2) {
				if(o1.age==o2.age) {
					return o1.joinorder-o2.joinorder;
				}else {
					return o1.age-o2.age;
				}
			}
		});
		
		for(Join tmp : list) {
			System.out.println(tmp.age+" "+tmp.name);
		}
		sc.close();
	}
	
}
