import java.util.Scanner;

public class BigSuA_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] input = sc.nextLine().split(" ");
		int max = input[0].length()>input[1].length()?
				input[0].length() : input[1].length();
		int min = input[0].length()>input[1].length()?
				input[1].length() : input[0].length();
		int cha = max-min;
		String high = input[0].length()>input[1].length()?
				input[0] : input[1];
		String low = input[0].length()>input[1].length()?
				input[1] : input[0];		
		int [] tmp = new int[max];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<cha; i++) {
			tmp[i] = Integer.parseInt(high.charAt(i)+"");
		}
		
		for(int i=0;i<min; i++) {
			int a = Integer.parseInt(high.charAt(i+cha)+"");
			int b = Integer.parseInt(low.charAt(i)+"");
			tmp[i+cha] = a+b;
		}	
		
		for(int i=max-1; i>0; i--) {
			if(tmp[i]>=10) {
				sb.insert(0, tmp[i]%10);
				tmp[i-1]+=tmp[i]/10;
			}else {
				sb.insert(0, tmp[i]);
			}
		}
		sb.insert(0, tmp[0]);
		
		System.out.println(sb.toString());
		
		sc.close();
	}

}
