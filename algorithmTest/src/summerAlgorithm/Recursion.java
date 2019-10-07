package summerAlgorithm;

public class Recursion {
	public int solution(int[] numbers, int target) {
		
		return DFS(0, 0, target, numbers);
    }
	
	public int DFS(int num, int index, int target, int[] numbers) {
		
		if(index == numbers.length) {
			return num==target?1:0;
		}else {
			return DFS(num+numbers[index], index+1, target, numbers)+DFS(num-numbers[index], index+1, target, numbers);
		}
	}
 
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        int target = 3;
 
        System.out.println(new Recursion().solution(arr, target));
    }
}
