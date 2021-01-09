package by.htp.homework.tasks;
//  Подсчитать количество отрицательных среди чисел а, b, с.  

public class Task3 {
	public static void main(String[] args) {
		double a = -42;
		double b = -11.4;
		double c = 3;
		int result = 0;

		if (a < 0) {
			result += 1;
		}
		if (b < 0) {
			result += 1;
		}
		if (c < 0) {
			result += 1;
		}
		System.out.println(result);
	}
}
