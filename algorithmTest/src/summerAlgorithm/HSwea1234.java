package summerAlgorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HSwea1234 {
	static String ans;
	static int Count;
	static String str;
	static boolean finish;
	static List<Integer> list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			ans = "";
			Count = sc.nextInt();
			str = sc.next();
			finish = false;
			
			list = new LinkedList<Integer>();
			for(int i=0; i<str.length(); i++) {
				list.add(str.charAt(i)-'0');
			}
			
			while(!finish) {
				int check = check();
				if(check==0) { // 끝
					finish = true;
				}
			}
			
			for(int i=0; i<list.size(); i++) {
				ans += list.get(i);
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
	private static int check() {
		int size = list.size();
		int does = 0;
		for(int i=0; i<size-1; i++) {
			if(list.get(i)==list.get(i+1)) {
				list.remove(i);
				list.remove(i);
				does+=1;
				return does;
			}
		}
		return does;
	}
}
