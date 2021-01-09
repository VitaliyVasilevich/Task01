package by.htp.homework.task01;

//—оставить программу дл€ вычислени€ значений функции  F(x) на отрезке [а, b] с шагом h. 
//–езультат представить в виде таблицы, первый столбец которой Ц значени€  аргумента, 
//второй - соответствующие значени€ функции. 
//F(x) = 2 * Math.tan(x / 2) + 1;
public class Task015 {

	public static void main(String[] args) {
		double a = -3;
		double b = 5.5;
		double h = 2;
		double x = a;
		double F;
		while ((x >= a) && (x <= b)) {
			F = 2 * Math.tan(x / 2) + 1;
			System.out.println("x = " + x + " F = " + F);
			x = x + h;
		}
	}

}
