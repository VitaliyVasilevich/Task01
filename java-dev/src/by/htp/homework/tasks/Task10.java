package by.htp.homework.tasks;
//� ������� ��������� while �������� ��������� ������ ���� ������ ����� � ��������� �� 2 �� 100 ������������. 
public class Task10 {
	public static void main(String[] args) {
		int x = 2;
		while (x <= 100) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		}
	}
}
