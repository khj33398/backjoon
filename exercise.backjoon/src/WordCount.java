import java.util.Scanner;

public class WordCount {
	//이 영광은 공백만 들어왔을 때라는 예제를 알려준 익명의 분께 돌립니다.. trim 기억합세
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
        if(str.length()==0){
            System.out.println(0);
        }else{
            String [] words = str.split(" ");
		    System.out.println(words.length);
        }
		sc.close();
	}
}
