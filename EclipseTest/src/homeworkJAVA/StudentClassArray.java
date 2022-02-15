package homeworkJAVA;

public class StudentClassArray {

	public static void main(String[] args) {

		int m[] = { 55, 69, 85, 36, 98 };
		int mini = m[0];

		for (int i = 0; i < m.length; i++)
			if (mini > m[i]) {                 // minimum marks
				mini = m[i];
       }
		{
			System.out.println(mini);
			}
  int maxi= m[0];
  for (int i=0; i<m.length;i++)
   if (maxi<m[i]) {
	  maxi=m[i]; 
   }
  System.out.println(maxi);                   // maximum marks

	int sum = 0;
	for (int i=0; i<m.length;i++) {
		sum =sum + m[i];
		}
	System.out.println(sum);         // sum of marks
	
		
	System.out.println(sum*100/500);    // Average marks
}
}
