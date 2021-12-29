import java.util.Scanner;

public class OxQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] plist = new String[n];
		for(int i=0; i<n; i++) {
			plist[i] = sc.nextLine();
		}
		int [] point = new int[n];
		for(int i=0; i<n; i++) {
			int tcnt=0;
			int cnt=0;
			for(int j=0; j<plist[i].length(); j++) {
				if(plist[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt=0;
				}
				tcnt+=cnt;
			}
			point[i]=tcnt;
		}
		for(int i : point) {
			System.out.println(i);
		}
		sc.close();
	}
}
