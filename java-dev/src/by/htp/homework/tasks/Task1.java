package by.htp.homework.tasks;
//��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������)
public class Task1 {
	public static void main(String[] args) {
		double a = 4;
		double b = 6.2;
		double c = 11;
		double result;
		if (a == 0.0) {
			System.out.print("� ����������� 0");
			return;
		}
		result = ((b + Math.sqrt(b * b + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
	}
}
