package buoi3;

import java.util.Scanner;

public class TongBinhPhong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int T= 0;
		for(int i =a; i <=b; i++) {
			T += i*i;
		}
		System.out.print(T);
	}
}
