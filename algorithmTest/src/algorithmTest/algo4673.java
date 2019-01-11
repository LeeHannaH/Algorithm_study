package algorithmTest;

public class algo4673 {
	
	public static void main(String args[]) {
		
		int array[] = new int[10000];
		int temp;
		int array_count = 0;

	   
		for(int a=0; a<=9; a++) {
			for(int b=0; b<=9; b++) {
				for(int c=0; c<=9; c++) {
					for(int d=0; d<=9; d++) {
						int current_num = (1000*a+100*b+10*c+d)+a+b+c+d; 	
							
							array[array_count] = current_num;
							array_count ++;

					}
				}
			}
		}
		
			for(int i=0; i<array.length; i++) {
				for(int j=i+1; j<array.length; j++) {
					if(array[i]>array[j]) {
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}else if(array[i]==array[j]) {
						
					}
				}
			}	
			
			int find_count = 0;
			
			for(int i=0;i<10000;i++) {
				if(array[find_count]!=i) {
					System.out.println(i);
				}else {
					
					int compare_a, compare_b;
					
					//System.out.print(i + " ----같 array["+find_count +"] :"+array[find_count]);
					compare_a = array[find_count];
					
					find_count++;
					
					//System.out.println( " 다음꺼 : " + array[find_count]);
					compare_b = array[find_count];
					if(compare_a==compare_b) {
						find_count++;
					}
				}
			}
		    
	
	}

}
