package buoi5;

import java.util.Scanner;

public class PalindromeDainhat {
	static int N = 50005;
	static long MM = (long)1000000007 * 1000000007;
	
	static long[] H= new long[50005];
	static long[] R= new long[50005];
	static long[] power = new long[50005];
	static char[] s = new char[50005];
	static int n;
	static int getHash(int i, int j)
    { return (int) ((H[j] - H[i - 1] * power[j - i + 1] + MM) % 1000000007); }
	static int getRash(int i, int j)
    { return (int) ((R[i] - R[j + 1] * power[j - i + 1] + MM) % 1000000007); }
	static boolean isPalin(int i, int j)
    { return getHash(i, j) == getRash(i, j); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		scanf("%d\n%s", &n, s + 1);
//	    REP(i, 1, n) H[i] = (H[i - 1] * 26 + s[i] - 'a') % MOD;
//	    REPD(i, n, 1) R[i] = (R[i + 1] * 26 + s[i] - 'a') % MOD;
//	    power[0] = 1;
//	    REP(i, 1, n) power[i] = power[i - 1] * 26 % MOD;
//	    int ans = 0;
//	    REP(i, 1, n) {
//	        // even palindrome
//	        int l = 0, r = min(i, n - i);
//	        while (l <= r) {
//	            int mid = l + r >> 1;
//	            if (isPalin(i - mid + 1, i + mid))
//	                ans = max(ans, mid << 1), l = mid + 1;
//	            else
//	                r = mid - 1;
//	        }
//	        // odd palindrome
//	        l = 0, r = min(i - 1, n - i);
//	        while (l <= r) {
//	            int mid = l + r >> 1;
//	            if (isPalin(i - mid, i + mid))
//	                ans = max(ans, mid << 1 | 1), l = mid + 1;
//	            else
//	                r = mid - 1;
//	        }
//	    }
//	    printf("%d\n", ans);
//	    return 0;
//	
	}
}
