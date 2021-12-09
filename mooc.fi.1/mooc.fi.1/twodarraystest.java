
public class twodarraystest {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int i = 0;
		int j = 0;
		int num = 0;
		for(i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				arr[i][j] = num;
				num++;
				System.out.print(i + " " + j + "     ");; 
			}
			System.out.println(" ");
		}
	}
	
}
