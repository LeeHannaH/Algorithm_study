package algorithmTest;

import java.util.Arrays;
import java.util.Set;

public class Hboat {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        //Arrays.sort(<나의배열>, Collections.reverseOrder());
        //왜안돼?ㅗㅗ
        Arrays.sort(people);
        int[] newPeople = new int[people.length];
        for(int i=people.length-1; i>=0; i--) {
        	newPeople[people.length-1-i] = people[i];
        }//이거 어떻게 comparable로
 

//80 70 50 50 
        int index = 0;
        int laindex= 0;
        boolean finish = true;
        while(finish) {
        	answer++;
        	if(newPeople[index]+newPeople[newPeople.length-1-laindex]>limit) {
        		
        		//System.out.println(newPeople[index]+" out !");
        		//System.out.println();System.out.println();
        		newPeople[index] = limit+1; // 썼다고 체크
        		index += 1;
        	}else {
        		//System.out.print(newPeople[index]+" , ");
        		//System.out.println(newPeople[newPeople.length-1-laindex]+" out !");
        		//System.out.println();System.out.println();
        		newPeople[index] = limit+1;
        		newPeople[newPeople.length-1-laindex] =limit+1;
        		index += 1;
        		laindex +=1;
        	}
        	if(index == newPeople.length || newPeople[index]==limit+1) finish = false;
        }
      
        return answer;
    }
    public static void main(String[] args) {
		int[] people = {70,80,50};
		int limit = 100;
		System.out.println(solution(people, limit));
	}
}
