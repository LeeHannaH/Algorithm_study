package haban;

public class MakeBigNum {
	public static void main(String[] args) {
		
		System.out.println(solution("1924", 2));
		System.out.println(solution("1231234", 3));
		System.out.println(solution("4177252841", 4));
		System.out.println(solution("9994994", 3));
		
	}
    public static String solution(String number, int k) {
        StringBuffer str = new StringBuffer(number);
        String answer ="";
        int count  = k;
        boolean doSomething = false;
        
        while(count>0) {
            
        	
        	
	        for(int i=1; i<str.length(); i++) {


	        	if(str.charAt(i-1)<str.charAt(i)) {
	        		if(count==0) {
	        			answer = str.toString();
	        			break;
	        		}
	        		str.deleteCharAt(i-1);
	        		count--;
	        		doSomething = true;
	        		
	        		break;
	        	}
	        }
	        
	        }
        answer = str.toString();
		return answer;
    }
}
