import java.util.Scanner;

public class Croatia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		int cnt=0;
		
		for(int i=0; i<len; i++) {
			if(str.charAt(i)=='c'&& (i+1)<len) {
				if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-') {
					cnt++;
					i++;
				}else {
					cnt++;
				}
			}else if(str.charAt(i)=='d' && (i+1)<len){
				if(str.charAt(i+1)=='-') {
					cnt++;
					i++;

				}else if(str.charAt(i+1)=='z' && (i+2)<len && str.charAt(i+2)=='=') {
					cnt++;
					i=i+2;
				}else {
					cnt++;
				}
			}else if(str.charAt(i)=='l'&& (i+1)<len) {
				if(str.charAt(i+1)=='j') {
					cnt++;
					i++;
				}else {
					cnt++;
				}
			}else if(str.charAt(i)=='n'&& (i+1)<len) {
				if(str.charAt(i+1)=='j') {
					cnt++;
					i++;
				}else {
					cnt++;
				}
			}else if(str.charAt(i)=='s'&& (i+1)!=len) {
				if(str.charAt(i+1)=='=') {
					cnt++;
					i++;
				}else {
					cnt++;
				}
			}else if(str.charAt(i)=='z'&& (i+1)!=len) {
				if(str.charAt(i+1)=='=') {
					cnt++;
					i++;
				}else {
					cnt++;
				}
			}else {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}
}
