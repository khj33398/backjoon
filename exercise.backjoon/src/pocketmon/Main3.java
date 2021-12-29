package pocketmon;

import java.util.Scanner;
import java.util.TreeMap;

public class Main3 {
	//~ 포켓몬
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();
        
        TreeMap<String, Object> sname = new TreeMap<String, Object>();
        TreeMap<String, Object> iname = new TreeMap<String, Object>();
        
        for(int i=0; i<n; i++){
            String tmp=scan.nextLine();
            sname.put(tmp, i);
        	iname.put(i+"", tmp);
        }

        String [] problem = new String[m];
        for(int j =0; j<m; j++) {
        	problem[j] = scan.nextLine();
        }
        scan.close();
        for(int j=0; j<m; j++) {
        	try {
            	int idx = Integer.parseInt(problem[j])-1;
            	System.out.println((String)iname.get(idx+""));
            }catch(Exception e) {
            	System.out.println((Integer)sname.get(problem[j])+1);
            }
        }
	}
}
