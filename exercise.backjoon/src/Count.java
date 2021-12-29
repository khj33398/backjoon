import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] list = new int[3];
		for(int i=0; i<3; i++) {
			list[i] = sc.nextInt();
		}
		int hap = list[0]*list[1]*list[2];
		String str = hap+"";
		int []num = new int[10];
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
				case '0' : num[0]++; break;
				case '1' : num[1]++; break;
				case '2' : num[2]++; break;
				case '3' : num[3]++; break;
				case '4' : num[4]++; break;
				case '5' : num[5]++; break;
				case '6' : num[6]++; break;
				case '7' : num[7]++; break;
				case '8' : num[8]++; break;
				case '9' : num[9]++; break;
			}
		}
		for(int i : num) {
			System.out.println(i);
		}
		sc.close();

	}

}
