package pocketmon;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	//포켓몬 성공 -> 입력 제한 안 하면 됨,, 개어이 없어,,
	//정렬은 무조건 돼 있어야 됨 -> 아니면 시간 초과
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String spilt = scan.nextLine();
        String [] input = spilt.split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        TreeMap<String, Object> sname = new TreeMap<String, Object>();
        TreeMap<String, Object> iname = new TreeMap<String, Object>();
        
        for(int i=0; i<n; i++){
            String tmp=scan.nextLine();
            sname.put(tmp, i);
        	iname.put(i+"", tmp);
        }

        int idx=0;
        String [] problem = new String[m];
        for(int j =0; j<m; j++) {
        	problem[j] = scan.nextLine();
        }
        for(int j=0; j<m; j++) {
        	try {
            	idx = Integer.parseInt(problem[j])-1;
            	System.out.println((String)iname.get(idx+""));
            }catch(Exception e) {
            	System.out.println((Integer)sname.get(problem[j])+1);
            }
        }
        scan.close();
	}
}