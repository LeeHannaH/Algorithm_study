package summerAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HSwea1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			List list = new ArrayList();
			int originalCount = sc.nextInt();
			for(int i=0; i<originalCount; i++) {
				list.add(sc.nextInt());
			}
			int orderCount = sc.nextInt();
			for(int i=0; i<orderCount; i++) {
				String c = sc.next();
				int InsertIndex = sc.nextInt();
				int InsertCount = sc.nextInt();
				for(int j=0; j<InsertCount; j++) {
					list.add(InsertIndex+j, sc.nextInt());
				}
			}
			System.out.println("#"+t+" ");
			for(int i=0; i<10; i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
		}
	}
}
