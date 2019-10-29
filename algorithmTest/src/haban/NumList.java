package haban;

import java.util.Arrays;

public class NumList {
	public static void main(String[] args) {
		String[] phone_book = {"119","97674223","1195524421"};
		String[] phone_book2 = {"123","456","789"};
		String[] phone_book3 = {"12","123","1235","567","88"};
		System.out.println(solution(phone_book));
		System.out.println(solution(phone_book2));
		System.out.println(solution(phone_book3));
	}
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
    
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length; i++) {
        	for(int j=i+1; j<phone_book.length; j++) {
        		
        		if(phone_book[j].length()<phone_book[i].length())
        			break;
        		
        		if(phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])) {
        			return false;
        		}
        	}
        }
        
        return answer;
    }
}
