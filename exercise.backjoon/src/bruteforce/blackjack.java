package bruteforce;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class blackjack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		String [] card = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
	
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(card[i]));
		}
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		int cha=m;
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					int hap = list.get(i)+list.get(j)+list.get(k);
					if(hap>m) {break;}
					if(m-hap<cha) {
						cha = m-hap;
					}			
				}
			}
		}
		
		bw.write(m-cha+"");
		
		bw.flush();
		bw.close();

	}

}
