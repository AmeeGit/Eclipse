package homeworkJAVA;
import java.util.Scanner;

public class DiamondPatern {

	public static void main(String[] args) {

		int row, i, j, count = 1;
		
		 System.out.print("Enter the number of rows you want to print: "); 
		 Scanner sc=new Scanner(System.in); 
		 row = sc.nextInt();
		
		count = row - 1; //space 2 1 0
		for (j = 0; j <= row; j++) {
			for (i = 0; i <= count; i++) {
				System.out.print(" ");
			}
			count--;
			//System.out.print(j);
			for (i = 0; i <= j - 1; i++) {
			//	System.out.print(j);
				System.out.print(" " + j);
			}
			
              System.out.println("");
		}
		
		count = 1;
		
		for (j = 0; j <= row - 1; j++) {
			for (i = 1; i <= count; i++) {
				System.out.print(" ");
			}
			count++;
			for (i = 0; i <= (row - j) - 2; i++) {
				System.out.print(" " + (row-j-1));
			}

			System.out.println("");
		}
	}
}