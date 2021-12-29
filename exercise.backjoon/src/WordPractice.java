import java.util.Scanner;
import java.util.TreeSet;

public class WordPractice {

	public static void main(String[] args) {
		//65~90
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int [] alpa = new int[26];
		TreeSet<Integer> ts = new TreeSet<>();
		int cnt=0;
		int idx=-1;
		
		str = str.toUpperCase();
		
		for(int i=0; i<str.length(); i++) {
			alpa[(int)str.charAt(i)-65]++;
		}
		for(int i=0; i<26; i++) {
			ts.add(alpa[i]);
		}
		
		for(int i=0; i<26; i++) {
			if(alpa[i]==ts.last()) {
				idx=i+65;
				cnt++;
			}
		}
		if(cnt>1) {
			System.out.println("?");
		}else {
			System.out.println((char)idx);
		}
		sc.close(); 
	}

}
