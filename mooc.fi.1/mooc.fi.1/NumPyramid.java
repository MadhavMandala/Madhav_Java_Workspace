import java.util.Scanner;

public class NumPyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int stop = sc.nextInt();
		
		int i = stop;

		int printVal = 1;
		double powerOf = stop-1;
		
		double highestNum = Math.pow(2, powerOf);
		
		
		int maxLength = (int) (Math.log10(highestNum) + 1);
		System.out.println(maxLength);

		while(i>0) {
			for(int b = 0; b<stop-i; b++) {
				System.out.print("*");
			}
			double digitCount = Math.log10(printVal/2) + 1;
			if(digitCount < (Math.log10(printVal) + 1)) {
				
				for(int k = 0; k<digitCount; k++) {
					
				}
				
				for(int f = 0; f<digitCount*2; f++) {
					System.out.print("#");
				}
				
			}
			
			for(int a = 0; a<i; a++) {
				System.out.print(printVal);
				for (int r = 0; r<maxLength-(Math.log10(printVal) + 1); r++) {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
			printVal*=2;
			
			i--;
		}
	//This is push from Mac Air	
		
	}

}
