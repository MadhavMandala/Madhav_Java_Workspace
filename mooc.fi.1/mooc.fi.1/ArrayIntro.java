
public class ArrayIntro {

	public static void main(String[] args) {
		
		int[] grades = {90, 85, 67, 100, 93, 62, 38};
		
		
		for (int i = 0; i<grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		
		
		int[] example = {1, 2, 3, 4, 5, 6};
		
		int[] secExample = new int[10];
		
		secExample[7] = 14;
		secExample[3] = 6;
		
		
		
		
		for(int i = 0; i<secExample.length; i++) {
			System.out.print(secExample[i] + " ");
		}
		//test commit after project setup
		
	}

}
