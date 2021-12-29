import java.util.ArrayList;
import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		ArrayList<Integer> ss = new ArrayList<>();
		for(int i=0;i<su;i++) {
			int tmp = sc.nextInt();
			ss.add(tmp);
		}
		int cnt=0;
		for(int i=0; i<su; i++) {
			int tmp = ss.get(i);
			int j=0;
			for(j=2;j<tmp/2+1;j++) {
				if(tmp%j==0) {
					break;
				}
			}
			if(j==tmp/2+1) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}
}
