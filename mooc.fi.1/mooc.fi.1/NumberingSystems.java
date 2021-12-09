import java.util.Scanner;

public class NumberingSystems {

	public static int BtoD(String str) {
		int result = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '1') {

				result += Math.pow(2, ((str.length() - 1) - i));

			}

		}

		return result;

	}

	public static int OtoD(String str) {
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			int digitVal = str.charAt(i) - '0';
			int power = str.length() - i - 1;
			result += digitVal * Math.pow(8, power);
		}
		return result;

	}

	public static int HtoD(String str) {
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			int digitVal = str.charAt(i) - '0';
			if (str.charAt(i) - '0' > 9) {
				digitVal -= 7;
			}

			int power = str.length() - i - 1;
			result += digitVal * Math.pow(16, power);
		}
		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean correctVal = true;
		do {
			System.out.println("From what Base do you want to Convert?(enter bianary, octal, or hexadecimal");
			String type = sc.nextLine();
			if ("bianary".equalsIgnoreCase(type)) {

				System.out.println("Enter a Bianary Value:");
				String str = sc.nextLine();
				System.out.println(BtoD(str));

			}

			if ("octal".equalsIgnoreCase(type)) {

				System.out.println("Enter an Octal Value:");
				String str = sc.nextLine();
				System.out.println(OtoD(str));

			}

			if ("hexadecimal".equalsIgnoreCase(type)) {

				System.out.println("Enter an Hexadecimal Value:");
				String str = sc.nextLine();
				System.out.println(HtoD(str));

			}
		} while (correctVal);

	}

}
