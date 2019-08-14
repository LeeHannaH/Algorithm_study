package algorithmTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hpeshirt {
	public static void main(String[] args) {
		int n = 9;
		int[] lost = {2,4,7,8};
		int[] reserve = {3,6,9};
		System.out.println(solution(n, lost, reserve));
		
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // reserve에서 lost 겹치는게 있으면 reserve에서 걔 빼기 
        // reserve에 남아있는 숫자 하나씩 검사 (for)
        // 앞뒤의 숫자가 lost에 있는지 확인
        // 있다면 lost에서 삭제, reserve에서 삭제 
        // 전체n에서 lost길이 빼서 return 
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int i=0; i<lost.length; i++) {
        	lostSet.add(lost[i]);
        }
        for(int i=0; i<reserve.length; i++) {
        	if(!lostSet.contains(reserve[i]))
        	reserveSet.add(reserve[i]);
        	else {
        		reserveSet.remove(reserve[i]);
        		lostSet.remove(reserve[i]);
        	}
        }
        
        Iterator<Integer> iterator = reserveSet.iterator();
        int size = reserveSet.size();
        while(iterator.hasNext()) {
        	int temp = iterator.next();
        	if(lostSet.contains(temp-1)) {
        		iterator.remove();
        		lostSet.remove(temp-1);
            	
        	}else if(lostSet.contains(temp+1)) {
        		iterator.remove();
        		lostSet.remove(temp+1);
        	}
        	// 이 if랑 else if문 순서를 바꿨는데 그 전에는 밑에 반례가 안돌아갔음
        }
        
        answer = n - lostSet.size();
      
      /*  n = 5
        lost = {2,4}
        reserve = {3,5}
        answer = 5*/
        
        return answer;
    }
}
