package buoi4;

import java.util.Scanner;

public class NuaMatran {
	public static int tongtrencheochinh(int[][] a, int n ) {
		int T=0;
		for(int i = 1; i<=n;i++) {
			for(int j = i+1;j<=n;j++) {
				T += a[i][j];     
			}
		}
		return T;
	}
	public static int tongduoicheochinh(int[][] a, int n ) {
		int T=0;
		for(int i =2; i<= n;i++) {
			for(int j = 1;j< i;j++) {
				T += a[i][j];     
			}
		}
		return T;
	}
	public static int tongtrencheophu(int[][] a, int n ) {
		int T=0;
		for(int i =1; i<= n-1;i++) {
			for(int j = 1;j< n-i;j++) {
				T += a[i][j];     
			}
		}
		return T;
	}
	public static int tongduoicheophu(int[][] a, int n ) {
		int T=0;
		for(int i = 1; i <= n; i++) {
			for(int j = n - i; j < n; j++) {
				T += a[i][j];
			}
		}
		return T;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a= new int[100][100];
		for(int i = 1; i<=n;i++) {
			for(int j = 1;j<= n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println(tongtrencheochinh(a,n));
		System.out.println(tongduoicheochinh(a,n));
		System.out.println(tongtrencheophu(a,n));
		System.out.println(tongduoicheophu(a,n));
	}
}
