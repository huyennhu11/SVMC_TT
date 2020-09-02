package buoi3;

import java.util.Scanner;

public class Daynghichthe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[60000];
//		while(n > 0) {
//			a[n] = sc.nextInt();
//			n--;
//		}
		for(int i = 1; i <= n ; i++) {
			a[i] = sc.nextInt();
		}
		int t=0;
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j< i  ; j++) {
				if(a[j] < a[i]) {
					t++;
				}
			}
		}
		System.out.println(t);
	}

}
