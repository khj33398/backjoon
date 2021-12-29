import java.util.Scanner;

public class FlyToTheMoon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] result = new int[num];
		
		for(int i=0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			double cha = b-a+0.0;
			double m = (Math.sqrt(4*cha+1)-1)/2;
			int n=0;
			if(10*m%10==0) {
				n = (int)m;
			}else {
				n = (int)m+1;
			}
			if(cha-n*(n-1)>n) {
				result[i] = 2*n;
			}else {
				result[i] = 2*n-1;
			}
		}
		for(int i : result) {
			System.out.println(i);
		}
		sc.close();
	}
}
