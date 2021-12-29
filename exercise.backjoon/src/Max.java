import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<9; i++) {
			int in = sc.nextInt();
			list.add(in);
		}
		ArrayList <Integer> cp = new ArrayList<>();
		for(int i=0; i<9; i++) {
			cp.add(list.get(i));
		}
		Collections.sort(cp);
		sc.close();
		
		System.out.println(cp.get(8));
		System.out.println(list.indexOf(cp.get(8))+1);
	}

}
