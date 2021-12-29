import java.util.Scanner;

public class Alpabet {

	public static void main(String[] args) {
		//97~122 => -97
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int [] idx = new int[26];
		for(int i=0; i<26; i++) {
			idx[i] = -1;
		}
		for(int i=0; i<str.length(); i++) {
			int tmp = (int)str.charAt(i)-97;
			if(idx[tmp]>=0) {
				continue;
			}else {
				idx[tmp]=i;
			}
		}
		sc.close();
		for(int i : idx) {
			System.out.print(i+" ");
		}
	}
}
