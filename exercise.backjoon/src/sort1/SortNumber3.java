package sort1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
//성공,,?
public class SortNumber3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [] ar = new int[n];
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(ar);
		
		for(int i : ar) {
			bw.write(i+"");
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
