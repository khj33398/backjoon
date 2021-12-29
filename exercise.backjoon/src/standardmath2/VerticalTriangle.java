package standardmath2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VerticalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] input = new int[3];
		ArrayList<String> output = new ArrayList<>();
		while(true) {
			StringBuilder check = new StringBuilder();
			input[0] = sc.nextInt();
			input[1] = sc.nextInt();
			input[2] = sc.nextInt();
			
			if(input[0]==0 && input[1]==0 && input[2]==0) {
				break;
			}
			
			Arrays.sort(input);
			
			if(input[0]*input[0]+input[1]*input[1]==input[2]*input[2]){
				check.append("right");
			}else {
				check.append("wrong");
			}
			output.add(check.toString());
		}
		
		for(String i : output) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
