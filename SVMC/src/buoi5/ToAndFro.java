package buoi5;

import java.util.Scanner;

public class ToAndFro {
	public static void main(String[] args) {		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n != 0) {
		String s = sc.nextLine();
		int m = s.length() / n;
		char[][] a = new char[m][n];
		int k = 0;
		
		for(int i = 0; i < m; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					a[i][j] = s.charAt(k);
					k++;
				}
			}
			else {
				for(int j = n - 1; j >= 0; j--) {
					a[i][j] = s.charAt(k);
					k++;
				}
			}
		}	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(a[j][i]);
			}
		}
		System.out.println();
		n = sc.nextInt();
	}
	
	}	
}

