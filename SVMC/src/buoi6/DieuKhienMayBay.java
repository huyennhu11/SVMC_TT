

package buoi6;

import java.util.Scanner;

public class DieuKhienMayBay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0){
			int N = sc.nextInt();
			int m= sc.nextInt();
			int[] a = new int[m+1];
			for(int i = 0; i< m ;i++) {
				a[i]= sc.nextInt();
			}
			int[][] b = new int[N+1][8];
			for(int i = 0; i< N ;i++) {
				for(int j = 0; j < 7;j++) {
					b[i][j] = sc.nextInt();
				}
			}
			int sum =0;
			int htd = N-1;
			int htc= 3;
			for(int i = 0; i< m ;i++) {
				if(a[i]== 1) {
					htd = htd-1;
//					System.out.print(htd+" ");
					htc=htc;
//					System.out.print(htc+" ");
//					System.out.println();
					if(b[htd][htc]==1) sum++;
					else if(b[htd][htc]==2) {
						htd = htd+1;
					}
//					System.out.println(sum);
				}
				if(a[i]== 2) {
					htd = htd-1;
//					System.out.print(htd+" ");
					htc = htc-1;
//					System.out.print(htc+" ");
//					System.out.println();
					if(b[htd][htc]==1) sum++;
					else if(b[htd][htc]==2) {
						htc = htc+1;
						htd = htd+1;
					}
//					System.out.println(sum);
				}
				if(a[i]== 3) {
					htd = htd-1;
//					System.out.print(htd+" ");
					htc = htc+1;
//					System.out.print(htc+" ");
//					System.out.println();
					if(b[htd][htc]==1) sum++;
					else if(b[htd][htc]==2) {
						htc = htc-1;
						htd = htd+1;
					}
//					System.out.println(sum);
				}
			}
			System.out.print("#"+ t +" "+sum);
			t--;
		}
	}
}
