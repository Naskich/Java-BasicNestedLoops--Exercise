
/*6.	Специални числа
Да се напише програма, която чете едно цяло число N, въведено от потребителя,
 и генерира всички възможни "специални" числа от 1111 до 9999. За да бъде "специално"
  едно число, то трябва да отговаря на следното условие: 
•	N да се дели на всяка една от неговите цифри без остатък.
Пример: при N = 16, 2418 е специално число:
•	16 / 2 = 8 без остатък
•	16 / 4 = 4 без остатък
•	16 / 1 = 16 без остатък
•	16 / 8 = 2 без остатък
Вход
Входът се чете от конзолата и се състои от едно цяло число в интервала [1…600000]
Изход
На конзолата трябва да се отпечатат всички "специални" числа, разделени с интервал
Примерен вход и изход
вход	изход	коментари
3	1111 1113 1131 1133 1311 1313 1331 1333 3111 3113 3131 3133 3311 3313 3331 3333	3 / 1 = 3 без остатък
3 / 3 = 1 без остатък
3 / 3 = 1 без остатък
3 / 3 = 1 без остатък
11	1111
*/
import java.util.Scanner;
public class specialNumbersIzpitna {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberN = Integer.parseInt(scanner.nextLine()); //3
		if (numberN>=1 && numberN<=600000 ) {	
			int currentFirst=0;
			int currentTwo=0;
			int currentThird=0;
			int currentFour=0;
							for (int i = 1; i <=9; i++) {
								currentFirst=0;
								if (numberN%i==0 ) {
									currentFirst+=i; 		
									for (int y = 1; y <=9; y++) {
										 currentTwo=0;
										if (numberN%y==0 ) {
											currentTwo+=y;			
											for (int j = 1; j <=9; j++) {
												 currentThird=0;
												if (numberN%j==0) {
													currentThird+=j;	
													for (int h = 1; h <=9; h++) {
														 currentFour=0;
														if (numberN % h==0) {
															currentFour+=h;	
															boolean numberOne = numberN % currentFirst==0; 
															boolean numberTwo = numberN % currentTwo==0; 
															boolean numberThird = numberN % currentThird==0; 
															boolean numberFuor = numberN % currentFour==0; 
															if (numberOne && numberTwo && numberThird && numberFuor) {
											System.out.printf("%d%d%d%d ",currentFirst,currentTwo,currentThird, currentFour);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
		System.out.print("Invalid number fot N you must insert 1...600000!");
		}
	}
}