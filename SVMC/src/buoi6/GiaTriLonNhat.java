package buoi6;
//đề https://vn.spoj.com/problems/QMAX/
//https://vn.spoj.com/status/QMAX,huyennhu11/
import java.util.Scanner;

public class GiaTriLonNhat {
	static int N = 50005;
	static int n, q;
	static int[] a= new int[N];
	static int[] t= new int[N<<2];
	
	static void build(int k, int l, int r) {
		if (l == r) {
			t[k] = a[l]; return;
		}
		int m = (l+r)>>1;
		build(k<<1, l, m);
		build(k*2+1, m+1, r);
		t[k] = Math.max(t[k<<1], t[k*2+1]);
	}
	static int findMax(int k, int l, int r, int L, int R) {
		if (r < L || R < l) return 0;
		if (L <= l && r <= R) return t[k];
		int m = (l+r)>>1;
		return Math.max(findMax(k<<1, l, m, L, R), findMax(k*2+1, m+1, r, L, R));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		q = sc.nextInt();
		while (q-- != 0) {
			int l, r, k;
			l = sc.nextInt();
			r= sc.nextInt();
			k = sc.nextInt();
			a[l] += k;
			a[r+1] -= k;
		}
		for(int i=2; i<=n;i++) {
			a[i] += a[i-1];
		}

		build(1,1,n);
		q = sc.nextInt();
		while (q-- != 0) {
			int l, r;
			l = sc.nextInt();
			r= sc.nextInt();
			System.out.println(findMax(1,1,n,l,r));
		}

	}

}
