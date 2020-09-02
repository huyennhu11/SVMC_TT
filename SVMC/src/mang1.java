import java.util.Scanner;

public class mang1 {
	public static void main(String[] args) {
		int[] a = new int[100];
		int[] b = new int[100];
		int m, n;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		for (int i= 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		n = sc.nextInt();
		for (int i= 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < m;i++) {
			int dif = 1;
			for(int j=0; j < n; j++) {
				if(a[i] == b[j]) {
					dif =0;
					break;
				}
			}
			if(dif == 1) {
				System.out.print(a[i]+" ");
			}
		}
 	}
}
