package sort1;
// 정렬하는 거 다시 짜보기
import java.util.Arrays;
import java.util.Scanner;

public class SortInside {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] str = sc.nextLine().split("");
		int [] num = new int[str.length];
		for(int i=0; i<str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(num);
		
		for(int i=num.length-1;i>=0; i--) {
			System.out.print(num[i]);
		}
		sc.close();
	}

}
