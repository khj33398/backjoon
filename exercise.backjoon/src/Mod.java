import java.util.HashSet;
import java.util.Scanner;

public class Mod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] list = new int[10];
		for(int i=0; i<10; i++) {
			list[i]=sc.nextInt();
		}
		HashSet mod = new HashSet();
		for(int i=0; i<10; i++) {
			mod.add(list[i]%42);
		}
		System.out.println(mod.size());
		
		sc.close();
	}

}
