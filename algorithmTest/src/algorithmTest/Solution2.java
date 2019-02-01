package algorithmTest;

public class Solution2 {
    static int gap=0;
    static int maxGap=0;
	
	 public static int solution(int N) {
	        
	        int i=0;

		    String StringN = Integer.toBinaryString(N);
	        int array[] = new int[StringN.length()];
	        
	       for(int j=0; j<StringN.length();j++) {
	    	   array[j] = StringN.charAt(j)-48;
	    	   System.out.println("array["+j+"] : "+array[j]);
	       } 
	        
	        for(int a=0; a<array.length; a++) {
	        	if(array[a]==0) {
	        		if(a==array.length-1) gap=0;
	        		System.out.println(array[a] + " : " + gap);
	        		gap++;
	        	
	        	}else if(array[a]==1) {
	        		System.out.println(array[a] + " : " + gap);
	        		if(gap>maxGap) {System.out.println(gap+"/"+maxGap);maxGap = gap;}
	        		gap=0;
	        	}
	        }
	        
	        System.out.println("hi  "+maxGap);
	        
	        if(maxGap==0) return 0;
	        return maxGap;
	        
	    }
	 
	 public static void main(String[] args) {
		 solution(1041);
	}
}
