package buoi5;

import java.util.Scanner;

public class Palindrom {
	public static boolean isPaliny(String str) {
		int n = str.length();
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) != str.charAt(n - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		int n = scanner.nextInt();
		scanner.nextLine();
		String str = scanner.nextLine();
		int max = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				String tmp = str.substring(i, j);
				if(isPaliny(tmp)) {
					int len = j - i;
					max = (len > max) ? len : max;
				}
			}
		}
		System.out.println(max);
	}
}
