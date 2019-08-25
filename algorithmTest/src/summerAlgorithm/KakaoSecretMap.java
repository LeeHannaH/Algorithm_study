package summerAlgorithm;

public class KakaoSecretMap {
	public static void main(String[] args) {
	//	Integer.toBinaryString(i);
		int n = 6;
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,56,19,14,14,10};
		solution(n, arr1, arr2);
	}

	private static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String count;
		if(n<10)
			count = "%0"+n+"d";
		else
			count = "%"+n+"d";
		
		int[] arr3 = new int[n];
		for(int i=0; i<n; i++) {
			arr3[i] = arr1[i] | arr2[i];
			String newStr = String.format(count, Integer.parseInt(Integer.toBinaryString(arr3[i]).toString()));
			newStr = newStr.replaceAll("0", " ");
			newStr = newStr.replaceAll("1", "#");
			
			answer[i] = newStr;
			System.out.println(newStr);
		}
		
	      return answer;
	}
	
	
}
