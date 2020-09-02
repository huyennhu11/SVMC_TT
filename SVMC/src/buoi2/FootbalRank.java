package buoi2;

import java.util.Scanner;

public class FootbalRank {
	public static void ktcauc(int[][] a, int n) {
		
		for(int i = 1; i<= n; i++)
		{	int kt=1;
			for(int j =1; j<= n ; j++) 
			{
				if(a[i][j] == 0 && i != j) {
					kt = 0;	break;
				}
			}
			if(kt == 1) System.out.print(i+" ");
		}
		
	}
	public static void ktcaub(int[][] a, int n) {
		for(int i = 1; i<= n; i++)
		{
			int dem =0;
			for(int j =1; j<= n ; j++) 
			{
				if(a[i][j] == 3) {
					dem++;
				}
				else if(a[i][j]== 1) {
					dem--;
				}
			}
			if(dem > 0) {
				System.out.println(i);
			}
		}
	}
	public static void ktcaua(int[][] a, int n) {	
		int[] count = new int[n+1];
		for(int i = 1; i<= n; i++)
		{
			for(int j =1; j<= n ; j++) 
			{
				count[i] += a[i][j];
			}
		}
		int tmp=0;
		int b = 0;
		for(int i= 1; i<=n ;i++)
		{
			if(count[i] >= tmp) {
				tmp = count[i];b=i;
			}
		}
		System.out.println(b+" ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] a = new int[n+1][n+1];
		for(int i = 1; i<= n; i++)
		{
			for(int j =1; j<= n ; j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}
		// cau a
		ktcaua(a, n);
		// cau b	
		ktcaub(a, n);
		//cau c
		ktcauc(a, n);
		
	}
}
