import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("Entered desired number for multi. table::: ");  //10
		
		int number1=number.nextInt(); 
		
		for (int i=1;i<=10;i++) 
		{
			System.out.println(number1 +"    X  " +i+ "=  "+(number1*i));
		}
    }
}


