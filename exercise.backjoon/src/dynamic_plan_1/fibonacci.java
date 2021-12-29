package dynamic_plan_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class fibonacci {
	public static int fibo_zero(int ar) {
		if(ar==0) {
			return 1; 
		}else if(ar==1) {
			return 0;
		}else {
			return fibo_zero(ar-2)+fibo_zero(ar-1);
		}
	}
	
	public static int fibo_one(int ar) {
		if(ar==0) {
			return 0; 
		}else if(ar==1) {
			return 1;
		}else {
			return fibo_one(ar-2)+fibo_one(ar-1);
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
		
		for(int i=0; i<n; i++) {
			int zero = fibo_zero(ar[i]);
			int one = fibo_one(ar[i]);
			bw.write(zero+" "+one);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
