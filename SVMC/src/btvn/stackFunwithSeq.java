 package btvn;

import java.util.Scanner;
import java.util.Stack;

public class stackFunwithSeq {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); 
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		for(int i = 0; i < n; i++) 
        { 
			i = sc.nextInt();
            stack.push(i); 
        } 
		for(int i = 0; i < n; i++) 
        { 
            int j = stack.pop(); 
            System.out.print(j);
        } 
	}
}
