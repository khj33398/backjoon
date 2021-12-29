package sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sortword {
	public static class Word{
		String word=null;
		int len = 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Word> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			Word word = new Word();
			word.word = sc.nextLine();
			word.len = word.word.length();
			list.add(word);
		}
		
		Collections.sort(list, new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				if(o1.len==o2.len) {
					return o1.word.compareTo(o2.word);
				}else {
					return o1.len-o2.len;
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			if(i==0) {
				System.out.println(list.get(i).word);
				continue;
			}
			if(list.get(i).word.equals(list.get(i-1).word)) {
				continue;
			}
			System.out.println(list.get(i).word);
		}
		
		sc.close();
	}

}
