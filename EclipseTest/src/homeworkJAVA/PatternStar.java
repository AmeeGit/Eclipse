package homeworkJAVA;

public class PatternStar {

	public static void main(String[] args) {

		// i for rows and j for columns
		// row denotes the number of rows you want to print
		int i, j, row = 3;
		for (i = 0; i<=10; i++) {

			for (j = 0; j<=2; j++) 
			{

			System.out.print(" * ");
			//System.out.print( i+" i "+j+ " j ");
			}
			System.out.println();
		}
	}

}
