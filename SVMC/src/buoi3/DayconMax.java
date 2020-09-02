package buoi3;

import java.util.Scanner;

public class DayconMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] a = new int[100];
//		for (int i = 1; i <= n; ++i) {
//	        a[i] = sc.nextInt();
//	    }
//		int maxsum = 0;
//	    int sum = 0;
//	    for (int i = 1; i <= n; i++) {
//	        sum += a[i];
//	        if (sum < 0) sum = 0;
//	        maxsum = Math.max(sum, maxsum);
//	    }
//	    System.out.print(maxsum);
//	}
	int m = sc.nextInt();
	int[] arr = new int[m + 1];
	for(int i = 1; i <= m; i++) {
		arr[i] = sc.nextInt();
	}
	int tc = sc.nextInt();
	for(int k = 0; k < tc; k++) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int max = arr[x];
		for(int i = x; i <= y; i++) {
			int sum = 0;
			for(int j = i; j <= y; j++) {
				sum += arr[j];
				max = (sum > max) ? sum : max;
			}
		}
		System.out.println(max);
	}
}
}
