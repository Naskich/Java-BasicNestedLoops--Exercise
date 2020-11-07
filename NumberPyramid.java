import java.util.Scanner;
public class NumberPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		int current = 1;
		boolean stopCommand = false;
		for (int i = 1; i <= number ; i++) {
			
			for (int j = 1; j <= i; j++) {
				if (current>number) {
					stopCommand=true;
					break;
				}
				System.out.print(current+" ");
				++current;
			}
			if (stopCommand) {
				break;
			}
			System.out.println();
		}
	}
}
