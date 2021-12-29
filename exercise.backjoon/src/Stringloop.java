import java.util.Scanner;

public class Stringloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] cnt = new int[num];
		String [] str = new String[num];
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			String tmp = sc.nextLine();
			String []tmps = tmp.split(" ");
			cnt[i] = Integer.parseInt(tmps[0]);
			str[i] = tmps[1];
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<str[i].length(); j++) {
				for(int k=0; k<cnt[i]; k++) {
					System.out.print(str[i].charAt(j));
				}
			}
			System.out.println();
		}	
		sc.close();
	}

}
