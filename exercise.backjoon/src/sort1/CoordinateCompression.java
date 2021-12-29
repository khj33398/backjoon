package sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoordinateCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] list = new int[n];
		int [] result = new int[n];
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		first : for(int i=0; i<n; i++) {
			int tmp = sc.nextInt();
			list[i]=tmp;
			/*if(!list2.contains(tmp)) {
				list2.add(tmp);
			}*/
			if(i==0) {
				list2.add(tmp);
				continue first;
			}
			int min=0;
			int max=list2.size()-1;
			int key=(max+min)/2;
			for(int j=min; j<=max; j++) {
				if(list2.get(key)==tmp) {
					continue first;
				}else if(list2.get(key)>list[i]) {
					max=key-1;
					key=(max+min)/2;
				}else {
					min=key+1;
					key=(max+min)/2;
				}
			}
			list2.add(tmp);
			Collections.sort(list2);
		}
		
		/*
		for(int i=1; i<list2.size();i++) {
			int a = list2.get(i);
			int b = list2.get(i-1);
			if(a==b) {
				list2.remove(i);
				i--;
			}
		}
		
		for(int i=0;i<n;i++) {
			int idx = list2.indexOf(list[i]);
			result[i]=idx;
		}
		*/
		
		for(int i=0; i<n; i++) {
			int min=0;
			int max=list2.size()-1;
			int key=(max+min)/2;
			for(int j=min; j<=max; j++) {
				if(list2.get(key)==list[i]) {
					result[i]=key;
				}else if(list2.get(key)>list[i]) {
					max=key-1;
					key=(max+min)/2;
				}else {
					min=key+1;
					key=(max+min)/2;
				}
			}
		}
		
		for(int i : result) {
			System.out.print(i+" ");
		}
		
		sc.close();
	}

}
