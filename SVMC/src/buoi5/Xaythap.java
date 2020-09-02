package buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Xaythap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n, m1, m2;
			int[] a = new int[51];
			n = sc.nextInt();
			m1 = sc.nextInt();
			m2 = sc.nextInt();
			for(int i = 1 ; i <= n; i++) {
				a[i] = sc.nextInt();
			}
			int tmp;
			for(int i = 1 ; i <= n; i++) {
				for (int j = 1; j <= n-1; j++) {
	                if (a[j] > a[j + 1]) {
	                    tmp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = tmp;
	                }
	            }
			}
			for(int i = 1 ; i <= n; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println(" ");
			int val1, val2;
			int chiphi = a[n]+a[n-1];
			if(m1 > m2) {
				val1= m1;  val2 = m2;
				for(int i = 1; i<= m1-1; i++) {
					chiphi += a[i]*val1;
					val1--;
				}
				int chiphi1=0;
				for(int j = m1; j <= n-2; j++) {
					chiphi1 += a[j]*val2;
					val2--;
				}
				System.out.println(chiphi+chiphi1+ " ");
			}else {
				val1= m2;  val2 = m1;
				for(int i = 1; i<= m2-1; i++) {
					chiphi += a[i]*val1;
					val1--;
				}
				int chiphi1=0;
				for(int j = m2; j <= n-2; j++) {
					chiphi1 += a[j]*val2;
					val2--;
				}
				System.out.println(chiphi+chiphi1+ " ");
			}
			
			
		}
	}

}
