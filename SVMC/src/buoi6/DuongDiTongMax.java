package buoi6;
//Href: https://vn.spoj.com/problems/QBMAX/
//https://vn.spoj.com/status/QBMAX,huyennhu11/

import java.util.Scanner;

public class DuongDiTongMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		int[][] a= new int[102][102];
		int[][] b= new int[102][102];
		int max,max1=-10000;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for(int i=1;i<=n;i++)
		  for(int j=1;j<=m;j++)
		    a[i][j] = sc.nextInt();
		for(int j=1;j<=m;j++){ 
			b[0][j]=-10000; b[n+1][j]=-10000; 
		  }
		  
		for(int i=1;i<=n;i++)
		  b[i][1]=a[i][1];
		for(int j=2;j<=m;j++)
		  for(int i=1;i<=n;i++)
		    {
		    if(b[i-1][j-1]>b[i][j-1])
		       max=b[i-1][j-1];
		    else max=b[i][j-1];
		    if(max<b[i+1][j-1])
		      max=b[i+1][j-1];
		    b[i][j]=max+a[i][j];
		    }
		for(int i=1;i<=n;i++)
		  if(b[i][m]>max1)
		    max1=b[i][m];
		System.out.print(max1+" ");

}
}