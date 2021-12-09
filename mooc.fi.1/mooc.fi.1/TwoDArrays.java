
public class TwoDArrays {

	public static void main(String[] args) {
		
		
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		int[][] twoDArray = new int[5][5]; 
		
		
		
		/*
		int[][] tooDArray = {{1,2,3,4,5}, {2,4,6,8,10}, {3,6,9,12,15}, {4,8,12,16,20}, {5,10,15,20,25}};
		
		
		for(int i = 0; i<tooDArray.length; i++) {
			
			for(int j = 0; j<tooDArray[0].length; j++) {
				System.out.print(tooDArray[i][j] + "   ");
				
			}
			System.out.println();
		}
		*/
		
		
		for(int i = 1; i<=10; i++ ) {
			for(int j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
