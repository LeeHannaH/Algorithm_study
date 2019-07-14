package summerAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class H1991 {
	// set, map 얘네 다시해봐야겠다
	
	static Map<String, List<String>> map = new HashMap<>();
	
	public static void pre(String s) { //전위
		// 없으면 return
		if(s.equals(".")) return;
		// 프린트
		System.out.print(s);
		// 왼쪽
		pre(map.get(s).get(0));
		// 오른쪽 
		pre(map.get(s).get(1));
	}
	public static void in(String s) { // 중위
		// 없으면 return
		if(s.equals(".")) return;
		// 왼쪽
		in(map.get(s).get(0));
		// 프린트
		System.out.print(s);
		// 오른쪽 		
		in(map.get(s).get(1));
	}
	public static void post(String s) { // 후위
		// 없으면 return
		if(s.equals(".")) return;
		// 왼쪽
		post(map.get(s).get(0));
		// 오른쪽 
		post(map.get(s).get(1));
		// 프린트
		System.out.print(s);
	}

	// map 사용!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			String[] str = new String[3];
			for(int j=0; j<3; j++) {
				str[j] = sc.next();
			}
			// linkedlist랑 arraylist 차이????????
			List<String> list = new ArrayList<>();
			list.add(str[1]); list.add(str[2]);
			map.put(str[0], list);
		}
		
		pre("A");
		System.out.println();
		in("A");
		System.out.println();
		post("A");
		
	}
}
