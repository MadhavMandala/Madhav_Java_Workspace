import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int stop = sc.nextInt();
		
		int i = 0;
		
		while(i<stop+1) {
			for(int b = 0; b<stop-i; b++) {
				System.out.print(" ");
			}
			
			for(int a = 0; a<i; a++) {
				System.out.print("x ");	
			}
			System.out.println("");
			
			i++;
		}
		
		
	}

}
