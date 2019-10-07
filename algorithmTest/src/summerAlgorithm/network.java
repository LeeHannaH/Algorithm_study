package summerAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

class connect{
    int start;
    int end;
    connect(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class network {
	 static boolean[][] isvisited;
	    static int answer = 1;
	    static Queue<connect> queue = new LinkedList();
	    
	    public static int solution(int n, int[][] computers) {
	        isvisited = new boolean[n][n];
	       
	        queue.add(new connect(0,0));
	        isvisited[0][0] = true;
	        int currentIndex = BFS(n, computers);
	        while(currentIndex!=n-1){
	            answer++;
	            queue.add(new connect(currentIndex+1,0));
	            isvisited[currentIndex+1][0] = true;
	            currentIndex = BFS(n, computers);
	        }
	        System.out.println(answer);
	        return answer;
	    }
	        
	    public static int BFS(int n, int[][] computers){
	        int newStart = 0;
	        int newEnd = 0;
	        
	        while(!queue.isEmpty()){
	        connect newConnect = queue.poll();
	        newStart = newConnect.start;
	        newEnd = newConnect.end;
	            
	        for(int i=0; i<n; i++){
	            if(i==newStart) continue;
	            if(computers[newStart][i]==0) continue;
	            if(isvisited[newStart][i]) continue;
	            
	            isvisited[newStart][i] = isvisited[i][newStart] = true;
	            queue.add(new connect(i,0));
	            
	                
	            }
	        }
	        return newStart;
	    }
	        
	        
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		solution(n, computers);
	}
}
