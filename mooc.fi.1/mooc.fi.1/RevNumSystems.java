import java.util.Scanner;

public class RevNumSystems {

	public static int DtoB(int num) {
		int highestPow = 0;
		int finalAns = 0;
		for (int i = 0; i <= num; i++) {
			if (Math.pow(2, i) >= num) {
				highestPow = i - 1;
				break;
			}
		}
		for (int i = highestPow; i >= 0; i--) {
			if (Math.pow(2, i) <= num) {
				num -= Math.pow(2, i);
				finalAns *= 10;
				finalAns += 1;
			} else {
				finalAns *= 10;
			}
		}
		return finalAns;
	}
	
	public static int DtoO(int num) {
		int highestPow = 0;
		int finalAns = 0;
		int digitVal = 0;
		for (int i = 0; i <= num; i++) {
			if (Math.pow(8, i) >= num) {
				highestPow = i - 1;
				break;
			}
		}
		for (int i = highestPow; i >= 0; i--) {
			digitVal = (int) (num/Math.pow(8, i));
			if (digitVal*Math.pow(8, i) <= num) {
				num -= digitVal*Math.pow(8, i);
				finalAns *= 10;
				finalAns += digitVal;
			} else{
				finalAns *= 10;
			}
		}
		return finalAns;
	}
	
	public static String DtoH(int num) {
		String hexValue  = "";
		int highestPow = 0;
		int digitVal = 0;
		for (int i = 0; i <= num; i++) {
			if (Math.pow(16, i) >= num) {
				highestPow = i - 1;
				break;
			}
		}
		for (int i = highestPow; i >= 0; i--) {
			digitVal = (int) (num/Math.pow(16, i));
			if (digitVal > 9) {
				switch(digitVal) {
				case 10:
					hexValue += "A";
					break;
				case 11: 
					hexValue += "B";
					break;
				case 12: 
					hexValue += "C";
					break;
				case 13: 
					hexValue += "D";
					break;
				case 14: 
					hexValue += "E";
					break;
				case 15: 
					hexValue += "F";
					break;
				}
			}else if (digitVal*Math.pow(16, i) <= num) {
				num -= digitVal*Math.pow(16, i);
				hexValue += Integer.toString(digitVal);
			} 	
			
		}
		return hexValue;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			System.out.println("Bianary Value: " + DtoB(num));
			System.out.println("Octal Value: " + DtoO(num));
			System.out.println("Hexadecimal Value: " + DtoH(num));
			System.out.println(" ");
			
		} while (true);

	}

}
