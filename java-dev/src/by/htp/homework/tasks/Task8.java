package by.htp.homework.tasks;
//������ ������� �, � �������������� ��������� � ������� �, �, z �������. 
//����������, ������� �� ������ ����� ���������. 
public class Task8 {
	public static void main(String[] args) {
		int A = 20;
		int B = 38;
		int x = 26;
		int y = 16;
		int z = 13;

		if ((z <= A) && (y <= B)) {
			System.out.println("������ ������� ����� ���������");
		} else if ((z <= A) && (x <= B)) {
			System.out.println("������ ������� ����� ��������� ");
		} else if ((y <= B) && (x <= A)) {
			System.out.println("������ ������ ����� ���������");
		} else if ((x <= A) && (z <= B)) {
			System.out.println("������� ������� ����� ���������");
		} else {
			System.out.println("������ �� ������� ����� ���������");
		}
	}
}
