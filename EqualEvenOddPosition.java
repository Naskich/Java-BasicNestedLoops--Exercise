import java.util.Scanner;
public class EqualEvenOddPosition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberA = Integer.parseInt(scanner.nextLine());
		if (numberA>=100000 && numberA<=300000) {
			int numberB = Integer.parseInt(scanner.nextLine());
			if (numberB>=100000 && numberB<=300000 && numberB>numberA) {
				for (int i = numberA; i <=numberB; i++) {
					String numberSum = "" + i;
					int OddSum = 0;
					int Event = 0;
					for (int j = 0; j < numberSum.length(); j++) {
						int numberLast = Integer.parseInt( ""+ numberSum.charAt(j));
						if (j%2==0) {
							Event += numberLast;
						} else {
							OddSum += numberLast;
						}
					}
					if (Event==OddSum) {
						System.out.print(i +" ");
					}
				}
			}else {
				System.out.print("Inavalid number B or B < A!");	
			}
		} else {
		 System.out.print("Inavalid number!");	
		}
	}
}
