package pocketmon;

import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, m = 0;
        String spilt = scan.nextLine();
        String [] input = spilt.split(" ");
        while(true) {
        	try {
        		n = Integer.parseInt(input[0]);
        		while(true) {
        			try {
        				m = Integer.parseInt(input[1]);
        				if(m>=1 && m<=100000) {break;}
        			}catch(Exception e) {
        				
        			}
        			input[1] = scan.nextLine();
        		}
        		if(n>=1 && n<=100000) {break;}
        	}catch(Exception e) {
        		
        	}
        	try {
				m = Integer.parseInt(input[1]);
				if(m>=1 && m<=100000) {
					input[0] = scan.nextLine();
				}
			}catch(Exception e) {
	        	spilt = scan.nextLine();
				input= spilt.split(" ");
			}
        }

        TreeMap<String, Object> sname = new TreeMap<String, Object>();
        TreeMap<String, Object> iname = new TreeMap<String, Object>();
        int cnt = 0;
        while(cnt<n) {
        	String tmp = scan.nextLine();
        	while(true) {
        		if(tmp.length()>=2 && tmp.length()<=20 && tmp.charAt(0)>='A' && tmp.charAt(0)<='Z') {
        			int i=0;
            		for(i=1; i<tmp.length(); i++) {
            			if(tmp.charAt(i)>='a' && tmp.charAt(i)<='z'){}
            			else {
            				tmp = scan.nextLine();
            				cnt--;
            				break;
            			}
            		}
            		if(i==tmp.length()) {break;}
            	}else if(tmp.length()>=2 && tmp.length()<=20 && tmp.charAt(tmp.length()-1)>='A' && tmp.charAt(tmp.length()-1)<='Z'){
            		int i=0;
            		for(i=0; i<tmp.length()-1; i++) {
            			if(tmp.charAt(i)>='a' && tmp.charAt(i)<='z') {}
            			else {
            				tmp = scan.nextLine();
            				cnt--;
            				break;
            			}
            		}
            		if(i==tmp.length()-1) {break;}
            	}else {
            			tmp = scan.nextLine();
    					cnt--;
            	}
        	}
        	sname.put(tmp, cnt);
        	iname.put(cnt+"", tmp);
        	cnt++;
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