package sort1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class CoordinateCompression_other {
	//backjoon 성공 코드 -> hashmap 사용
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [] ar = new int[n];
		String [] str = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(str[i]);
		}
		
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i=0; i<n; i++) {
			ts.add(ar[i]);
		}
	
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Iterator<Integer> iter = ts.iterator();
		for(int i=0; i<ts.size(); i++) {
			hm.put(iter.next(), i);
		}
		
		for(int i: ar) {
			int result = hm.get(i);
			bw.write(result+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
