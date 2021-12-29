import java.util.Scanner;

public class SnailUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int i= 0;
		if((v-b)%(a-b)==0) {
			i = (v-b)/(a-b);
		}else {
			i = (v-b)/(a-b)+1;
		}
		System.out.println(i);

		sc.close();
	}

}
