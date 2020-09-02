package buoi3;

import java.util.Scanner;

public class Tongam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- !=0) {
			int n = sc .nextInt();
			int m = sc .nextInt();
			int[][] a = new int[5][100];
			for(int i = 0; i< n; i++) {
				for(int j =0;j< m ; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int t1 =0;
			for(int i = 0; i< n; i++) {
				for(int j = 0;j< m ; j++) {
					if(j == 0) {
						t1 = a[i][0]+a[i][1];
						if(t1 < 0) System.out.print(a[i][0]+" ");
					}
					else if(j == m-1) {
						t1 = a[i][m-1]+ a[i][m-2];
						if(t1 < 0) System.out.print(a[i][m-1]+" ");
					}
					else {
						t1 = a[i][j-1]+ a[i][j+1];
						if(t1 < 0) System.out.print(a[i][j]+" ");
					}
					
				}
			}
		}
	}
}
