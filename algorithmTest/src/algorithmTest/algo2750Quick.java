package algorithmTest;

import java.util.Scanner;

public class algo2750Quick {
	
	public void quickSort(int[] array, int l, int r) {
		int left = l;
		int right = r;
		int pivot = array[(l+r)/2]; // 가운데 존재하는 pivot
		
		do {
			while(array[left]<pivot) left++;
			while(array[right]>pivot) right--;
			if(left<=right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}while(left<=right);

		if(l<right) quickSort(array, l, right); // pivot기준 왼쪽 작은 애들끼리 다시 quicksort 재귀함수
		if(r>left) quickSort(array, left, r); // pivot기준 오른쪽 큰 애들끼리 다시 quicksort 재귀함수
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int array[] = new int[count];
		for(int i=0; i<count; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		algo2750Quick quick = new algo2750Quick();
		quick.quickSort(array, 0, array.length-1);
		for(int a : array) {
			System.out.print(a + " ");
		}
		
		
	}
}
