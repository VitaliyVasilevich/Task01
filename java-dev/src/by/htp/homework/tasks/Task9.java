package by.htp.homework.tasks;

public class Task9 {

	public static void main(String[] args) {
		double x = 4;
		double Fx =0.0;
		if (x <= 3) {
			Fx = Math.pow(x, 2) - (3 * x) + 9;
		} else if (x > 3) {
			if ((Math.pow(x, 3) + 6) == 0) {
				System.out.println("Знаменатель равен нулю");
				return;
			}
			Fx = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.print(Fx);
	}

}
