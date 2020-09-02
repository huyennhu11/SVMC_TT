package buoi4;

import java.util.Scanner;

public class VaiLucNgan2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = 3;
		int n = sc.nextInt();
		long[] a = new long[n];
		long H = sc.nextLong();
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		long max = 0;
		for(int index = 0; index < n; index++) {
			int i = 1;
			long sum = a[index];
//			System.out.println(sum);
			while(i * d <= H) {
				if(index - i >= 0) {
					sum += a[index - i];
					System.out.print(sum+" ");
				}
				System.out.println();
				if(index + i < n) {
					sum += a[index + i];
					System.out.print(sum+" ");
				}
				i++;
			}
			max = (sum > max) ? sum : max;
		}
		System.out.println(max);
		
	}

}
