package algorithmTest;

import java.util.HashSet;
import java.util.Set;

public class test4 {
	 public static int solution(String S) {
		 
		 String pre[] = new String[S.length()];
		 String suf[] = new String[S.length()];
		 
		 Set<String> set = new HashSet<>();
		 
		 int answer = 0;
		 
		 for(int i=0; i<S.length(); i++) {
			 pre[i]=S.substring(0, i);
			 suf[i]=S.substring(S.length()-i, S.length());
			 set.add(pre[i]);
		 }
		 
		 for(String val : suf) {
			 if(set.contains(val)) {
				 answer = Math.max(val.length(),answer);
			 }
		 }
		 
		 return answer;
	 }
	 public static void main(String[] args) {
		System.out.println(solution("codility"));
	}
}
