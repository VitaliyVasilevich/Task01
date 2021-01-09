package by.htp.homework.tasks;
// Найти НОД двух целых положительных чисел. 
public class Task15 {

	public static void main(String[] args) {
		double a = 24;
		double b = 6;
		double result = 0;

		while (true) {
			if (a > b) {
				if (a % b == 0) {
					result = b;
					break;
				} else {
					a = a % b;
				}
			} else {
				if (b % a == 0) {
					result = a;
					break;
				} else {
					b = b % a;
				}
			}
		}
	}
}
