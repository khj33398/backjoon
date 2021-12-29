package dynamic_plan_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class fibonacci_other {
	//backjoon 성공 -> 반복문으로 해결
	public static ArrayList<int []> list = new ArrayList<>();
	
	public static void fibo() {
		int [] first = {1, 0};
		int [] second = {0, 1};
		list.add(first.clone());
		list.add(second.clone());
		for(int i=0; i<=40; i++) {
			int [] temp = new int[2];
			temp[0] = first[0]+second[0];
			temp[1] = first[1]+second[1];
			
			list.add(temp);
			first = second.clone();	
			second = temp.clone();	
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int [] ar = new int[n];
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		
		fibo();
		
		for(int i=0; i<n; i++) {
			int [] tmp = list.get(ar[i]);
			bw.write(tmp[0]+" "+tmp[1]);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
