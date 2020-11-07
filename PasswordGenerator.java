
/*5.	Генератор за пароли
Да се напише програма, която чете две цели числа n и l,
 въведени от потребителя, и генерира по азбучен ред всички
  възможни  пароли, които се състоят от следните 5 символа:
•	Символ 1: цифра от 1 до n.
•	Символ 2: цифра от 1 до n.
•	Символ 3: малка буква измежду първите l букви на латинската азбука.
•	Символ 4: малка буква измежду първите l букви на латинската азбука.
•	Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.
Вход
Входът се чете от конзолата и се състои от две цели числа n и l в интервала [1…9], по едно на ред.
Изход
На конзолата трябва да се отпечатат всички пароли по азбучен ред, разделени с интервал.
Примерен вход и изход
вход	изход
2
4	11aa2 11ab2 11ac2 11ad2 11ba2 11bb2 11bc2 11bd2 11ca2 11cb2 11cc2 11cd2 11da2 11db2 11dc2 11dd2
3
1	11aa2 11aa3 12aa3 21aa3 22aa3
3
2	11aa2 11aa3 11ab2 11ab3 11ba2 11ba3 11bb2 11bb3 12aa3 12ab3 12ba3 12bb3 21aa3 21ab3 21ba3 21bb3 22aa3 22ab3 22ba3 22bb3
4
2	11aa2 11aa3 11aa4 11ab2 11ab3 11ab4 11ba2 11ba3 11ba4 11bb2 11bb3 11bb4 12aa3 12aa4 12ab3 12ab4 12ba3 12ba4 12bb3 12bb4 13aa4 13ab4 13ba4 13bb4 21aa3 21aa4 21ab3 21ab4 21ba3 21ba4 21bb3 21bb4 22aa3 22aa4 22ab3 22ab4 22ba3 22ba4 22bb3 22bb4 23aa4 23ab4 23ba4 23bb4 31aa4 31ab4 31ba4 31bb4 32aa4 32ab4 32ba4 32bb4 33aa4 33ab4 33ba4 33bb4

 * */
import java.util.Scanner;
public class PasswordGenerator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int l = Integer.parseInt(scanner.nextLine());
		char alphbet;
		if (n>=1 && n<10 && l>=1 && l<10) {	
			for (int simbolOne = 1; simbolOne <=n; simbolOne++) {	
				for (int simbolTwo = 1; simbolTwo <=n; simbolTwo++) {	
					for (char simbolThri = 'a'; simbolThri < 'a' + l; simbolThri++) {
						for (char simbolFour = 'a'; simbolFour < 'a' + l; simbolFour++) {
							for (int simbolFive = 1; simbolFive <=n; simbolFive++) {
								if (simbolFive>simbolOne && simbolFive>simbolTwo) {
									System.out.printf("%d%d%c%c%d ",simbolOne,simbolTwo,simbolThri,simbolFour,simbolFive);
								}
							}			
						}						
					}							
				}
			}
		} else {
			System.out.print("Inavlid number for n and l !\n You must insert (1...9).");
		}
	}
}
