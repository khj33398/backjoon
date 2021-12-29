

import java.util.ArrayList;
import java.util.Scanner;

public class A_B5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> a = new ArrayList<>();
		ArrayList <Integer> b = new ArrayList<>();
		while(true) {
			int a2 = sc.nextInt();
			int b2 = sc.nextInt();
			if(a2==0 && b2==0) {
				break;
			}
			a.add(a2);
			b.add(b2);
		}
		sc.close();
		
		for(int i=0; i<a.size(); i++) {
			int hap = a.get(i)+b.get(i);
			System.out.println(hap);
		}
	}
}
