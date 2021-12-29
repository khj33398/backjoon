package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Dungchi {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<int []> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			int [] tmp = new int[2];
			tmp[0] = Integer.parseInt(str[0]);
			tmp[1] = Integer.parseInt(str[1]);
			list.add(tmp);
		}
		
		for(int i=0; i<n; i++) {
			int rank=0;
			int [] tmp = list.get(i);
			for(int j=0; j<n; j++) {
				if(i==j) continue;
				int [] tmp2 = list.get(j);
				if(tmp2[0]>tmp[0] && tmp2[1]>tmp[1]) {
					rank++;
				}
			}
			rank++;
			bw.write(rank+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
