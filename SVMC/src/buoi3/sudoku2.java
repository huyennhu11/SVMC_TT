package buoi3;

import java.util.ArrayList;
import java.util.Scanner;
//. . . 1 4 . 2 . .
//. . 6 . . . . . .
//. . . . . . . . .
//. . 1 . . . . . .
//. 6 7 . . . . . 9
//. . . . . . 8 1 .
//. 3  . . . . . . 6
//. . . . . 7 . . .
//. . . 5 . . . 7 .
public class sudoku2 {
	 public static boolean isValidSudoku(char[][] a) {      
	        int k=0;
	        for(int i=0;i<9;i++)
	        {
	            ArrayList<Integer> row=new ArrayList<>();
	            for(int j=0;j<9;j++)
	            {
	                if(a[i][j]!='.')
	                    row.add(Character.getNumericValue(a[i][j]));
	            }
	            
	            if(validate(row)==false)
	                return false;
	        }
	        
	        
	        for(int i=0;i<9;i++)
	        {
	            ArrayList<Integer> col=new ArrayList<>();
	            for(int j=0;j<9;j++)
	            {
	                if(a[j][i]!='.')
	                    col.add(Character.getNumericValue(a[j][i]));
	            }
	            
	            if(validate(col)==false)
	                return false;
	        }
	        
	        for(int i=0;i<9;i+=3)
	        {
	            for(int j=0;j<9;j+=3)
	            {
	                ArrayList<Integer> grid=new ArrayList<>();
	                for(int bx=i;bx<i+3;bx++)
	                {
	                    for(int by=j;by<j+3;by++)
	                    {
	                        if(a[bx][by]!='.')
	                            grid.add(Character.getNumericValue(a[bx][by]));
	                    }
	                }
//	                System.out.println(grid);
	                if(validate(grid)==false)
	                    return false;
	            }
	        }
	        return true;
	    }
	    public static boolean validate(ArrayList<Integer> arr)
	    {
	        int freq[]=new int[9];
	        for(int i:arr)
	        {
	            if(freq[i-1]==1)
	                return false;
	            else
	                freq[i-1]++;
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
				System.out.println("# "+1);
			}else {
				System.out.println("#" +0);
			}
	    	for(int i = 0; i<9; i++) {
	    		for(int j =0; j< 9; j++) {
	    			System.out.print(a[i][j]+" "); 
	    		}
	    		System.out.println();
	    	}
	    }
}
