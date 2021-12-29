import java.util.Scanner;

public class Fountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i=0; //홀짝 구분
		int max=0;
		int start=0;
		while(true) {
			max = max+(i+1);
			if(num>max) {
				i++;
			}else {
				start = max-i;
				i++;
				break;
			}
		}
		
		int x=1, y=1;
		int cha = num-start;
		//i가 짝수면 x 증가, y 감소
		//짝수 
		if(i%2==0) {
			x +=cha;
			y = i-cha;
		}else {
			x = i-cha;
			y+=cha;
		}
		
		System.out.println(x+"/"+y);
		sc.close();
	}

}
