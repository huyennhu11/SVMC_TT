package buoi5;

import java.util.Scanner;

public class FunWithSeqAct2 {
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
		for(int i=0;i<m;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(b[j] == a[i])
	            {
	                System.out.print(a[i]+" ");
	                break;
	            }
	        }
	    }
		
	}
}
//https://www.spoj.com/status/SMPSEQ4,huyennhu11/
