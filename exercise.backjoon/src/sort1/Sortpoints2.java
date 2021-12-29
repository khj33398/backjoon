package sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sortpoints2 {
	
	public static class Point{
		int x;
		int y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Point> list = new ArrayList<>();

		for(int i=0; i<n; i++) {
			String [] str = sc.nextLine().split(" ");
			Point point = new Point();
			point.x = Integer.parseInt(str[0]);
			point.y = Integer.parseInt(str[1]);
			list.add(point);
		}

		Collections.sort(list, new Comparator<Point>() {
			@Override
			public int compare(Point point1, Point point2) {
				if(point1.y==point2.y) {
					return point1.x-point2.x;
				}else {
					return point1.y-point2.y;
				}
			}
		});
		
		for(Point tmp : list) {
			System.out.println(tmp.x+" "+tmp.y);
		}
		
		sc.close();
	}

}
