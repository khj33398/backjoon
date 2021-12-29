import java.util.Scanner;

public class Checker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String [] str = new String[n];
		StringBuilder [] sb = new StringBuilder[n];
		for(int i=0; i<n; i++) {
			sb[i] = new StringBuilder();
		}
		int cnt=0;
		for(int i=0; i<n; i++) {
			str[i] = sc.nextLine();
		}
		
		for(int i=0; i<n; i++) {
			int j=0;
			for(j=0; j<str[i].length(); j++) {
				if(j==0) {
					sb[i].append(str[i].charAt(j));
				}else if(str[i].charAt(j-1)!=str[i].charAt(j) && sb[i].indexOf(str[i].charAt(j)+"")>=0) {
					break;
				}else {
					sb[i].append(str[i].charAt(j));
				}
			}
			if(j==str[i].length()) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}
}