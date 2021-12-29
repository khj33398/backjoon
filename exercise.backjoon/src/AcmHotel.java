import java.util.Scanner;

public class AcmHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] result = new int[t];
		int x=0, y=0, room=0;
		for(int i=0; i<t; i++){
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int mox = n/h;
			int mod = n%h;
			if(mod==0) {
				x=mox;
				y=h;
			}else {
				x=mox+1;
				y=mod;
			}
			room = 100*y+x;
			result[i]=room;
		}
		for(int pp : result) {
			System.out.println(pp);
		}
		sc.close();
	}
}
