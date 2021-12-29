package standardmath2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Goldbach {
	//에라토스테네스의 체를 이용한 소수 확인
	//true이면 소수가 아니고 false이면 소수이다.
	public static boolean [] prime = new boolean[10001];
	
	public static void get_prime() {
		prime[0]=prime[1]=true;
		//제곱근 함수 : Math.sqrt()
		for(int i=2; i<= Math.sqrt(prime.length); i++) {
			//이미 체크된 배열이면 다음 반복문으로 skip
			if(prime[i]==true) {
				continue;
			}
			
			prime[i] = false; //생략가능
			//i의 배수들을 걸러위한 반복문
			for(int j= i*i; j<prime.length; j= j+i) {
				prime[j] = true;
			}
		}
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		get_prime();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [] ar = new int[n];
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		int [] tmp = new int[2];
		for(int i=0; i<n; i++) {
			tmp[0] = ar[i]/2;
			tmp[1] = ar[i]/2;
			while(true) {
				if(prime[tmp[0]]==false && prime[tmp[1]]==false) {
					bw.write(tmp[0]+" "+tmp[1]);
					bw.newLine();
					break;
				}
				tmp[0]--;
				tmp[1]++;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
