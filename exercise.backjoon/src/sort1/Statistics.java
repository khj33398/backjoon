package sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {
	public static class Most{
		int data;
		int cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int avg=0;
		int middle=0;
		int mtv=0;
		int cha=0;
		double dtmp=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Most> most = new ArrayList<Most>();
		
		for(int i=0; i<n; i++) {
			int tmp = sc.nextInt();
			avg+=tmp;
			list.add(tmp);
		}
		
		if(avg<0) {
			dtmp = (double)avg/n - 0.5;
		}else {
			dtmp = (double)avg/n + 0.5;
		}
		avg = (int)dtmp;
		
		Collections.sort(list);
		middle = list.get(n/2);
		cha = list.get(n-1)-list.get(0);
		
		for(int i=0; i<n; i++) {
			int cnt=0;
			int value = list.get(i);
			while(i<n && value==list.get(i)) {
				cnt++;
				i++;
			}
			i--;
			Most tmp = new Most();
			tmp.data=value;
			tmp.cnt = cnt;
			if(most.size()==0 || cnt==most.get(0).cnt) {
				most.add(tmp);
			}else if(cnt > most.get(0).cnt) {
				most.clear();
				most.add(tmp);
			}
		}
		
		if(most.size()==1) {
			mtv=most.get(0).data;
		}else {
			mtv = most.get(1).data;
		}
		
		System.out.println(avg);
		System.out.println(middle);
		System.out.println(mtv);
		System.out.println(cha);
		
		sc.close();
	}
}