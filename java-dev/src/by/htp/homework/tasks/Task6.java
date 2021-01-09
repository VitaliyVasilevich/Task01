package by.htp.homework.tasks;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
//и если да, то будет ли он прямоугольным. 
public class Task6 {
	public static void main(String[] args) {
		double angle1 = 120;
		double angle2 = 55;
		if (angle1 + angle2 < 180) {
			System.out.print("Треугольник существует, ");
			if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90) {
				System.out.print("и он прямоугольный");
			} else {
				System.out.print("и он не прямоугольный");
			}
		} else {
			System.out.print("Труегольник не существует");
		}

	}
}
