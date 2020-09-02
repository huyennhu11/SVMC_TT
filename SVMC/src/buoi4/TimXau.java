package buoi4;

import java.util.Scanner;

public class TimXau {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int count = 0;
		for(int i = 0; i < s.length() - t.length(); i++) {
			String tmp = s.substring(i, i + t.length());
			if(tmp.equals(t)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
