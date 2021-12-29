

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String ar = sc.nextLine();
		String [] ar2 = ar.split(" ");
		int [] list = new int[ar2.length];
		for(int i=0; i<ar2.length; i++){
			list[i] = (Integer.parseInt(ar2[i]));
		}
		Arrays.sort(list);
		System.out.println(list[0]+" "+list[list.length-1]);
		sc.close();
	}

}
