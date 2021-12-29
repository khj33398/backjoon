import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int [] num = new int[8];
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='A'||str.charAt(i)=='B'||str.charAt(i)=='C') {
				num[0]++;
			}else if(str.charAt(i)=='D'||str.charAt(i)=='E'||str.charAt(i)=='F') {
				num[1]++;
			}else if(str.charAt(i)=='G'||str.charAt(i)=='H'||str.charAt(i)=='I') {
				num[2]++;
			}else if(str.charAt(i)=='J'||str.charAt(i)=='K'||str.charAt(i)=='L') {
				num[3]++;
			}else if(str.charAt(i)=='M'||str.charAt(i)=='N'||str.charAt(i)=='O') {
				num[4]++;
			}else if(str.charAt(i)=='P'||str.charAt(i)=='Q'||str.charAt(i)=='R'||str.charAt(i)=='S') {
				num[5]++;
			}else if(str.charAt(i)=='T'||str.charAt(i)=='U'||str.charAt(i)=='V') {
				num[6]++;
			}else if(str.charAt(i)=='W'||str.charAt(i)=='X'||str.charAt(i)=='Y'||str.charAt(i)=='Z') {
				num[7]++;
			}else {
				
			}
		}
		int sum=0;
		for(int i=0; i<8; i++) {
			sum+=num[i]*(i+3);
		}
		System.out.println(sum);
		sc.close();
	}
}
