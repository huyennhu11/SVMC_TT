package buoi3;

import java.util.HashSet;
import java.util.Scanner;
//7 1 . . 7 5 . . .
//. 7 . . . . . . .
//. . . . 8 3 . . .
//. . 8 . .  7 . 6 .
//. . . . . 2 . . .
//. 1 . 2 . . . . .
//. 2 . . 3 . . . .
public class Sudoku {
	public static boolean isValidSudoku(char[][] a) {
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<9;i++)
            for(int j = 0;j<9;j++)
                if(a[i][j]!='.')
                {
                    if(!hs.add(a[i][j] + "" + i)||
                       !hs.add(a[i][j] + ""+j ) ||
                       !hs.add(a[i][j] + ""+ i/3 +":"+j/3))
                            return false;break;
                }
                               
        return true;
    }
	public static void main(String[] args) {
	
	        Scanner  sc = new Scanner(System.in);
	    	char[][] a = new char[10][10];
	    	for(int i = 0; i<9; i++) {
	    		for(int j =0; j< 9; j++) {
	    			a[i][j] = sc.next().charAt(0);
	    		}
	    	}
	    	if(isValidSudoku(a)== true) {
				System.out.println("1");
			}
	    	if(isValidSudoku(a)==  false) {
				System.out.println("0");
			}
	    	for(int i = 0; i<9; i++) {
	    		for(int j =0; j< 9; j++) {
	    			System.out.print(a[i][j]+" "); 
	    		}
	    		System.out.println();
	    	}
	}
	
}
