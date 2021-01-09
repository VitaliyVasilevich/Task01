package by.htp.homework.tasks;
// Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации. 
public class Task7 {
public static void main(String[] args) {
	double A = 140;
	double res = 0.0;
	res = A*Math.pow(10, -3);
	System.out.println(A+" байт = "+res+" Кбайт");
}
}
