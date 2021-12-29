import java.util.Scanner;

public class BeeHouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i=0;
		int max=1;
		while(true) {
			max = max+6*i;
			if(input>max) {
				i++;
			}else {
				System.out.println(i+1);
				break;
			}
		}
		sc.close();
	}
}
