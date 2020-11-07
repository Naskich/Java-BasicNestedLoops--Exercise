import java.util.Scanner;
public class SumPrimeNonPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		int numberPositive=0;
		int numberNegative=0;
		boolean command = false;		
		while (!number.equals("stop")) {
				int count=0;
				int positiveNegativeNumber = Integer.parseInt(number);
				if (positiveNegativeNumber<=2147483647 && positiveNegativeNumber>=-2147483648  ) {			
				if (positiveNegativeNumber<0) {
					command=true;
				}
				for (int i = 1; i <= positiveNegativeNumber; i++) {
					if (positiveNegativeNumber%i==0) {
						count++;
					}			
				}
					if (count<=2 && count>=1) {
						   numberPositive+=positiveNegativeNumber;
					}  else if (count>2) {
						numberNegative+=positiveNegativeNumber;
					}
				number = scanner.nextLine();
				} else {
					break;
				}
			}
				if (number.equals("stop")) {
					if (command) {	
						System.out.printf("Number is negative.\n");
						System.out.printf("Sum of all prime numbers is: %d%n",numberPositive );
						System.out.printf("Sum of all non prime numbers is: %d",numberNegative );
					} else {					
						System.out.printf("Sum of all prime numbers is: %d%n",numberPositive );
						System.out.printf("Sum of all non prime numbers is: %d",numberNegative );		
					}
		}			
	}
}
