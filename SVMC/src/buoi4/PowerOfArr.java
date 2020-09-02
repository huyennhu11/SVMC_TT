package buoi4;

import java.util.Scanner;

public class PowerOfArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int[] a= new int[50000];
			for(int i = 1; i<= n; i++) {
				a[i] = sc.nextInt();
			}
			long T=0;
			for(int i = 0; i<=n ;i++) {
				for(int j =1; j<= n; j++) {
					if(a[i] > a[j]) {
						T += 1;
					}
				}
			}
			System.out.print(T+n+" ");
//			System.out.print( T+ n+ " ");
//			int[] f = new int[50000];
//			for(int i = 1; i <= n; i++) {
//				if(a[i+1] == a[i] ) {
//					f[a[i]] = f[a[i]] +1 ;
////					System.out.print(f[a[i]]+" ");
//				}else {
//					f[a[i]] =1;
////					System.out.print(f[a[i]]+" ");
//				}
//			}
//			for(int i= 1; i<= f.length; i++) {
//				System.out.print(f[i]+" ");
//			}
		}
	}
}
