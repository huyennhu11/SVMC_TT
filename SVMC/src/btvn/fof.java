package btvn;

import java.util.Scanner;

public class fof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[][] arr = new int[m][2];
		int i, j;
		int[][] arr_fri = new int[m][100];
		int[] list = new int[100];
		int tmp = 0;
		for(i = 0; i < m; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			for(j = 0; j < arr[i][1]; j++) {
				arr_fri[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < m; i++) {
			for(j = 0; j < arr[i][1]; j++) {
				boolean isAvail = false;
				for(int t = 0; t < m; t++) {
					if(arr_fri[i][j] == arr[t][0]) {
						isAvail = true;
					}					
				}
				if(tmp > 0) {
					for(int k = 0; k < tmp; k++) {
						if(arr_fri[i][j] == list[k]) {
							isAvail = true;
						}
					}
				}

				if(!isAvail) {
					list[tmp++] = arr_fri[i][j];
				}
			}
		}
		System.out.println(tmp);
	}
}
