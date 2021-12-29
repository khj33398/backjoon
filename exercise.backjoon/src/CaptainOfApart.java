import java.util.Scanner;

public class CaptainOfApart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase = sc.nextInt();
		int [] output = new int[tcase];
		for(int i=0; i<tcase; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int [] otmp = new int[n];
			for(int j=0; j<n; j++) {
				otmp[j] = j+1;
			}
			for(int j=1; j<=k; j++) {
				for(int l=1; l<n; l++) {
					otmp[l] += otmp[l-1];
				}
			}
			output[i]= otmp[n-1];
		}
		for(int tmp : output) {
			System.out.println(tmp);
		}	
		sc.close();
	}
}
