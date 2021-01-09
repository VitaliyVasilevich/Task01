package by.htp.homework.task01;

//Программа вводит два числа a и b, если a=b, то вывести на экран слова «скоро Новый Год!»,
//в противном случае ввести третье число с и вывести на экран 3 строки :
// -значение выражения a+b+c 
// -значение  выражения a^2 + b^2 
// -«моя любимая футбольная команда»

public class Task08 {

	public static void main(String[] args) {
		byte a = 30;
		byte b = 44;
		if (a == b) {
			System.out.println("скоро Новый Год!");
		} else {
			byte c = 10;
			System.out.println(a + b + c);
			System.out.println(Math.pow(a, 2) + Math.pow(b, 2));
			System.out.println("моя люимая футбольная команда");

		}

	}

}
