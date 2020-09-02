package btvn;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import java.util.*;

public class FriendOfFriend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] friendId = new int[n+1];
		int[] a = new int[100];
		HashSet<String> set=new HashSet();
		for(int i = 0; i < n ; i++) 
		{
			friendId[i] =sc.nextInt();
			String  k = String.valueOf(friendId[i]);
			set.add(k);
			int m = sc.nextInt();
			for(int j = 0 ; j < m; j++) {
			    a[j] = sc.nextInt();
//			    System.out.print(a[j]+" ");
			    String s = String.valueOf(a[j]);
				set.add(s);
			}
		}
		System.out.println();
		int count =0;
        count = count -n;
        for (String str : set) {
        	count ++;    
        }
        System.out.println(count); 
	}
}
