
/*4.	Train the Trainers
Курсът "Train the trainers" е към края си и финалното оценяване наближава.
 Вашата задача е да помогнете на журито което ще оценява презентациите,
  като напишете програма в която да изчислява средната оценка от представянето
   на всяка една презентация от даден студент, а накрая средният успех от всички тях.
От конзолата на първият ред се прочита броят на хората в журито n - цяло число
 в интервала [1…20]
След това на отделен ред се прочита името на презентацията - текст
За всяка една презентация на нов ред се четат n - на брой оценки - реално число
 в интервала [2.00…6.00]
След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
 "{името на презентацията} - {средна оценка}."
След получаване на команда "Finish" на конзолата се печата
 "Student's final assessment is {среден успех от всички презентации}." и програмата приключва.
Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.
Примерен вход и изход
Вход	Изход	Обяснения
2
While-Loop
6.00
5.50
For-Loop
5.84
5.66
Finish	While-Loop - 5.75.
For-Loop - 5.75.
Student's final assessment is 5.75.	2 – броят на хората в журито следователно ще получаваме по 2 оценки на презентация.
(6.00 + 5.50) / 2 = 5.75
(5.84 + 5.66) / 2 = 5.75
(6.00 + 5.50 + 5.84 + 5.66) / 4 = 5.75 
Вход	Изход	Вход	Изход
3
Arrays
4.53
5.23
5.00
Lists
5.83
6.00
5.42
Finish	Arrays - 4.92.
Lists - 5.75.
Student's final assessment is 5.34.	2
Objects and Classes
5.77
4.23
Dictionaries
4.62
5.02
RegEx
2.88
3.42
Finish	Objects and Classes - 5.00.
Dictionaries" - 4.82.
RegEx - 3.15.
Student's final assessment is 4.32.
 * */
import java.util.Scanner;
public class TrainTheTrainers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		if (n>=1 && n<=20) {
			int count = 0;
			int countNumber =0;
			double value = 0;
			double average=0;
			double averageSecond=0;
			double value2=0;
			double value3=0;
			boolean stopLoop = false;
			String textStudents = scanner.nextLine();
		 while (!textStudents.equals("Finish")) {
			 stopLoop = false;
			 while (count!=n) {
				value=Double.parseDouble(scanner.nextLine());			
				if (value>=2 && value<=6) {
					count+=1;
					countNumber+=1;
					value2+=value;
					value3+=value;
					averageSecond = value2/(1.0*n);
					 if (count==n) {
						 System.out.printf(textStudents+" - %.2f.%n",averageSecond);
						 textStudents = scanner.nextLine();
						 value2=0;
						 count=0;
						break;
					}	 
				} else {
					System.out.println("Invalid value!");
					break;
				}		
			}
			 average = value3/(1.0*countNumber);
			 if (textStudents.equals("Finish")) {
				 stopLoop = true;
				 break;
			}
		}
		if (stopLoop) {			
			System.out.printf("Student's final assessment is %.2f.",average);
		}
		}else {
			System.out.println("Invalid parameter! Plaes insert 1..20");
		}
	}
}
