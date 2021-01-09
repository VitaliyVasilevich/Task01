package by.htp.homework.tasks;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
public class Task2 {
	public static void main(String[] args) {
		double a = 20.8;
		double b = 5.2;
		double c = 12;
		double d = 0;
		double result;

		if (c == 0.0 || d == 0.0) {
			System.out.print("В знаминателе ноль");
			return;
		}
		result = (a / c) * (b / d) - ((a * b - c) / (c * d));
	}
}
