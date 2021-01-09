package by.htp.homework.task01;

//Программа вводит два числа a и b, если а > b, то программа вводит третье число с и 
//находит сумму b+c. Если а=b, то программа печатает слово «Конец». Если а<b, 
//то программа вводит третье число с, находит сумму a+b+c, выводит на экран сумму a+b+c и слова «Новый год!». 

public class Task07 {

	public static void main(String[] args) {
		double a = 15;
		double b = 18;
		double res;
		if (a > b) {
			int c = 5;
			res = b + c;
		} else if (a == b) {
			System.out.println("Конец");
		} else {
			int c = 7;
			res = a + b + c;
			System.out.println("Новый год!");
		}

	}

}
