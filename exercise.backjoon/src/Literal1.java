import java.util.Scanner;

public class Literal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String [] su = in.split(" ");
		int [] rsu = new int[2];
		
		for(int i=0; i<2; i++) {
			rsu[i] = Integer.parseInt(su[i]);
		}
		
		for(int i=0; i<2; i++) {
			int tmp = rsu[i]/100;
			rsu[i]=((rsu[i]%100+(rsu[i]%10)*100)/10)*10+tmp;			
		}
		if(rsu[0]>rsu[1]) {
			System.out.println(rsu[0]);
		}else {
			System.out.println(rsu[1]);
		}
		sc.close();
	}
}
