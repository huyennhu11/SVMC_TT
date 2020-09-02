import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
//		FileReader fr = new FileReader("C:\\Users\\huyen\\eclipse-workspace\\Buoi1\\input.txt");
//		Scanner sc = new Scanner(fr);
		Scanner sc = new Scanner(System.in);
		int a= 1;
		
//		System.out.print(a);
		while(a != 42) {
			a = sc.nextInt();
			System.out.println(a);
			
			
		}
	}
}
