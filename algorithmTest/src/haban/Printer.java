package haban;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public static void main(String[] args) {
		
		int[] priorities = {2,1,3,2};
		int location = 2;
		Print[] answer = new Print[priorities.length];
		int count = 0;
		int ans = 0;
		
		  Queue<Print> queue = new LinkedList<Print>();
	        
	        for(int i=0; i<priorities.length; i++){
	        	if(i==location) {
	        		queue.add(new Print(priorities[i], true));
	        	}
	        	else queue.add(new Print(priorities[i], false));
	        }
	        
	        while(!queue.isEmpty()){
	        	Print current = queue.poll();
	        	boolean did = false;
	            Iterator<Print> it = queue.iterator();
	            
	            while(it.hasNext()) {
	            	int n = it.next().x;
	            	
	            	if(n > current.x) {
	            		queue.add(current);
	            		did = true;
	            		break;
	            		
	            	}
	            }
	            if(!did) {
	        	answer[count] = new Print(current.x, current.loc); 
        		count++;
	            }
	        }
	        
	        for(int i=0; i<answer.length;i++) {
	        	if(answer[i].loc) ans = i;
	        }
	        
	        System.out.println(ans+1);
	        
	}
}

class Print{
	int x;
	boolean loc;
	public Print(int x, boolean loc){
		this.x = x;
		this.loc = loc;
	}
}
