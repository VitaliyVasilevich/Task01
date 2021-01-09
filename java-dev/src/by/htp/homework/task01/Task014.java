package by.htp.homework.task01;

//Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, 
//и в четвертую степень — отрицательные. 
public class Task014 {

	public static void main(String[] args) {
		double a = 10.5;
		double b = 8;
		double c = 15.1;
		if (a <= 0) {
			a = Math.pow(a, 4);
		} else {
			a *= a;
		}
		if (b < 0) {
			b = Math.pow(b, 4);
		} else {
			b *= b;
		}
		if (c < 0) {
			c = Math.pow(c, 4);
		} else {
			c *= c;
		}
	}

}
