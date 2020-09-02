package buoi5;

import java.util.Scanner;

public class XauConChungDaiNhat {
	static String s1, s2;
	static int[][] a = new int[1002][1002];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		int n1 = s1.length();
		int n2 = s2.length();
		for (int i = 0; i <= n2; i++) {
			a[0][i] = 0;
		}
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					a[i + 1][j + 1] = a[i][j] + 1;
				} else {
					a[i + 1][j + 1] = Math.max(a[i + 1][j], a[i][j + 1]);
				}
			}
		}
		System.out.println(a[n1][n2]);
	}
}
