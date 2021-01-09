package by.htp.homework.task01;

import java.util.Random;

//Программа запрашивает количество чисел, затем вводит целые числа в соответствии 
//с указанным количеством. Определяет количество четных, сумму кратных 3-м и 
//количество чисел, модуль которых <3 
public class Task09 {
	public static void main(String[] args) {
		int count = 15;
		int[] arr = new int[count];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(50);
			System.out.print(arr[i] + "  ");
		}
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				a1 += 1;
			}
			if (arr[i] % 3 == 0) {
				a2 += arr[i];
			}
			if (Math.abs(arr[i]) < 3) {
				a3 += 1;
			}
		}
		
		System.out.println("\nКоличетсво четных чисел: " + a1);
		System.out.println("Сумма чисел кратных 3-м: " + a2);
		System.out.println("Количетсво чисел модуль которых <3: " + a3);

	}
}
