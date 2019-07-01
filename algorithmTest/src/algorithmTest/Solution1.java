package algorithmTest;

import java.util.HashSet;

import java.util.Set;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution { //얘가 제일 잘 돌아감.(Set, HashSet사용시)
	   public int solution(int[] A) {
	        // write your code in Java SE 8
	        Set<Integer> set = new HashSet<>();
	      
	        for(int item : A){
	            if(set.contains(item)){
	                set.remove(item);
	            }else{
	                set.add(item);
	            }
	        }
	        
	        return set.iterator().next();
	        
	    }
/*
	   public int solution(int[] A) {
	        // write your code in Java SE 8
	        List<Integer> list = new ArrayList<>();
	       
	        for(int item : A){
	            if(list.contains(item)){
	                list.remove(item);
	            }else{
	                list.add(item);
	            }
	        }
	        
	        return list.iterator().next();
	        
	    }*/
	   
	   /* 
 public int solution(int[] A) {
     
     for(int i=0; i<A.length; i++){
         if(A[i]==0) continue;
         boolean flag = false;
         for(int j=i+1; j<A.length-1; j++){
             if(A[i]==A[j]){
                 A[i] = A[j] = 0;
                 flag = true;
                 break;
             }               
         }if(flag == false){
             return A[i+1];
         }
     }
    return 0; 
 }*/
}