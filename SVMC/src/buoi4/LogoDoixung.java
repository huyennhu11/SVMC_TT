package buoi4;

import java.util.Scanner;
//0 0 1 0 0
//0 1 0 1 0
//1 0 0 0 1   
//0 1 0 1 0 
//0 1 1 1 0

//0 0 1 0 0
//0 1 0 1 0
//1 0 0 0 1   
//0 1 0 1 0 
//0 0 1 0 0
public class LogoDoixung {
	public static boolean trucx(int[][] a, int n) {
		for(int i = 0; i< n/2;i++) {
			for(int j = 0;j <  n;j++) {
				if(a[i][j] != a[n-i-1][j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean trucy(int[][] a, int n) {
		for(int i = 0; i< n;i++) {
			for(int j = 0;j < n/2;j++) {
				if(a[i][j] != a[i][n-j-1]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a= new int[32][32];
		for(int i = 0; i< n;i++) {
			for(int j = 0;j< n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		if(trucx(a, n) == false||trucy(a, n) == false ) {
			System.out.print("0");
		}
		else {
			System.out.print("1");
		}
	}
}
