package standardmath2;

import java.util.Scanner;

public class EscapeSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int endx=sc.nextInt();
		int endy=sc.nextInt();
		
		int minx=0;
		int miny=0;
		
		if(x>endx-x) {
			minx = endx - x;
		}else {
			minx = x;
		}
		
		if(y>endy-y) {
			miny = endy-y;
		}else {
			miny = y;
		}
		
		int min = minx>miny? miny : minx;
		
		System.out.println(min);
		
		sc.close();
	}

}
