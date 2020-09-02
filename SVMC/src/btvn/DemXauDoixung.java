package btvn;

import java.util.Scanner;

public class DemXauDoixung {
	public static boolean kt(String s) {
		boolean tmp= true;
		for(int i = 1; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-i+1) ){
				 tmp = false;
			}
		}
		return tmp ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String[] tmp = new String[100];
//		int n = sc.nextInt();
//		for(int i =0; i < n; i++) {
//			tmp[i] = sc.nextLine();
//		}
		
		String s = "nuuun";
		if(kt(s)== true) System.out.print("ok");
	}
}
