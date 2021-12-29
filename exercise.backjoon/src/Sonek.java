import java.util.Scanner;

public class Sonek {

	public static void main(String[] args) {
		// 고정비용(A) -> 임대료, 제산세, 보험료, 급여
		// 가변비용(B) -> 재료비, 인건비
		// 총 비용 A+B*n 비용
		// 판매가격(C)
		// 손익분기점 = C*n > A+B*n => n 구하기
		// n> A/(C-B) , 단  A/(C-B) > 0 ->  안 될시 -1리턴
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] strs = str.split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int c = Integer.parseInt(strs[2]);
		int result=0;
		try {
			result = a/(c-b);
			if(result<0) {
				System.out.println(-1);
			}else {
				System.out.println(result+1);
			}
		}catch(Exception e) {
			System.out.println(-1);
		}
		sc.close();
	}
}
