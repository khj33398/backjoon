package sort1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SortNumber2 {
	private static int [] tmp;
	
	private static void merge_sort(int [] ar, int left, int right) {
		if(left==right) {
			return;
		}
		int mid = (left+right)/2;
		
		merge_sort(ar, left, mid);
		merge_sort(ar, mid+1, right);
		
		merge(ar, left, mid, right);
	}
	
	private static void merge(int[] ar, int left, int mid, int right) {
		int l=left;
		int r=mid+1;
		int idx=left;
		
		while(l<=mid && r<=right) {
			if(ar[l]<ar[r]) {
				tmp[idx]=ar[l];
				l++;
			}else {
				tmp[idx]=ar[r];
				r++;
			}
			idx++;
		}
		if(l>mid && r<=right) {
			while(r<=right) {
				tmp[idx]=ar[r];
				r++;
				idx++;
			}
		}else if(r>right && l<=mid) {
			while(l<=mid) {
				tmp[idx]=ar[l];
				l++;
				idx++;
			}
		}
		for(int i=left; i<=right; i++) {
			ar[i]=tmp[i];
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] ar = new int[n];
		tmp = new int[n];
		
		for(int i=0; i<n; i++) {
			ar[i]=Integer.parseInt(br.readLine());
		}

		merge_sort(ar, 0, n-1);
		
		for(int i : ar) {
			bw.write(i+"");
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
