package buoi5;

import java.util.Scanner;

public class Xaythap2 {

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
			
			if(m1> m2) {
				int m = m1 -m2, val1= m1, val2= m2 ;
				int chiphi1=0, chiphi2=0;
				for(int i= 1; i<=m; i++) {
					chiphi1 += a[i]*val1;
					val1--; 
//					System.out.print(chiphi1+" ");
				}
				for(int i= m+1; i<=n; i = i+2) {
					chiphi2 += a[i]*val2 + a[i+1]*val2;
					val2--;
//					System.out.print(chiphi2+" ");
				}
				System.out.print(chiphi1+chiphi2+" ");
			}
			else {
				int m = m2 -m1, val1= m1, val2= m2 ;
				int chiphi1=0, chiphi2=0;
				for(int i= 1; i<=m; i++) {
					chiphi1 += a[i]*val2;
					val2--; 
//					System.out.print(chiphi1+" ");
				}
				for(int i= m+1; i<=n; i = i+2) {
					chiphi2 += a[i]*val1 + a[i+1]*val1;
					val1--;
//					System.out.print(chiphi2+" ");
				}
				System.out.println(chiphi1+chiphi2+" ");
			}
		}
	}

}
