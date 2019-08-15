package summerAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HSwea5658 {
	static int ans;
	static int N;
	static int K;
	static String str;
	static String[] cases;
	static int rotCount;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=1; t<=testCase; t++) {
			ans = 0;
			N = sc.nextInt();
			K = sc.nextInt();
			str = sc.next();
			rotCount = N/4;
			cases = new String[N];
			for(int i=0; i<rotCount; i++) {
				for(int j=0; j<4; j++) {
					cases[4*i+j] = str.substring(rotCount*j, rotCount*j+rotCount);
				}
				str = (str.charAt(str.length()-1)+str).substring(0, N);
			}
			
			Set<Integer> set = new HashSet<>();
			for(int i=0; i<cases.length; i++) {
				set.add(Integer.parseInt(cases[i], 16));
			}
			List<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list);
			//System.out.println(list.toString());
			
			System.out.println("#"+t+" "+list.get((set.size()-K)));
		}
	}
}
