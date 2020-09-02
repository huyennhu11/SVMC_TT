package btvn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstDuplicate {
	public static int firstDuplicate(int[] a) 
    {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!set.add(a[i])) {
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int[] a = new int[100];
//       int[] save = new int[100];
       int n = sc.nextInt();
       for(int i = 1 ; i <= n; i++){
    	   a[i] = sc.nextInt(); 
//    	   save[a[i]]= i;
       }
       System.out.print(firstDuplicate(a));
    }
}
