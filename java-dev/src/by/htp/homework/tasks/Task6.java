package by.htp.homework.tasks;
//���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, 
//� ���� ��, �� ����� �� �� �������������. 
public class Task6 {
	public static void main(String[] args) {
		double angle1 = 120;
		double angle2 = 55;
		if (angle1 + angle2 < 180) {
			System.out.print("����������� ����������, ");
			if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90) {
				System.out.print("� �� �������������");
			} else {
				System.out.print("� �� �� �������������");
			}
		} else {
			System.out.print("����������� �� ����������");
		}

	}
}
