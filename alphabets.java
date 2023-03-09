package pattern_program;
import java.util.Scanner;
public class alphabets {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j==0 && i==n-1 && j==n-1) {
					System.out.println("*");
				}
				else {
					System.out.println(" ");
				}
			}
		}
		
		
	}
}