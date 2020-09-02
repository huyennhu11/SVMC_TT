package btvn;

import java.util.Scanner;

public class DayconTangDainhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= new int[1001];
		int[] l= new int[1001];
		int m = sc.nextInt();
		int lenmax = 0;
		for( int i=0;i<m;i++) {
			a[i] = sc.nextInt();
			l[i] = 1 ;
			for( int j=0;j<i;j++)
				if ( l[j] + 1 > l[i] && a[i] > a[j] ) l[i] = l[j] + 1 ;
			if ( l[i] > lenmax ) lenmax = l[i] ;
		}
		System.out.print(lenmax);
	}
}
