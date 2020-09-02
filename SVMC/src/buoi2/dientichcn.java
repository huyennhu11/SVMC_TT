package buoi2;

import java.util.Scanner;

public class dientichcn {
	public static void main(String[] args) {
		// chay test case trong slide
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a[][] = new int[100][100];
//		for(int i=0; i< n; i++) {
//			for(int j=0;j<4; j++) {
//				a[i][j]= sc.nextInt();
//			}
//		}
//		int S = 0;
//		S = (a[0][2] - a[0][0]) *(a[0][3]-a[0][1]) + (a[1][2] - a[1][0]) *(a[1][3]-a[1][1]) - (a[0][2] - a[1][0]) *(a[0][3]-a[1][1]);
//		System.out.println(S);
		// chay cac TH
		int m = sc.nextInt();
		int x1, y1, x2, y2;
		int[][] hcn = new int[101][101];
		for(int i = 0; i < m; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			for(int k = x1; k < x2; k++) {
				for(int t = y1; t < y2; t++) {
					hcn[k][t] = 1;
				}
			}
		}
		int S = 0;
		for(int k = 0; k < 101; k++) {
			for(int t = 0; t < 101; t++) {
				if (hcn[k][t] == 1) {
					S += 1;
				}
			}
		}
		System.out.println(S);

	
	}
}
