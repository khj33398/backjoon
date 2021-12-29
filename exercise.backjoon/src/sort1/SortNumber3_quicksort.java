package sort1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SortNumber3_quicksort {
	//퀵 소트를 사용한 오름차순 정렬 -> 메모리 // 시간복잡도 줄이기 위해선 합병정렬 사용 -> collections.sort가 합병정렬 구현하고 있음
	//시간 초과 해결 필요 -> 힙 소트 해보실?
	public static void quick_sort(int[] ar, int start, int end) {
		if(start>=end) {
			return;
		}
		
		int pivot = start;
		int l = start+1;
		int r = end;
		
		while(l<r) {
			while(l<end && ar[l]<=ar[pivot]) {l++;}
			while(r>start && ar[r]>ar[pivot]) {r--;}
			if(l>r) {
				int tmp = ar[pivot];
				ar[pivot]=ar[r];
				ar[r] = tmp;
				break;
			}else {
				int tmp = ar[l];
				ar[l] = ar[r];
				ar[r] = tmp;
			}
		}
		quick_sort(ar, start, r-1);
		quick_sort(ar, r+1, end);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int [] ar = new int[n];
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		quick_sort(ar, 0, n-1);
		
		for(int i: ar) {
			bw.write(i+"");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		bw.close();

	}

}
