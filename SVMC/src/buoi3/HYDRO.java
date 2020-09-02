package buoi3;
//2
//3
//2 0 2
//6
//3 0 0 2 0 4
import java.util.Scanner;

public class HYDRO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] a = new int[10000];
//		int[] b = new int[T+1];
		while(T != 0) 
		{ 
			int n = sc.nextInt();
			for(int i=1; i<= n; i++){
				a[i] = sc.nextInt();
			}
			int m = Math.min(a[1], a[n]);
			int t = 0;
			for(int i = 1; i < n; i++) {
				t += ( m - a[i]);
			}
			System.out.println(t);
////			b[T] = t;			
//			T--;
		}
//		for(int i = 1 ;i <=  T; i++) {
//			System.out.println(b[i]+" ");
//		}
	}

}
