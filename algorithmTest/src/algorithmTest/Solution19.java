package algorithmTest;

class Tree {
	  public int x;
	  public Tree l;
	  public Tree r;
	}

public class Solution19 {
	  public int solution(Tree T) {
	        int lc=0;
	        int rc=0;
	        int answer=0;
	      
	        if(T.l!=null){
	            lc = 1 + solution(T.l);
	        }
	        if(T.r!=null){
	            rc = 1 + solution(T.r);
	        }
	            answer=Math.max(lc,rc);
	        
	        return answer;
	    }
	}