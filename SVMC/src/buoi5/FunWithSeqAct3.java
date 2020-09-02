package buoi5;

import java.util.Scanner;

public class FunWithSeqAct3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a = new int[100];
		int m = sc.nextInt();
		for(int i = 0; i< m; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[100];
		int n = sc.nextInt();
		for(int i = 0; i< n; i++) {
			b[i] = sc.nextInt();
		}
		int val;
		if( n < m) {
			val = n;
		}else {
			val = m;
		}
		
		for(int i=0;i<val;i++)
		{
			int j=i;
			if(a[i] == b[j])
				System.out.print(i+1+" ");
		}
		
	}
}
//https://www.spoj.com/status/SMPSEQ5,huyennhu11/
