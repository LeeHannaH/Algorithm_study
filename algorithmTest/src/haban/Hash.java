package haban;

import java.util.HashMap;
import java.util.Map;

import summerAlgorithm.Solution1;

public class Hash {
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, 
									{"blue_sunglasses", "eyewear"}, 
									{"green_turban", "headgear"}};
		
		System.out.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<clothes.length; i++) {
			if(map.containsKey(clothes[i][1])) {
				map.replace(clothes[i][1], map.get(clothes[i][1])+1);
			}else {
				map.put(clothes[i][1], 1);
			}
		}
		
		for(int value : map.values()) {
			answer *= (value+1);
		}
		
		
		return answer-1;
	}

}
