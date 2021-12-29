

import java.util.ArrayList;
import java.util.Scanner;

public class A_B4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<>();
        
        while(true) {
        	try {
        		String str = sc.nextLine();
        		if(str==null) {}
        		String [] tmp = str.split(" ");
        		a.add(Integer.parseInt(tmp[0]));
        		b.add(Integer.parseInt(tmp[1]));
        	}catch(Exception e) {
        		break;
        	}
        }
        
        for(int i=0; i<a.size(); i++) {
        	int hap = a.get(i)+b.get(i);
        	System.out.println(hap);
        }
        sc.close();

	}

}
