package btvn;

import java.util.Scanner;

public class FunWSeq {
	public static void main (String[] args) 
	{
		int[] a = new int[100];
		int tmp;
		int[] save = new int[205];
		int m, n;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		for (int i= 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		n = sc.nextInt();
		for (int i= 0; i < n; i++) {
			tmp = sc.nextInt();
			save[100 + tmp] = 1;
		}
		for (int i = 0; i < m; i++) {
			if (save[a[i] + 100] == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
