package buoi4;

import java.util.Scanner;

public class VuotChuongNgaiVat {
	public static int greater(int[][] arr, int x, int y) {
		for(int i = -1; i <= 1; i++) {
			for(int j = -1; j <= 1; j++) {
				if(arr[x+i][y+j] > arr[x][y]) {
					return arr[x+i][y+j];
				}
			}
		}
		return 0;
	}
	
	public static int countStep(int[][] arr, int x, int y) {
		int min = greater(arr, x, y);
		if(min != 0) {
			int dx = x, dy = y;
			for(int i = -1; i <= 1; i++) {
				for(int j = -1; j <= 1; j++) {
					if(arr[x+i][y+j] > arr[x][y] && arr[x+i][y+j] <= min) {
						min = arr[x+i][y+j];
						dx = x + i;
						dy = y + j;
					}
				}
			}
			return 1 + countStep(arr, dx, dy);
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] arr = new int[n+2][n+2];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n + 2; i++) {
			arr[i][0] = 0;
			arr[0][i] = 0;
			arr[i][n+1] = 0;
			arr[n+1][0] = 0;
		}
				
		System.out.println(countStep(arr, x + 1, y + 1));
	}

}
