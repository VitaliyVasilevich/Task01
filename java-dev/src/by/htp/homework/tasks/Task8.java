package by.htp.homework.tasks;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
//Определить, пройдет ли кирпич через отверстие. 
public class Task8 {
	public static void main(String[] args) {
		int A = 20;
		int B = 38;
		int x = 26;
		int y = 16;
		int z = 13;

		if ((z <= A) && (y <= B)) {
			System.out.println("Кирпич пройдет через отверстие");
		} else if ((z <= A) && (x <= B)) {
			System.out.println("Кирпич пройдет через отверстие ");
		} else if ((y <= B) && (x <= A)) {
			System.out.println("Кирпич пойдет через отверстие");
		} else if ((x <= A) && (z <= B)) {
			System.out.println("Кирпичь пройдет через отверстие");
		} else {
			System.out.println("Кирпич не пройдет через отверстие");
		}
	}
}
