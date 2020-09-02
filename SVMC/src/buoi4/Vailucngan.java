package buoi4;

import java.util.Scanner;

public class Vailucngan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int H = sc.nextInt() ;
		int[] a= new int[100];
		for(int i = 0; i< n;i++) {
				a[i] = sc.nextInt();
		}
		int h = H/2;
		int[] f = new int[100];
		for(int i = 0; i< n-h;i++) {
			for(int j = i; j <= i+h;j++) {
				f[i] +=  a[j];
			}
		}
		f[n-1] = a[n-1];
		
		int[] f1 = new int[100];
		for(int i= h; i <= n-2; i++) {
			f1[i] = a[i-h];
			System.out.print(f1[i]+" ");
		}
		System.out.println("\n");
		for(int i = 0; i< n;i++) {
			System.out.print(f[i]+" ");
		}
	}
}
