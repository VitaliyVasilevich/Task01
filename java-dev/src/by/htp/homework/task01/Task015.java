package by.htp.homework.task01;

//��������� ��������� ��� ���������� �������� �������  F(x) �� ������� [�, b] � ����� h. 
//��������� ����������� � ���� �������, ������ ������� ������� � ��������  ���������, 
//������ - ��������������� �������� �������. 
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
