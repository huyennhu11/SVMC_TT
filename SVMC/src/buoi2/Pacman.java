package buoi2;

import java.util.Scanner;

public class Pacman {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int m;
			m = sc.nextInt();
			for(int k = 0; k < m; k++) {
				int n = sc.nextInt();
				int[][] arr = new int[n][n];
				int x = 0, y = 0; 
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						arr[i][j] = sc.nextInt();
						if(arr[i][j] == 2) {
							x = i;
							y = j;
						}
					}
				}
				int sum = 0;
				int i = 1;
				while(x - i >= 0 && y - i >= 0 && arr[x-i][y-i] == 0) {
					sum++;
					i++;
				}
				i = 1;
				while(y - i >= 0 && arr[x][y-i] == 0) {
					sum++;
					i++;
				}
				i = 1;
				while(x + i < n && y - i >= 0 && arr[x+i][y-i] == 0) {
					sum++;
					i++;
				}
				
				i = 1;
				while(x - i >= 0 && y + i < n && arr[x-i][y+i] == 0) {
					sum++;
					i++;
				}
				i = 1;
				while(y + i < n && arr[x][y+i] == 0) {
					sum++;
					i++;
				}
				i = 1;
				while(x + i < n && y + i < n && arr[x+i][y+i] == 0) {
					sum++;
					i++;
				}
				int j = 1;
				while(x - j >= 0 && arr[x-j][y] == 0) {
					sum++;
					j++;
				}
				j = 1;
				while(x + j < n && arr[x+j][y] == 0) {
					sum++;
					j++;
				}
				System.out.println("#" + (k + 1) + ": " + sum);
			}	
}
}
