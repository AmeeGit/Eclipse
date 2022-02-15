package homeworkJAVA;
import java.util.Scanner;

public class StudentMarksArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks in array:");

		int sum = 0, average = 0, i;
		int marks[] = new int[5];

		for (i = 0; i < marks.length; i++) {
			int num = sc.nextInt();

			sum = sum + marks[i];
			System.out.println(sum); // sum of marks

			average = sum / 5;
			System.out.println(average); // average value of marks

		}
	}
}
