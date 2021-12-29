import java.util.ArrayList;
import java.util.Scanner;

public class Sosu2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=m; i<n+1; i++) {
			int j=0;
			for(j=2;j<i/2+1;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i/2+1) {
				list.add(i);
			}
		}
		
		if(list.size()==0) {
			System.out.println(-1);
		}else {
			int sum=0;
			for(int i : list) {
				sum+=i;
			}
			System.out.println(sum+"\n"+list.get(0));
		}
		sc.close();
	}
}
